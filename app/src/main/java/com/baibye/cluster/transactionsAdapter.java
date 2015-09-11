package com.baibye.cluster;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

// Adapters populate the data into the RecyclerView
// Note that we specify the custom ViewHolder which gives us access to our views
public class TransactionsAdapter extends RecyclerView.Adapter<TransactionsAdapter.TransactionsViewHolder> {

    // Provides access to all views within each item row
    public static class TransactionsViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView description;

        // Constructor
        public TransactionsViewHolder(View v) {
            super(v);
            description = (TextView) v.findViewById(R.id.description);
        }
    }

    private List<Transaction> transactionsList;

    public TransactionsAdapter(List<Transaction> transactionsList) {
        this.transactionsList = transactionsList;
    }

    // Inflate the item layout and create the holder
    @Override
    public TransactionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the row
        View transactionsRow = inflater.inflate(R.layout.transactions_row, parent, false);

        // Return a new holder instance
        TransactionsViewHolder viewHolder = new TransactionsViewHolder(transactionsRow);
        return viewHolder;
    }

    // Populate data into item through holder
    @Override
    public void onBindViewHolder(TransactionsViewHolder viewHolder, int position) {
        // Get the data model based on position
        Transaction currentTransaction = transactionsList.get(position);

        viewHolder.description.setText(currentTransaction.getDescription());
    }

    @Override
    public int getItemCount() {
        return transactionsList.size();
    }
}
