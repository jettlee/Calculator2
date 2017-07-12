package com.example.jettlee.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {

    private static final String PREF = "calc_PREF";
    private static final String PREF_number = "last_number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator_init();
        listener();
    }

    private void restorePref(){
        SharedPreferences settings = getSharedPreferences(PREF, 0);
        String last_result = settings.getString(PREF_number, "");
        if(!"".equals(last_result)){
            result.setText(last_result);
        }
    }

    private Button keyboard_7;
    private Button keyboard_8;
    private Button keyboard_9;
    private Button keyboard_4;
    private Button keyboard_5;
    private Button keyboard_6;
    private Button keyboard_1;
    private Button keyboard_2;
    private Button keyboard_3;
    private Button keyboard_dot;
    private Button keyboard_0;
    private Button keyboard_equal;
    private Button keyboard_del;
    private Button keyboard_div;
    private Button keyboard_mul;
    private Button keyboard_sub;
    private Button keyboard_add;
    private TextView result;
    private String result_to_be_cal;
    private String operator;


    private void calculator_init(){
        keyboard_7 = (Button) findViewById(R.id.keyboard_7);
        keyboard_8 = (Button) findViewById(R.id.keyboard_8);
        keyboard_9 = (Button) findViewById(R.id.keyboard_9);
        keyboard_4 = (Button) findViewById(R.id.keyboard_4);
        keyboard_5 = (Button) findViewById(R.id.keyboard_5);
        keyboard_6 = (Button) findViewById(R.id.keyboard_6);
        keyboard_1 = (Button) findViewById(R.id.keyboard_1);
        keyboard_2 = (Button) findViewById(R.id.keyboard_2);
        keyboard_3 = (Button) findViewById(R.id.keyboard_3);
        keyboard_dot = (Button) findViewById(R.id.keyboard_dot);
        keyboard_0 = (Button) findViewById(R.id.keyboard_0);
        keyboard_equal = (Button) findViewById(R.id.keyboard_equal);
        keyboard_del = (Button) findViewById(R.id.keyboard_del);
        keyboard_div = (Button) findViewById(R.id.keyboard_div);
        keyboard_mul = (Button) findViewById(R.id.keyboard_mul);
        keyboard_sub = (Button) findViewById(R.id.keyboard_sub);
        keyboard_add = (Button) findViewById(R.id.keyboard_add);
        result = (TextView) findViewById(R.id.monitor);
        result.setText("0");
        result_to_be_cal = "EMPTY";
        operator = "NONE";
    }

    private void listener(){
        keyboard_7.setOnClickListener(number_7);
        keyboard_8.setOnClickListener(number_8);
        keyboard_9.setOnClickListener(number_9);
        keyboard_4.setOnClickListener(number_4);
        keyboard_5.setOnClickListener(number_5);
        keyboard_6.setOnClickListener(number_6);
        keyboard_1.setOnClickListener(number_1);
        keyboard_2.setOnClickListener(number_2);
        keyboard_3.setOnClickListener(number_3);
        keyboard_dot.setOnClickListener(number_dot);
        keyboard_0.setOnClickListener(number_0);
        keyboard_equal.setOnClickListener(number_equal);
        keyboard_del.setOnClickListener(action_del);
        keyboard_div.setOnClickListener(action_div);
        keyboard_mul.setOnClickListener(action_mul);
        keyboard_sub.setOnClickListener(action_sub);
        keyboard_add.setOnClickListener(action_add);
    }

    private void calc(){
        if(!result_to_be_cal.equals("EMPTY") && !operator.equals("NONE")) {
            float new_result_number = 0;
            float result_number = Float.parseFloat(result_to_be_cal);
            float current_number = Float.parseFloat(result.getText().toString());
            switch (operator) {
                case "ADD":
                    new_result_number = result_number + current_number;
                    break;
                case "MUL":
                    new_result_number = result_number * current_number;
                    break;
                case "DIV":
                    new_result_number = result_number / current_number;
                    break;
                case "SUB":
                    new_result_number = result_number - current_number;
                    break;
            }
            String new_result = (int) new_result_number == new_result_number ?
                    String.valueOf((int) new_result_number) : String.valueOf(new_result_number);
            result.setText(new_result);
        }
    }

    private Button.OnClickListener number_7 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("7");
                }else{
                    String new_result = result.getText().toString()+"7";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("7");
                }else{
                    String new_result = result.getText().toString()+"7";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_8 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("8");
                }else{
                    String new_result = result.getText().toString()+"8";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("8");
                }else{
                    String new_result = result.getText().toString()+"8";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_9 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("9");
                }else{
                    String new_result = result.getText().toString()+"9";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("9");
                }else{
                    String new_result = result.getText().toString()+"9";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_4 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("4");
                }else{
                    String new_result = result.getText().toString()+"4";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("4");
                }else{
                    String new_result = result.getText().toString()+"4";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_5 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("5");
                }else{
                    String new_result = result.getText().toString()+"5";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("5");
                }else{
                    String new_result = result.getText().toString()+"5";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_6 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("6");
                }else{
                    String new_result = result.getText().toString()+"6";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("6");
                }else{
                    String new_result = result.getText().toString()+"6";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_1 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("1");
                }else{
                    String new_result = result.getText().toString()+"1";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("1");
                }else{
                    String new_result = result.getText().toString()+"1";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_2 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("2");
                }else{
                    String new_result = result.getText().toString()+"2";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("2");
                }else{
                    String new_result = result.getText().toString()+"2";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_3 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(operator.equals("NONE")){
                if(result.getText().toString()=="0"){
                    result.setText("3");
                }else{
                    String new_result = result.getText().toString()+"3";
                    result.setText(new_result);
                }
            }else{
                if(result_to_be_cal.equals(result.getText().toString()) || result.getText().toString()=="0"){
                    result.setText("3");
                }else{
                    String new_result = result.getText().toString()+"3";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_0 = new Button.OnClickListener() {
        public void onClick(View v) {
            if(result.getText().toString()!="0" && !result_to_be_cal.equals(result.getText().toString())){
                String new_result = result.getText().toString()+"0";
                result.setText(new_result);
            }else{
                result.setText("0");
            }
        }
    };
    private Button.OnClickListener number_dot = new Button.OnClickListener() {
        public void onClick(View v) {
            if(!operator.equals("NONE")){
                if(result_to_be_cal.equals(result.getText().toString())){
                    result.setText("0.");
                }else{
                    if(result.getText().toString().contains(".")) return;
                    String new_result = result.getText().toString()+".";
                    result.setText(new_result);
                }
            }else{
                if(result.getText().toString()=="0"){
                    result.setText("0.");
                }else{
                    if(result.getText().toString().contains(".")) return;
                    String new_result = result.getText().toString()+".";
                    result.setText(new_result);
                }
            }
        }
    };

    private Button.OnClickListener number_equal = new Button.OnClickListener(){
        public void onClick(View v){
            calc();
        }
    };

    private Button.OnClickListener action_del = new Button.OnClickListener(){
        public void onClick(View v){
            result.setText("0");
            result_to_be_cal = "EMPTY";
            operator = "NONE";
        }
    } ;

    private Button.OnClickListener action_mul = new Button.OnClickListener(){
        public void onClick(View v){
            operator = "MUL";
            if(!"".equals(result_to_be_cal)){
                calc();
            }
            result_to_be_cal = result.getText().toString();
        }
    };
    private Button.OnClickListener action_div = new Button.OnClickListener(){
        public void onClick(View v){
            operator = "DIV";
            if(!"".equals(result_to_be_cal)) {
                calc();
            }
            result_to_be_cal = result.getText().toString();
        }
    };

    private Button.OnClickListener action_sub = new Button.OnClickListener(){
        public void onClick(View v){
            operator = "SUB";
            if(!"".equals(result_to_be_cal)){
                calc();
            }
            result_to_be_cal = result.getText().toString();
        }
    };
    private Button.OnClickListener action_add = new Button.OnClickListener(){
        public void onClick(View v){
            operator = "ADD";
            if(!"".equals(result_to_be_cal)){
                calc();
            }
            result_to_be_cal = result.getText().toString();
        }
    };

    @Override
    protected void onPause(){
        super.onPause();
        SharedPreferences settings = getSharedPreferences(PREF, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(PREF_number, result.getText().toString());
        editor.commit();

    }

    @Override
    protected void onResume(){
        super.onResume();
        restorePref();
    }


}
