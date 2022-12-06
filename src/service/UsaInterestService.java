package service;

public class UsaInterestService implements InterestService {
    
    // ATRIBUTOS
    private Double interestRate;
    // ATRIBUTOS

    // CONSTRUTORES
    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }
    // CONSTRUTORES

    // METODOS
    @Override
    public Double getInterestRate() {
        return interestRate;
    }
    // METODOS



}
