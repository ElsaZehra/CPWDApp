package com.example.fahad.scrolltabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Fahad on 4/7/2016.
 */
public class Physiotherapy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physiotherapy);
    }

    public void appoint(View view) {

        Intent intent = new Intent(this  , Appointment.class);
        startActivity(intent);

    }
}
