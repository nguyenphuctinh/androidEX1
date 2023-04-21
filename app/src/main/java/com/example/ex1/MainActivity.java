package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText tn1, tn2;
    private TextView txtKQ;
    private Button btnTong, btnSubmit;
    CheckBox ckbIphone;
    RadioGroup rdgGender;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = findViewById(R.id.btnSubmit);
        ckbIphone = findViewById(R.id.ckbIphone);
        rdgGender = findViewById(R.id.rdgGender);
        ratingBar = findViewById(R.id.ratingBar);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(ckbIphone.isChecked()+" " );
                RadioButton radioButton = (RadioButton) findViewById(rdgGender.getCheckedRadioButtonId());
                if (radioButton !=null){

                System.out.println(radioButton.getText());
                }
                System.out.println(ratingBar.getRating());

            }
        });
    }



}