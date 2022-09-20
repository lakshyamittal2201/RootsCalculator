package com.example.rootscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView rootOne, rootTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

            public void calculateClick (View textView) {


                EditText squareTerm = findViewById(R.id.txtView4);
                EditText linearTerm = findViewById(R.id.txtView5);
                EditText constant = findViewById(R.id.txtView6);
                rootOne = findViewById(R.id.txtView7);
                rootTwo = findViewById(R.id.txtView8);


                double quadraticVar = Double.parseDouble(squareTerm.getText().toString()); //a
                double linearVar = Double.parseDouble(linearTerm.getText().toString()); // b
                double constantVar = Double.parseDouble(constant.getText().toString()); // c

                //float result = quadraticVar + linearVar + constantVar;

                double rootValue = linearVar * linearVar - 4.0 * quadraticVar * constantVar;

                if (rootValue > 0){
                    double r1 = (-linearVar + Math.pow(rootValue, 0.5)) / (2.0 * quadraticVar);
                    double r2 = (-linearVar - Math.pow(rootValue, 0.5)) / (2.0 * quadraticVar);
                    rootOne.setText(r1+"");
                    rootTwo.setText(r2+"");

                }else if(rootValue == 0.0){
                    double r1 = -linearVar / (2.0 * quadraticVar);
                    //double r2 = linearVar / (2.0 * quadraticVar);

                    rootOne.setText(r1+"");
                    //rootTwo.setText(r2+"");

                }else {
                    String result = "Roots are not real";
                    rootOne.setText(result);

                }





            }

            public void exitClick(View textView2){

                System.exit(0);


            }








}