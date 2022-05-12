package com.AHCodeBLock;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {
        AtmOperationInterface ops = new AtmOperationImplementation();
       int  cardNum = 000000;
       int  pin= 1234;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 24/7 ATM \n" +
                      "Please enter your card Number: ");

        int cardNumber= scanner.nextInt();
        System.out.println("Enter your  Pin: ");
        int pinNumber = scanner.nextInt();

        if((cardNum == cardNumber) && (pin==pinNumber)){
            System.out.println("Login Successful");
            while (true){
                System.out.println("1.View your Balance\n" +
                                   "2.Withdraw Amount\n" +
                                   "3.Deposit Amount\n" +
                                    "4.View statement\n"+
                                         "5.Exit");
                System.out.println("Please enter your your option: ");
                int opt = scanner.nextInt();
                if (opt == 1) {
                  ops.viewBalance();
                } else if(opt == 2){
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    ops.withdrawAmount(withdrawAmount);
                } else if (opt == 3) {
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    ops.depositAmount(depositAmount);
                } else if (opt == 4) {
                   ops.viewStatement();
                } else if (opt == 5) {
                    System.out.println(" BYE! Don't forget your Card!!!\n " +
                            "Thank you for using  24/7 ATM");
                } else {
                    System.out.println("Opps! Please select correct options");
                    System.exit(0);
                }

            }
        }
        else {
            System.out.println("Incorrect card number or PIN!!!\n Try Again!");
            System.exit(0);
        }


    }
}
