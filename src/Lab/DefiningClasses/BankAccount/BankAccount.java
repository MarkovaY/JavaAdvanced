package Lab.DefiningClasses.BankAccount;

public class BankAccount {

//    Create class BankAccount.
//    The class should have private fields for:
//            •	Id: int (Starts from 1 and increments for every new account)
//            •	Balance: double
//            •	Interest rate: double (Shared for all accounts. Default value: 0.02)
//    The class should also have public methods for:
//            •	setInterestRate(double interest): void (static)
//            •	getInterest(int Years): double
//            •	deposit(double amount): void
//    Create a test client supporting the following commands:
//            •	Create
//            •	Deposit {Id} {Amount}
//            •	SetInterest {Interest}
//            •	GetInterest {ID} {Years}
//            •	End

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
