package Lab.DefiningClasses.BankAccount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        BiFunction<BankAccount, String, String> depositFunction = (b, s) -> {
            int amount = Integer.parseInt(s);
            b.deposit(amount);
            return "Deposited " + amount + " to ID" + b.getId();
        };

        BiFunction<BankAccount, String, String> getInterestFunction = (b, s) -> {
            int years = Integer.parseInt(s);
            double interest = b.getInterest(years);
            return String.format("%.2f", interest);
        };

        Map<Integer, BankAccount> bankAccounts = new LinkedHashMap<>();
        while (!command.equals("End")) {

            String currentCommand = command.split(" ")[0];

            switch (currentCommand) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(), bankAccount);
                    System.out.println("Account ID" + bankAccount.getId() + " created");
                    break;
                case "Deposit":
                    String output = executeOnBankAccount(command.split(" "), bankAccounts, depositFunction);
                    System.out.println(output);
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(command.split(" ")[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    String outputGI = executeOnBankAccount(command.split(" "), bankAccounts, getInterestFunction);
                    System.out.println(outputGI);
                    break;
            }

            command = scanner.nextLine();
        }
    }

    private static String executeOnBankAccount(String[] command, Map<Integer, BankAccount> bankAccounts, BiFunction<BankAccount, String, String> function) {
        int id = Integer.parseInt(command[1]);
        BankAccount bankAccount = bankAccounts.get(id);
        if (bankAccount == null) {
            return "Account does not exist";
        }
        return function.apply(bankAccount, command[2]);
    }

}