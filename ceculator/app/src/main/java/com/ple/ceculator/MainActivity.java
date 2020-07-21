package com.ple.ceculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    TextView TextviewPrevious;
    TextView TextviewNow;

    Stack stack;
    ArrayList arrayList;

    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;
    Button Button7;
    Button Button8;
    Button Button9;
    Button Buttonadd;
    Button Buttonsub;
    Button Buttonmul;
    Button Buttondiv;
    Button ButtonAC;
    Button Buttonres;
    Button Button10;

    String Textnow;
    String TextPre = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextviewPrevious = findViewById(R.id.textView_pervious);
        TextviewNow = findViewById(R.id.textView_now);

        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.button4);
        Button5 = findViewById(R.id.button5);
        Button6 = findViewById(R.id.button6);
        Button7 = findViewById(R.id.button7);
        Button8 = findViewById(R.id.button8);
        Button9 = findViewById(R.id.button9);
        ButtonAC = findViewById(R.id.buttonAC);
        Button10 = findViewById(R.id.button10);
        Buttonres = findViewById(R.id.buttonResult);
        Buttonadd = findViewById(R.id.button_add);
        Buttondiv = findViewById(R.id.button_div);
        Buttonsub = findViewById(R.id.button_sub);
        Buttonmul = findViewById(R.id.button_mul);

        stack = new <String>Stack();
        arrayList = new ArrayList();


        ClickButton1();
        ClickButton2();
        ClickButton3();
        ClickButton4();
        ClickButton5();
        ClickButton6();
        ClickButton7();
        ClickButton8();
        ClickButton9();
        ClickButton10();
        ClickButtonadd();
        ClickButtonsub();
        ClickButtonmul();
        ClickButtondiv();
        ClickButtonAC();
        ClickButtonres();
    }


    public void add(){}
    public void ClickButton1(){
        stack.push(new Integer(1).toString());
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(1);
                    TextviewNow.setText(Textnow);

                }else{

                   TextPre  = TextPre + Textnow;
                   Textnow = Integer.toString(1);
                   TextviewNow.setText(Textnow);
                   TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton2(){
        stack.push((new Integer(2).toString()));
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(2);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(2);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton3(){
        stack.push((new Integer(3).toString()));
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(3);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(3);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton4(){
        stack.push((new Integer(4).toString()));
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(4);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(4);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton5(){
        stack.push((new Integer(5).toString()));
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(5);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(5);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton6(){stack.push((new Integer(6).toString()));
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(6);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(6);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton7(){
        stack.push((new Integer(7).toString()));
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(7);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(7);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton8(){
        stack.push((new Integer(8).toString()));
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(8);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(8);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton9(){stack.push((new Integer(9).toString()));
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(9);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(8);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButton10(){stack.push((new Integer(10).toString()));
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){
                    Textnow = Integer.toString(0);
                    TextviewNow.setText(Textnow);

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = Integer.toString(0);
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }


    public void ClickButtonadd(){
        stack.push("+");
        Buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = "+";
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButtonmul(){
        stack.push("*");
        Buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = "*";
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButtonsub(){
        stack.push("-");
        Buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = "-";
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }
    public void ClickButtondiv(){
        stack.push("/");
        Buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Textnow==null){

                }else{

                    TextPre  = TextPre + Textnow;
                    Textnow = "/";
                    TextviewNow.setText(Textnow);
                    TextviewPrevious.setText(TextPre);
                }
            }
        });

    }

    public void ClickButtonAC(){

        ButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextPre  = "";














































                Textnow = "";
                TextviewNow.setText("Now");
                TextviewPrevious.setText("Previous");
            }
        });



    }

    String Pop1= "";
    String Pop2= "";
    String Pop3 ="";
    int result =0;

    public void ClickButtonres(){


        int i,j,k,n;
        ButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                while(true ){
                    if(stack.peek().equals("+") ==true || stack.peek().equals("-") == true|| stack.peek().equals("*")==true || stack.peek().equals("/") ==true|| stack.empty() == true){ break;}
                    Pop1 = Pop1+ stack.pop().toString();
                }

                while(true){

                    if(stack.empty() == true)break;
                    if((stack.peek().equals("+") ==true || stack.peek().equals("-") ==true|| stack.peek().equals("*")==true || stack.peek().equals("/")==true) ){
                        Pop2 = stack.pop().toString();
                    }else{
                        Pop3 =  Pop3 + stack.pop().toString();
                    }

                    if(Pop2.equals("+")==true) {
                        result = (Integer.parseInt(Pop1) + Integer.parseInt(Pop2));
                        Pop1 = Integer.toString(result);
                    } else if(Pop2.equals("-")==true){
                        result = (Integer.parseInt(Pop1) - Integer.parseInt(Pop2));
                        Pop1 = Integer.toString(result);
                    } else if(Pop2.equals("*")==true){
                        result = (Integer.parseInt(Pop1) * Integer.parseInt(Pop2));
                        Pop1 = Integer.toString(result);
                    } else if(Pop2.equals("/")==true){
                        result = (Integer.parseInt(Pop1) / Integer.parseInt(Pop2));
                        Pop1 = Integer.toString(result);
                    }

                }
                TextviewNow.setText(Pop1);

            }
        });

    }

}
