package service;

public class BrazilInterestService implements InterestService {

    // ATRIBUTOS
    private Double interestRate;
    // ATRIBUTOS

    // CONSTRUTORES
    public BrazilInterestService(Double interestRate) {
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