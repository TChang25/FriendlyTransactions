package org.example;

public class Transaction {
    private float amount;
    private String reason;

    public Transaction(float amount, String reason){
        this.amount = amount;
        this.reason = reason;
    }
    public float getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String toString(){
        return "Amount: " + amount  + "\nReason: " + reason + "\n";
    }
}
