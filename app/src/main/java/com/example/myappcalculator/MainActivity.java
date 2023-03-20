package com.example.myappcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // global tanımlama alanı değişkenin belli bir sabite eşitleyip genel
    //olarak kullanmak
    // her yerden erişim

    EditText number1text;
    EditText number2text;
    TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tanımladığın değişkenlerin arayüz isimleri ile eşleştirilmesi
         number1text = findViewById(R.id.number1Text);
         number2text = findViewById(R.id.number2text);
         resultview = findViewById(R.id.resultView);



    }

    public void sum(View view){

        // text convert to integer
        int number1 = Integer.parseInt(number1text.getText().toString());
        int number2 = Integer.parseInt(number2text.getText().toString());

        int result = number1 + number2;

        resultview.setText("Result: " + result);
    }

    public void detuct(View view){
        int number1 = Integer.parseInt(number1text.getText().toString());
        int number2 = Integer.parseInt(number2text.getText().toString());

        int result = number1 - number2;

        resultview.setText("Result: " + result);
    }

    public void multiply(View view){
        int number1 = Integer.parseInt(number1text.getText().toString());
        int number2 = Integer.parseInt(number2text.getText().toString());

        int result = number1 * number2;

        resultview.setText("Result: " + result);
    }

    public void divide(View view){
        int number1 = Integer.parseInt(number1text.getText().toString());
        int number2 = Integer.parseInt(number2text.getText().toString());

        int result = number1 / number2;

        resultview.setText("Result: " + result);
    }
}