package dev.credit.creditsystem.controller.Api;

import dev.credit.creditsystem.service.CreditService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("ApiCreditController")
@RequestMapping("/api/getUsers")
public class CreditController {
    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }
    @GetMapping("/ApplyCredit/{idCardNumber}")
    //@Transactional(readOnly = true)
    public ResponseEntity askByIdentityNumber(@PathVariable long idCardNumber){
        try {
            return ResponseEntity.ok(creditService.getByIdentityNumber(idCardNumber));
        }catch (Exception e){
            return ResponseEntity.ok().body(e.getMessage());
        }
    }

    @GetMapping("/Credit/{idCardNumber}")
    @Transactional(readOnly = true)
    public ResponseEntity getCreditByUserIdentityNumber(@PathVariable long idCardNumber){
        try {
            return ResponseEntity.ok(creditService.getCreditByUserIdentityNumber(idCardNumber));
        }catch (Exception e){
            return ResponseEntity.ok().body(e.getMessage());
        }

    }
}
