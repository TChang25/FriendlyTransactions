package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionDB db = new TransactionDB();
        while (true){
            menu();
            String input = sc.nextLine();
            switch (input){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
        }
    }

    public static void menu(){
        System.out.println("Welcome to Friendly Transacting");
        System.out.println("1. I owe money to someone else.");
        System.out.println("2. I have paid someone else.");
        System.out.println("3. Who do I owe money to?");
        System.out.println("4. Exit");
    }

    public static void logOwedTransaction(Scanner sc, TransactionDB db){
        System.out.println("Please enter the name of the person:");
        String inputName = sc.nextLine();
        System.out.println("Please enter the amount owed.");
        String inputAmount = sc.nextLine();
        System.out.println("Please enter the reason");
        String inputReason = sc.nextLine();
        db.addTransaction(inputName, inputReason, Float.parseFloat(inputAmount));
    }

    public static void logPaidTransaction(Scanner sc, TransactionDB db){
        System.out.println("Please enter the name of the person:");
        String inputName = sc.nextLine();
        System.out.println("Please enter the amount owed.");
        String inputAmount = sc.nextLine();
        System.out.println("Please enter the reason");
        String inputReason = sc.nextLine();
        db.addTransaction(inputName, inputReason, Float.parseFloat(inputAmount) * -1);
    }

    public static void printTransactionTotal(TransactionDB db){
        HashMap<String, List<Transaction>> hm = db.getTransactions();
        for (String key : hm.keySet()){
            List<Transaction> temp = hm.get(key);
            System.out.printf("To %s:\n", key);
            for (Transaction t : temp){
                System.out.println(t);
            }
        }
    }

}