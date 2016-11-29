package com.example.cynda.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static com.example.cynda.calculator.Calculator.getAverage;
import static com.example.cynda.calculator.Calculator.getFactorial;
import static com.example.cynda.calculator.Calculator.getProduct;
import static com.example.cynda.calculator.Calculator.getSum;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        final Button sumBT = (Button) findViewById(R.id.sumBT);
        final Button sumBT2 = (Button) findViewById(R.id.sumBT2);
        final Button averageBT = (Button) findViewById(R.id.averageBT);
        final Button averageBT2 = (Button) findViewById(R.id.averageBT2);
        final Button productBT = (Button) findViewById(R.id.productBT);
        final Button productBT2 = (Button) findViewById(R.id.productBT2);
        final Button factorialBT = (Button) findViewById(R.id.factorialBT);
        final Button factorialBT2 = (Button) findViewById(R.id.factorialBT2);

        final TextView outputText = (TextView) findViewById(R.id.outputText);

        final EditText inputText = (EditText) findViewById(R.id.inputText);


        sumBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                    n=1;
                    }
                }
                outputText.setText("The sum of the inputed numbers is:\n"
                        +getSum(doubleArray));
            }
        });

        sumBT2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                        n=1;
                    }
                }
                outputText.setText("The sum of the first two numbers is:\n"
                        +getSum(doubleArray.get(1), doubleArray.get(0)));
            }
        });

        averageBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                        n=1;
                    }
                }
                outputText.setText("The average of the inputed numbers is:\n"
                        +getAverage(doubleArray));
            }
        });

        averageBT2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                        n=1;
                    }
                }
                outputText.setText("The average for the first two numbers is:\n"
                        +getAverage(doubleArray.get(0), doubleArray.get(1)));
            }
        });

        productBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                        n=1;
                    }
                }
                outputText.setText("The product of the inputed numbers is:\n"
                        +getProduct(doubleArray));
            }
        });

        productBT2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                        n=1;
                    }
                }
                outputText.setText("The product of the first two inputed numbers is:\n"
                        +getProduct(doubleArray.get(0), doubleArray.get(1)));
            }
        });

        factorialBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                        n=1;
                    }
                }
                outputText.setText(getFactorial(doubleArray));
            }
        });

        factorialBT2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n = 0;
                List<Double> doubleArray = new ArrayList<Double>();
                String input = inputText.getText().toString();
                Scanner getnum = new Scanner(input);
                getnum.useDelimiter("#");

                while(n==0){
                    try{
                        doubleArray.add(getnum.nextDouble());
                    }catch(NoSuchElementException x){
                        n=1;
                    }
                }
                outputText.setText(getFactorial(doubleArray.get(0), doubleArray.get(1)));
            }
        });

//        int n = 0;
//        List<Double> doubleArray = new ArrayList<Double>();
//        String input = inputText.getText().toString();
//        Scanner getnum = new Scanner(input);
//        getnum.useDelimiter("#");
//        while(n==0){
//            try{
//                doubleArray.add(getnum.nextDouble());
//            }catch(NoSuchElementException x){
//                n=1;
//            }
//        }
//        System.out.println(getSum(doubleArray));
//        System.out.println(getAverage(doubleArray));
//        System.out.println(getProduct(doubleArray));
//        System.out.println(getFactorial(doubleArray));
//        System.exit(0);
    }



}
