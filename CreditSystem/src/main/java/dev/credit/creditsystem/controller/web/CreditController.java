package dev.credit.creditsystem.controller.web;

import dev.credit.creditsystem.service.CreditService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/getUsers")
public class CreditController {
    private final CreditService service;

    public CreditController(CreditService service) {
        this.service = service;
    }

    @GetMapping("/ApplyCredit")
    public String getByIdentityNumber(@RequestParam long idCardNumber){
        service.getByIdentityNumber(idCardNumber);
        return "redirect:/users";
    }
}
