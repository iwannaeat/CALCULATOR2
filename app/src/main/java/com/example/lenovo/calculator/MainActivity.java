package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import java.util.zip.DeflaterOutputStream;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Btn0 = (Button) findViewById(R.id.Btn0);
        Button Btn1 = (Button) findViewById(R.id.Btn1);
        Button Btn2 = (Button) findViewById(R.id.Btn2);
        Button Btn3 = (Button) findViewById(R.id.Btn3);
        Button Btn4 = (Button) findViewById(R.id.Btn4);
        Button Btn5 = (Button) findViewById(R.id.Btn5);
        Button Btn6 = (Button) findViewById(R.id.Btn6);
        Button Btn7 = (Button) findViewById(R.id.Btn7);
        Button Btn8 = (Button) findViewById(R.id.Btn8);
        Button Btn9 = (Button) findViewById(R.id.Btn9);
        Button BtnPlus = (Button) findViewById(R.id.BtnPlus);
        Button BtnMinus = (Button) findViewById(R.id.BtnMinus);
        Button BtnMultiply = (Button) findViewById(R.id.BtnMultiply);
        Button BtnDivide = (Button) findViewById(R.id.BtnDivide);
        Button BtnC = (Button) findViewById(R.id.BtnC);
        Button BtnCE = (Button) findViewById(R.id.BtnCE);
        Button BtnBack = (Button) findViewById(R.id.BtnBack);
        Button bt_quyu = (Button) findViewById(R.id.bt_quyu);
        Button BtnPoint = (Button) findViewById(R.id.BtnPoint);
        Button BtnSquare = (Button) findViewById(R.id.BtnSquare);
        Button BtnRooting = (Button) findViewById(R.id.BtnRooting);
        Button BtnEqual = (Button) findViewById(R.id.BtnEqual);
        Button BtnSign = (Button) findViewById(R.id.BtnSign);
        Button BtnReciprocal = (Button) findViewById(R.id.BtnReciprocal);
        final TextView result = (TextView) findViewById(R.id.result);
        Btn0.setOnClickListener(this);
        Btn1.setOnClickListener(this);
        Btn2.setOnClickListener(this);
        Btn3.setOnClickListener(this);
        Btn4.setOnClickListener(this);
        Btn5.setOnClickListener(this);
        Btn6.setOnClickListener(this);
        Btn7.setOnClickListener(this);
        Btn8.setOnClickListener(this);
        Btn9.setOnClickListener(this);
        BtnPlus.setOnClickListener(this);
        BtnMinus.setOnClickListener(this);
        BtnMultiply.setOnClickListener(this);
        BtnDivide.setOnClickListener(this);
        bt_quyu.setOnClickListener(this);
        BtnPoint.setOnClickListener(this);
        BtnEqual.setOnClickListener(this);
        BtnSign.setOnClickListener(this);
        BtnReciprocal.setOnClickListener(this);
        BtnSquare.setOnClickListener(this);
        BtnRooting.setOnClickListener(this);
        BtnCE.setOnClickListener(this);
        BtnC.setOnClickListener(this);
        BtnBack.setOnClickListener(this);
        result.setText("0");
    }

    private String x = "";
    private String y = "";
    private String n = "";
    private double answer;
    private String str="";


    public void onClick(View view) {
        final TextView result = (TextView) findViewById(R.id.result);
        switch (view.getId()) {
            case R.id.Btn0:
                if (n == "")
                {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"0");
                    if (result.getText()=="0"&&str=="")result.setText("0");
                    if(str=="0")
                    {
                        result.setText("0");
                        str="";
                    }
                    x=result.getText().toString();
                }
                else
                {
                    y=y+"0";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn1:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"1");
                    if (result.getText()=="0"&&str=="")result.setText("1");
                    if(str=="0")
                    {
                        result.setText("1");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"1";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn2:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"2");
                    if (result.getText()=="0"&&str=="")result.setText("2");
                    if(str=="0")
                    {
                        result.setText("2");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"2";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn3:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"3");
                    if (result.getText()=="0"&&str=="")result.setText("3");
                    if(str=="0")
                    {
                        result.setText("3");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"3";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn4:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"4");
                    if (result.getText()=="0"&&str=="")result.setText("4");
                    if(str=="0")
                    {
                        result.setText("4");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"4";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn5:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"5");
                    if (result.getText()=="0"&&str=="")result.setText("5");
                    if(str=="0")
                    {
                        result.setText("5");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"5";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn6:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"6");
                    if (result.getText()=="0"&&str=="")result.setText("6");
                    if(str=="0")
                    {
                        result.setText("6");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"6";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn7:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"7");
                    if (result.getText()=="0"&&str=="")result.setText("7");
                    if(str=="0")
                    {
                        result.setText("7");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"7";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn8:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"8");
                    if (result.getText()=="0"&&str=="")result.setText("8");
                    if(str=="0")
                    {
                        result.setText("8");
                        str="";
                    }
                    x=result.getText().toString();
                } else{
                    y=y+"8";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn9:
                if (n == "") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"9");
                    if (result.getText()=="0"&&str=="")result.setText("9");
                    if(str=="0")
                    {
                        result.setText("9");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    y=y+"9";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.BtnPoint:
                if (n == "") {
                    int i = 0, j = 0;
                    for (i = 0; i < x.length(); i++)
                        if (x.charAt(i) == '.')
                            j++;
                    if (j == 0)
                        x = x + ".";
                    result.setText(x);
                } else {
                    int i = 0, j = 0;
                    for (i = 0; i < y.length(); i++)
                        if (y.charAt(i) == '.')
                            j++;
                    if (j == 0)
                        y = y + ".";
                    result.setText(y);
                }
                break;
            case R.id.BtnPlus:
                if (n != "")
                    jieguo(n);
                n = "+";
                break;
            case R.id.BtnMinus:
                if (n != "")
                    jieguo(n);
                n = "-";
                break;
            case R.id.BtnMultiply:
                if (n != "")
                    jieguo(n);
                n = "*";
                break;
            case R.id.BtnDivide:
                if (n != "")
                    jieguo(n);
                n = "/";
                break;
            case R.id.BtnReciprocal:
                if (n != "")
                    jieguo(n);
                n = "1/";
                break;
            case R.id.BtnRooting:
                if (n != "")
                    jieguo(n);
                answer = Math.sqrt(Double.parseDouble(x));
                x = Double.toString(answer);
                if(answer%1==0)x=x.substring(0,x.length()-2);
                result.setText(x);
                str="0";
                break;
            case R.id.BtnSquare:
                if (n != "")
                    jieguo(n);
                answer=Double.parseDouble(x)*Double.parseDouble(x);
                x=Double.toString(answer);
                if(answer%1==0)x=x.substring(0,x.length()-2);
                result.setText(x);
                str="0";
                break;
            case R.id.BtnEqual:
                jieguo(n);
                break;
            case R.id.BtnC:
                x="";
                y="";
                n="";
                result.setText("0");
                break;
            case R.id.BtnCE:
                result.setText("0");
                if (n=="")x="";
                else y="";
                break;
            case R.id.BtnBack:
                if (n == ""){
                      if (result.getText()!="0"&&x.length()>=1) {
                          x = x.substring(0, x.length() - 1);
                          result.setText(x);
                      }
                      if(x.length()==0){
                          result.setText("0");
                          x="";
                      }
                      }
                else {
                    if (result.getText()!="0"&&y.length()>=1) {
                        y = y.substring(0, y.length() - 1);
                        result.setText(y);
                    }
                    if(y.length()==0){
                        result.setText("0");
                        y="";
                    }
                }
                break;
            case R.id.BtnSign:
                if (n=="")
                {
                    if (x.substring(0,1)=="-")x=x.substring(1);
                    else x="-"+x;
                    result.setText(x);
                }
                else
                {
                    if (y.substring(0,1)=="-")y=y.substring(1);
                    else y="-"+y;
                    result.setText(y);
                }
        }

    }


    public void jieguo (String a) {
        final TextView result = (TextView) findViewById(R.id.result);
        if (a=="+")
            answer = Double.parseDouble(x) + Double.parseDouble(y);
        if (a=="-")
            answer = Double.parseDouble(x) - Double.parseDouble(y);
        if (a=="*")
            answer = Double.parseDouble(x) * Double.parseDouble(y);
        if (a=="/")
            answer = Double.parseDouble(x) / Double.parseDouble(y);
        if (a=="1/")
            answer = 1 / Double.parseDouble(x);
        x=Double.toString(answer);
        if(answer%1==0)x=x.substring(0,x.length()-2);
        result.setText(x);
        y="";
        n="";
        str="0";
    }
}