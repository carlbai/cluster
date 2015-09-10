package com.baibye.cluster;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

// Adapters populate the data into the RecyclerView
// Note that we specify the custom ViewHolder which gives us access to our views
public class transactionsAdapter extends RecyclerView.Adapter<transactionsAdapter.ViewHolder> {

    // Provides access to all views within each item row
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView description;

        // create constructor
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
