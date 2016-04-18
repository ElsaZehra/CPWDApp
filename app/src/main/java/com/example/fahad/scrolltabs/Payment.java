package com.example.fahad.scrolltabs;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Fahad on 4/11/2016.
 */

public class Payment extends AppCompatActivity {

    android.app.FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
        manager = getFragmentManager();
    }

    public void AddCredit(View view) {

        FragmentCredit f1 = new FragmentCredit();
        FragmentTransaction transaction =  manager.beginTransaction();
        transaction.add(R.id.group,f1,"A"); //you can find fragment by A and you will get a reference to f1
        transaction.commit();
    }


    public void AddDebit(View view) {
        FragmentDebit f2 = new FragmentDebit();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group,f2,"B");
        transaction.commit();
    }

    public void RemoveCredit(View view) {

        FragmentCredit f1 = (FragmentCredit) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if(f1!=null)
        {
            transaction.remove(f1);
            transaction.commit();
        }
        else
        {
            Toast.makeText(this, "Payment By Credit Card isn't added", Toast.LENGTH_LONG).show();
        }




    }

    public void RemoveDebit(View view) {



        FragmentDebit f1 = (FragmentDebit) manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();
        if(f1!=null)
        {
            transaction.remove(f1);
            transaction.commit();
        }
        else
        {
            Toast.makeText(this, "Payment By Debit Card isn't added", Toast.LENGTH_LONG).show();
        }



    }
}
