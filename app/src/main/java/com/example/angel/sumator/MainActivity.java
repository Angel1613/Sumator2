package com.example.angel.sumator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numer1, numer2;
    TextView wynik;
    Button dodaj, zamknij;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numer1 = (EditText)findViewById(R.id.num1);
        numer2 = (EditText)findViewById(R.id.num2);
        wynik = (TextView)findViewById(R.id.wynik);
        dodaj = (Button)findViewById(R.id.buttonSumuj);
        zamknij = (Button)findViewById(R.id.buttonZamknij);

        zamknij.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });





        dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (numer1.getText().length() != 0 && numer2.getText().length() != 0) {

                    double n1 = Double.parseDouble(numer1.getText().toString());
                    double n2 = Double.parseDouble(numer2.getText().toString());

                    double wyn = n1 + n2;

                    wynik.setText(String.valueOf(wyn));

                }
                else{
                    Toast.makeText(view.getContext(), "Wpisz liczby",Toast.LENGTH_SHORT).show();
                }

            }

        });


    }
}
