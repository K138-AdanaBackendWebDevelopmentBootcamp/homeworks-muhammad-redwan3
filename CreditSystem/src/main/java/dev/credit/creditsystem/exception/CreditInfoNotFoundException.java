package dev.credit.creditsystem.exception;

public class CreditInfoNotFoundException extends RuntimeException{
    public CreditInfoNotFoundException(String msg){
        super(msg);
    }
}
