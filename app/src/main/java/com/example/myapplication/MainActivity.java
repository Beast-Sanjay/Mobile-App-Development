package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] Branches = { "CSE", "AIDS", "IOT", "ECE", "CNIT" };
    String[] Dept  =  {"cyber security","AI/ML","C&IT","IOT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Branches);
        ArrayAdapter<String> adpt2= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,Dept);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adpt2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin2.setAdapter(adpt2);
        spin.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        if(arg0.getId() == R.id.spinner1) {
            Toast.makeText(getApplicationContext(), "Selected User: "+Branches[position] ,Toast.LENGTH_SHORT).show();
        }
        else{
        Toast.makeText(getApplicationContext(), "Selected User: "+Dept[position] ,Toast.LENGTH_SHORT).show();
    }}
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }
}

