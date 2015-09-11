package com.baibye.cluster;

import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by carlbai on 8/27/15.
 */
public class Transaction {
    private String description;
    private DateTime date;
    private BigDecimal amount;

    public Transaction(String description, DateTime date, BigDecimal amount) {
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }
}