package com.AHCodeBLock;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplementation implements  AtmOperationInterface{
 //creating atm object
    ATM atm = new ATM();
  Map<Double,String> statement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is: $"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdraw) {
       if(withdraw<= atm.getBalance()){
           statement.put(withdraw," Amount withdrawn");
          System.out.println("$"+withdraw+" withdrawn successfully");
          atm.setBalance(atm.getBalance()-withdraw);
          viewBalance();
       } else System.out.println(" Insufficient Balance try amount less than $"+atm.getBalance());

    }

    @Override
    public void depositAmount(double deposit) {
        statement.put(deposit," Amount deposited");
       System.out.println("$"+deposit+" Deposited Successfully ");
       atm.setBalance(atm.getBalance()+deposit);
    }

    @Override
    public void viewStatement() {
     for(Map.Entry<Double,String> m:statement.entrySet()){
         System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
