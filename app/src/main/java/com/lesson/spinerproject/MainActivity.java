package com.lesson.spinerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] countries={"Russia","France","Germany","Italy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,countries);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.autocomplite);
        ArrayAdapter<String> autoAdapter=new ArrayAdapter(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,countries);
        autoCompleteTextView.setAdapter(autoAdapter);
    }
}