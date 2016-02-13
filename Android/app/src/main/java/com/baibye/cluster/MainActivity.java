package com.baibye.cluster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.firebase.client.Firebase;

import net.danlew.android.joda.JodaTimeAndroid;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JodaTimeAndroid.init(this);

        Firebase.setAndroidContext(this);
        //populateFirebase();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void toTransactions(View view) {
        Intent intent = new Intent(this, TransactionsActivity.class);
        startActivity(intent);
    }

    private void populateFirebase() {
        Firebase ref = new Firebase("https://resplendent-heat-4997.firebaseIO.com/Transactions");

        ref.push().setValue(
                new Transaction("Carl", "Boo's litter", new DateTime().toString(), new BigDecimal(15)));
        ref.push().setValue(
                new Transaction("Steph", "shitty webcam", new DateTime(2015, 9, 3, 20, 35).toString(), new BigDecimal(20)));
        ref.push().setValue(
                new Transaction("Steph", "Making Steph wake early", new DateTime(2015, 9, 5, 8, 30).toString(), new BigDecimal(123456789)));
    }
}
