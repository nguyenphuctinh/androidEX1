package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    private EditText tn1, tn2;
    private TextView txtKQ;
    private Button btnTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);
        initUI();
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int value1 = Integer.parseInt(tn1.getText().toString());
                    int value2 = Integer.parseInt(tn2.getText().toString());
                    System.out.println(value1+", "+value2);
                    txtKQ.setText("ket quar: "+value1+value2);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"De nghi nhap so", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void initUI() {
        this.tn1 = findViewById(R.id.txtNumber1);
        System.out.println("tn1" +tn1);
        this.tn2 = findViewById(R.id.txtNumber2);
        this.txtKQ = findViewById(R.id.txtKQ);
        this.btnTong = findViewById(R.id.btnTong);
    }

}