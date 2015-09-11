package com.baibye.cluster;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.List;

public class TransactionsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    // TODO: 9/10/2015 Replace when grabbing data from Firebase has been implemented
    private List<Transaction> tempTransactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
        mRecyclerView = (RecyclerView) findViewById(R.id.transactions_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // TODO: 9/10/2015 Replace when grabbing data from Firebase has been implemented
        tempTransactions.add(new Transaction("To Carl for Boo's litter", new DateTime(), new BigDecimal(15)));
        tempTransactions.add(new Transaction("To Steph for that shitty webcam", new DateTime(2015, 9, 3, 20, 35), new BigDecimal(20)));
        tempTransactions.add(new Transaction("For making Steph wake early", new DateTime(2015, 9, 5, 8, 30), new BigDecimal(123456789)));

        // specify an adapter
         mAdapter = new TransactionsAdapter(tempTransactions);
         mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_transactions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
