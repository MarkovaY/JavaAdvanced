package Lab.DefiningClasses.BankAccount;

public class BankAccount {

    private static int nextId = 1;
    private int id;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount(){
        this.id = nextId;
        nextId++;
    }

    public int getId(){
        return id;
    }

    public static void setInterestRate (double interest){
        interestRate = interest;
    }

    public double getInterest (int years){
        return balance * years * interestRate;
    }

    public void deposit (double amount){
        balance += amount;
    }
}
