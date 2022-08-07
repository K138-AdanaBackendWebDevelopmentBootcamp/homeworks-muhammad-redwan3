package dev.credit.creditsystem.controller.Api;


import dev.credit.creditsystem.exception.NotFoundException;
import dev.credit.creditsystem.model.User;
import dev.credit.creditsystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController("ApiUserController")
@RequestMapping("/api/getUsers")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    @Transactional(readOnly = true)
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok(userService.getUsers());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }


    @GetMapping("/getUser/{Id}")
    @Transactional(readOnly = true)
    public ResponseEntity getUserByDatabaseId(@PathVariable long Id){
        try {
            return ResponseEntity.ok(userService.getUserById(Id));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @GetMapping("/NationalID/{IdCardNumber}")
    @Transactional(readOnly = true)
    public ResponseEntity getUserByIdentityNumber(@PathVariable long IdCardNumber){
        try {
            return ResponseEntity.ok(userService.getUserByIdentityNumber(IdCardNumber));
        }catch(NotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @PostMapping
    @Transactional
    public ResponseEntity saveUser(@RequestBody User user){
        try {
            return  ResponseEntity.ok(userService.saveUser(user));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }

    }
    @PutMapping("updateUser/{Id}")
    @Transactional
    public ResponseEntity updateUserById(@PathVariable long Id,@RequestBody User user){
        try {
            return ResponseEntity.ok(userService.updateUserById(Id,user));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("deleteUser/{Id}")
    @Transactional
    public ResponseEntity deleteUserById(@PathVariable long  Id){
        try{
            userService.deleteUserById(Id);
            return ResponseEntity.ok("User with database Id "+ Id +" has been deleted from database");
        }catch(NotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
