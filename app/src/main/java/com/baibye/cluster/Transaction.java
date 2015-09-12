package com.baibye.cluster;

import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by carlbai on 8/27/15.
 */
public class Transaction {
    private String description;
    private String date;
    private BigDecimal amount;

    public Transaction() {

    }

    public Transaction(String description, String date, BigDecimal amount) {
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount.toString();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}