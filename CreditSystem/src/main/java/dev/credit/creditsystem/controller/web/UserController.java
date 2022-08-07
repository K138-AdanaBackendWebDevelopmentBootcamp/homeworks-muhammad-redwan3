package dev.credit.creditsystem.controller.web;


import dev.credit.creditsystem.model.User;
import dev.credit.creditsystem.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    private String UpdatedInfo ;
    public String exMess;

    @GetMapping(value = "")
    @Transactional(readOnly = true)
    public String getUsers(Model model){
        List<User> userList = service.getUsers();
        model.addAttribute("excMsg",exMess);
        model.addAttribute("BUI",UpdatedInfo);
        model.addAttribute("users",userList);
        UpdatedInfo="";
        exMess="";
        return "users";
    }
    @GetMapping(value = "/")
    public String fallback(){
        return "app";
    }

    @ResponseBody
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUserById(@RequestParam(required = false) long id){
        return service.getUserById(id);
    }


    @RequestMapping(value = "/storeUser",method = {RequestMethod.PUT,RequestMethod.GET,RequestMethod.POST})
    @Transactional
    public String saveUser( User user, Model model ) {
        try {
            service.saveUser(user);
            UpdatedInfo = UserService.UpdatedInfo;
        }catch (Exception
                e){
            model.addAttribute("error",e);
            exMess = e.getMessage();
        }
        return "redirect:/users";
    }

    @RequestMapping(value = "/deleteUser",method ={ RequestMethod.DELETE,RequestMethod.GET})
    public String deleteUserById(@RequestParam(required = false) long id){
        service.deleteUserById(id);
        return "redirect:/users";
    }

}
