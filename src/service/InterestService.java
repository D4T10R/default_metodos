package service;

import java.security.InvalidParameterException;

public interface InterestService {
    
    Double getInterestRate();

    default Double paymente(Double amount, int months) {

        if(months < 1) {
            throw new InvalidParameterException("Mes não pode ser menor que 1!");
        }
        else {
            return amount * Math.pow(1.0 + getInterestRate() / 100, months);
        }

    }


    

}
