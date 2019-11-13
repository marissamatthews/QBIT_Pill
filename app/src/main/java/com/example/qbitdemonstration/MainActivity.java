package com.example.qbitdemonstration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView doctorsList ;
    private dListAdapter DListAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doctorsList = (ListView) findViewById(R.id.doctors_list) ;

        DListAdapter = new dListAdapter(this, getResources().getStringArray(R.array.dListItems)) ;
        doctorsList.setAdapter(DListAdapter);





    }
}
