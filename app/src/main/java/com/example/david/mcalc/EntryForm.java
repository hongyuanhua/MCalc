package com.example.david.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClicked(View v) {
        View Pview = findViewById(R.id.Ptext);
        EditText Ptext = (EditText) Pview;
        String P = Ptext.getText().toString();//Get the View Pview from layout and transform this to Edit Text, then to String

        View Aview = findViewById(R.id.Atext);
        EditText Atext = (EditText) Aview;
        String A = Atext.getText().toString();

        View Iview = findViewById(R.id.Itext);
        EditText Itext = (EditText) Iview;
        String I = Itext.getText().toString();

        MortgageModel model = new MortgageModel(P, A, I);
        String answer = model.computePayment();
        ((TextView) findViewById(R.id.result)).setText(answer);

    }

    public void buttonClicked1 (View v)
    {
        View Pview = findViewById(R.id.Ptext);
        EditText Ptext = (EditText) Pview;
        String P = Ptext.getText().toString();//Get the View Pview from layout and transform this to Edit Text, then to String

        View Aview = findViewById(R.id.Atext);
        EditText Atext = (EditText) Aview;
        String A = Atext.getText().toString();

        View Iview = findViewById(R.id.Itext);
        EditText Itext = (EditText) Iview;
        String I = Itext.getText().toString();

        MortgageModel model =new MortgageModel(P,A,I);
        String balance = model.computeBalance();
        ((TextView) findViewById(R.id.result1)).setText(balance);
    }

}