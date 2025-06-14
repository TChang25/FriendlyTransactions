package org.example;

import java.util.HashMap;
import java.util.List;

public class TransactionDB {
    private HashMap<String, List<Transaction>> db;

    public TransactionDB(){
        db = new HashMap<>();
    }

    public boolean addTransaction(String name, String reason, float amount){
        try {
            Transaction t = new Transaction(amount, reason);
            List<Transaction> transactions = db.get(name);
            transactions.add(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public HashMap<String, List<Transaction>> getTransactions(){
        return db;
    }


}
