package com.example.android.learnLang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<String> number = new ArrayList<String>();
        number.add("Zero");number.add("One");number.add("Two");number.add("Three");number.add("Four");number.add("Five");
        number.add("Six");number.add("Seven");number.add("Eight");number.add("Nine");number.add("Ten");number.add("Eleven");
        number.add("Twelve"); number.add("Thirteen");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, number);
        GridView listView = (GridView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}