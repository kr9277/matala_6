package com.example.matala_6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    EditText et1, et2, et3;
    ImageView iv1, iv2, iv3;
    int sum1, sum2, sum3;
    int counter =0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        int number1 = random_number();
        int number2 = random_number();
        tv1.setText(String.valueOf(number1));
        tv2.setText(String.valueOf(number2));
        sum1 = number1+number2;

    }
    public int random_number (){
        Random rnd = new Random();
        int num = rnd.nextInt(89+1)+10;
        return num;
    }

    public void first_btn(View view) {
        int user_number1 = Integer.parseInt(et1.getText().toString());
        if (user_number1 == sum1){
            iv1.setImageResource(R.drawable.vi2);
            counter++;
        }
        else {
            iv1.setImageResource(R.drawable.eixs2);
        }
        int number3 = sum1;
        int number4 = random_number();
        tv3.setText(String.valueOf(number3));
        tv4.setText(String.valueOf(number4));
        sum2 = number3 + number4;
    }

    public void second_btn(View view) {
        int user_number2 = Integer.parseInt(et2.getText().toString());
        if (user_number2 == sum2) {
            iv2.setImageResource(R.drawable.vi2);
            counter++;
        }
        else {
            iv2.setImageResource(R.drawable.eixs2);
        }
        int number5 = sum2;
        int number6 = random_number();
        tv5.setText(String.valueOf(number5));
        tv6.setText(String.valueOf(number6));
        sum3 = number5+number6;
    }

    public void third_btn(View view) {
        int user_number3 = Integer.parseInt(et3.getText().toString());
        if (user_number3 == sum3) {
            iv3.setImageResource(R.drawable.vi2);
            counter++;
        }
        else {
            iv3.setImageResource(R.drawable.eixs2);
        }
        Toast.makeText(this, counter + "/3," + counter*100/3 + "%", Toast.LENGTH_SHORT).show();
    }

    public void forth_btn(View view) {
        sum1=0;
        sum2=0;
        sum3=0;
        iv1.setImageResource(0);
        iv2.setImageResource(0);
        iv3.setImageResource(0);
        counter = 0;
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        et1.setText("");
        et2.setText("");
        et3.setText("");
        int number1 = random_number();
        int number2 = random_number();
        tv1.setText(String.valueOf(number1));
        tv2.setText(String.valueOf(number2));
        sum1 = number1+number2;
    }
}