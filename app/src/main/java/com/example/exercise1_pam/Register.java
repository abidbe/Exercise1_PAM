package com.example.exercise1_pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Register extends AppCompatActivity {


    EditText ednama, edemail, edpass, edrepass;
    Button btnregis;
    String nama, email, password, repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnregis = findViewById(R.id.rbtn);
        ednama = findViewById(R.id.rednama);
        edemail = findViewById(R.id.redemail);
        edpass = findViewById(R.id.redpass);
        edrepass = findViewById(R.id.redrepass);

        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = ednama.getText().toString();
                email = edemail.getText().toString();
                password = edpass.getText().toString();
                repass = edrepass.getText().toString();


                if (ednama.getText().toString().length()==0){
                    ednama.setError("Nama Diperlukan!!");
                }
                if (edemail.getText().toString().length()==0){
                    edemail.setError("Email Diperlukan!!");
                }
                if (edpass.getText().toString().length()==0){
                    edpass.setError("Password Diperlukan!!");
                }
                if (edrepass.getText().toString().length()==0){
                    edrepass.setError("Re-Password Diperlukan!!");
                }
                else {
                    if (edpass.getText().toString().equals(edrepass.getText().toString())) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Pendaftaran Berhasil...", Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();
                        b.putString("a", nama.trim());

                        Intent i = new Intent(getApplicationContext(), task.class);
                        i.putExtras(b);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "Password dan Re Password harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }

                }
            }

        });
    }
}