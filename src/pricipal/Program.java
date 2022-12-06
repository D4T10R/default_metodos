package pricipal;

import java.util.Scanner;

import service.BrazilInterestService;
import service.InterestService;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double paymente = is.paymente(amount, months);

        System.out.println("Paymente after " + months + " months: ");
        System.out.println(String.format("%.2f", paymente));

    }



}