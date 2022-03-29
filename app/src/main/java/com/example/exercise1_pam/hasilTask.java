package com.example.exercise1_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hasilTask extends AppCompatActivity {

    TextView txTask, txJenis, txTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_task);




        txTask = findViewById(R.id.tvt);
        txJenis = findViewById(R.id.tvjt);
        txTime  = findViewById(R.id.tvtt);

        Bundle bundle = getIntent().getExtras();

        String task = bundle.getString("a");
        String jenis = bundle.getString("b");
        String time = bundle.getString("c");

        txTask.setText(task);
        txJenis.setText(jenis);
        txTime.setText(time);}}