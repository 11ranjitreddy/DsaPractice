package DSA.Oops2.Encapsulation;

import  java.util.*;
public class BankAccountEncapsulation {
    public static  void  main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Balance");
        int b=s.nextInt();
        Bank bank=new Bank();
        bank.setBalance(b);
        System.out.println(bank.getBalance());
        System.out.println("Enter the Amount to Deposit");
        int amount=s.nextInt();
        bank.deposit(amount);
        System.out.println("Current Balance: "+bank.getBalance());
        System.out.println("Enter the Amount to withdraw: ");
        int with=s.nextInt();
        bank.withdraw(with);
        System.out.println("Remaining balance"+bank.getBalance());
    }
}

class Bank{
    private int balance;

    public int getBalance(){return balance;}
    public void setBalance(int balance){this.balance=balance;}

    int deposit(int amount){
       return balance+=amount;
    }
    int withdraw(int amount){
        if(amount<=balance)
            balance-=amount;
    return balance;
    }
}