package dev.credit.creditsystem.service;

import dev.credit.creditsystem.exception.*;
import dev.credit.creditsystem.model.User;
import dev.credit.creditsystem.repository.CreditRepository;
import dev.credit.creditsystem.repository.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    public static String UpdatedInfo;
    private final UserRepository userRepository;
    private final CreditRepository creditRepository;
    List<User> userList;
    public UserService(UserRepository userRepository, CreditRepository creditRepository) {
        this.userRepository = userRepository;
        this.creditRepository = creditRepository;
    }
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(long Id) throws NotFoundException {
        if(userRepository.findById(Id).isPresent()) {
            return  userRepository.findById(Id).orElse(null);
        }
        else throw new NotFoundException("User NOT FOUND with database id "+Id);
    }


    public User getUserByIdentityNumber(long identityNumber) throws NotFoundException{
        if(userRepository.getUserByIdentityNumber(identityNumber)!=null)
            return userRepository.getUserByIdentityNumber(identityNumber);
        else throw new NotFoundException("User NOT FOUND with national id "+identityNumber);
    }


    public User saveUser(User user) {
        User foundUserByIdentityNumber = userRepository.getUserByIdentityNumber(user.getIdentityNumber());
        if(user.getId()==null) {
            System.out.println("----------------\n" + "the posted user doesn't have Database ID ,so it's saving process\n" + "----------------");
            if(foundUserByIdentityNumber!= null)
                throw new AlreadyExistsException("a user with identity number " + user.getIdentityNumber() + " Already exists !");
        }
        else {
            System.out.println("--------\n" + "the posted user does have Database ID ,so it's updating process\n" + "----------");
            User theOldData = userRepository.findById(user.getId()).get();
            if (foundUserByIdentityNumber != null) {
                if (user.getId() != foundUserByIdentityNumber.getId())
                    throw new AlreadyExistsException("a user with identity number " + user.getIdentityNumber() + " Already exists !");
                else if(theOldData.getSalary()!=user.getSalary() && theOldData.getCreditInfo()!=null){
                    creditRepository.delete(theOldData.getCreditInfo());
                    UpdatedInfo = "This user's credit data have to be updated because of changing occurred in user's salary !";
                }
            }else { 
                if(theOldData.getCreditInfo()!=null) {
                    creditRepository.delete(theOldData.getCreditInfo());
                    UpdatedInfo = "This user's credit data have to be updated because of changing occurred in user's identity number !";
                }
            }
        }
        if(user.getIdentityNumber()%2==1) throw new Invalid_ID_NumberException("the user's ID number is NOT VALID number it must end with even digit !    :)");
        
        return userRepository.save(user);
    }

    public User updateUserById(long id,User user){
        User found = userRepository.findById(id).orElseThrow(()->new NotFoundException("a user with identity number: "+id+" Not found !"));
        found.setCreditInfo(user.getCreditInfo());
        found.setFullName(user.getFullName());
        found.setIdentityNumber(user.getIdentityNumber());
        found.setSalary(user.getSalary());
        found.setPhoneNumber(user.getPhoneNumber());
        return userRepository.save(found);
    }


    public void deleteUserById(long id) throws NotFoundException{
        userRepository.findById(id).orElseThrow(()->new NotFoundException("a user with database Id: "+id+" Not found !"));
        userRepository.deleteById(id);
    }
   
}
