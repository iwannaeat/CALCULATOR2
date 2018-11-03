package com.example.lenovo.calculator;

import android.print.PrinterId;
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

    private String x = "0";
    private String y = "";
    private String n = "";
    private double answer;
    private String str="";
    private String a="";


    public void onClick(View view) {
        final TextView result = (TextView) findViewById(R.id.result);
        switch (view.getId()) {
            case R.id.Btn0:
                if (n == ""||a=="0")
                {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"0");
                    if (result.getText()=="0"&&str=="") result.setText("0");
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
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"1");
                    if (result.getText()=="0"&&str=="")result.setText("1");
                    if(str=="0")
                    {
                        result.setText("1");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"1";
                    if (y=="0")y="1";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn2:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"2");
                    if (result.getText()=="0"&&str=="")result.setText("2");
                    if(str=="0")
                    {
                        result.setText("2");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"2";
                    if (y=="0")y="2";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn3:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"3");
                    if (result.getText()=="0"&&str=="")result.setText("3");
                    if(str=="0")
                    {
                        result.setText("3");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"3";
                    if (y=="0")y="3";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn4:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"4");
                    if (result.getText()=="0"&&str=="")result.setText("4");
                    if(str=="0")
                    {
                        result.setText("4");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"4";
                    if (y=="0")y="4";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn5:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"5");
                    if (result.getText()=="0"&&str=="")result.setText("5");
                    if(str=="0")
                    {
                        result.setText("5");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"5";
                    if (y=="0")y="5";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn6:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"6");
                    if (result.getText()=="0"&&str=="")result.setText("6");
                    if(str=="0")
                    {
                        result.setText("6");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"6";
                    if (y=="0")y="6";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn7:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"7");
                    if (result.getText()=="0"&&str=="")result.setText("7");
                    if(str=="0")
                    {
                        result.setText("7");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"7";
                    if (y=="0")y="7";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn8:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"8");
                    if (result.getText()=="0"&&str=="")result.setText("8");
                    if(str=="0")
                    {
                        result.setText("8");
                        str="";
                    }
                    x=result.getText().toString();
                } else{
                    if (y!="0")y=y+"8";
                    if (y=="0")y="8";
                    if (y.startsWith("00")){
                        y=y.substring(1);
                    }
                    result.setText(y);
                }
                break;
            case R.id.Btn9:
                if (n == ""||a=="0") {
                    if (result.getText()!="0"&&str=="") result.setText(result.getText()+"9");
                    if (result.getText()=="0"&&str=="")result.setText("9");
                    if(str=="0")
                    {
                        result.setText("9");
                        str="";
                    }
                    x=result.getText().toString();
                } else {
                    if (y!="0")y=y+"9";
                    if (y=="0")y="9";
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
                if (n != ""&&a==""&&y!="")
                {
                    jieguo(n);
                    y="";
                    n="";
                }
                if (n!=""&&a=="0"&&y!="") {
                    y="";
                    a="";
                }
                n = "+";
                break;
            case R.id.BtnMinus:
                if (n != ""&&a==""&&y!="")
                {
                    jieguo(n);
                    y="";
                    n="";
                }
                if (n!=""&&a=="0"&&y!="") {
                    y="";
                    a="";
                }
                n = "-";
                break;
            case R.id.BtnMultiply:
                if (n != ""&&a==""&&y!="")
                {
                    jieguo(n);
                    y="";
                    n="";
                }
                if (n!=""&&a=="0"&&y!=""){
                    y="";
                    a="";
                }
                n = "*";
                break;
            case R.id.BtnDivide:
                if (n != ""&&a==""&&y!="")
                {
                    jieguo(n);
                    y="";
                    n="";
                }
                if (n!=""&&a=="0"&&y!="") {
                    y="";
                    a="";
                }
                n = "/";
                break;
            case R.id.BtnReciprocal:
                if (n=="")
                {
                    if (x.equals("0"))result.setText("除数不能为零");
                    else {
                        answer = 1 / Double.parseDouble(x);
                        x = Double.toString(answer);
                        if (answer % 1 == 0) x = x.substring(0, x.length() - 2);
                        result.setText(x);
                        str = "0";
                    }
                }
                else{
                    if (y.equals("0"))result.setText("除数不能为零");
                    else {
                        answer = 1 / Double.parseDouble(y);
                        y = Double.toString(answer);
                        if (answer % 1 == 0) y = y.substring(0, y.length() - 2);
                        result.setText(y);
                        str = "0";
                    }
                }
                break;
            case R.id.BtnRooting:
                if (n==""){
                    if (Double.parseDouble(x)>=0){
                        answer = Math.sqrt(Double.parseDouble(x));
                        x = Double.toString(answer);
                        if(answer%1==0)x=x.substring(0,x.length()-2);
                        result.setText(x);
                    }
                    else{
                        result.setText("无效输入");
                        x="";
                    }
                }
                else {
                    if (Double.parseDouble(y)>=0) {
                        answer = Math.sqrt(Double.parseDouble(y));
                        y = Double.toString(answer);
                        if (answer % 1 == 0) y = y.substring(0, y.length() - 2);
                        result.setText(y);
                    }
                    else{
                        result.setText("无效输入");
                        y="";
                    }
                }
                str="0";
                break;
            case R.id.BtnSquare:
                if (n != ""&&a=="")
                {
                    jieguo(n);
                    y="";
                    n="";
                }
                answer=Double.parseDouble(x)*Double.parseDouble(x);
                x=Double.toString(answer);
                if(answer%1==0)x=x.substring(0,x.length()-2);
                result.setText(x);
                str="0";
                break;
            case R.id.BtnEqual:
                if (y!="") {
                    jieguo(n);
                }
                a = "0";
                if (x.equals("-0."))x="0";
                if (x.equals("0."))x="0";
                if (n.equals("")){
                    int l=0;
                    for (l=0;l<=x.length()-1;l++){
                        if (x.charAt(l) == '.'){
                            while (x.substring(x.length()-1).equals("0")||x.substring(x.length()-1).equals(".")){
                                if (x.substring(x.length()-1).equals(".")){
                                    x=x.substring(0,x.length()-1);
                                    break;
                                }
                                if (x.substring(x.length()-1).equals("0")&&x.length()>1){
                                    x=x.substring(0,x.length()-1);
                                }
                            }
                        }
                    }
                    result.setText(x);
                }
                break;
            case R.id.BtnC:
                x="0";
                y="";
                n="";
                str="";
                a="";
                result.setText("0");
                break;
            case R.id.BtnCE:
                result.setText("0");
                if (n.equals(""))x="0";
                else y="";
                break;
            case R.id.BtnBack:
                if (n .equals( "")&&a.equals("")){
                      if(x.equals("-0.")){
                          x="0";
                          result.setText(x);
                      }
                      if(x.length()==1){
                          result.setText("0");
                          x="0";
                      }
                      if (result.getText()!="0"&&x.length()>=2) {
                          if (x.substring(0,1).equals("-")&&x.length()==2)x="0";
                          else x = x.substring(0, x.length() - 1);
                          result.setText(x);
                      }
                      }
                else if (a.equals("")){
                    if(y.equals("-0.")){
                        y="0";
                        result.setText(y);
                    }
                    if(y.length()==1){
                        result.setText("0");
                        y="";
                    }
                    if (result.getText()!="0"&&y.length()>=2) {
                        y = y.substring(0, y.length() - 1);
                        result.setText(y);
                    }
                }
                break;
            case R.id.BtnSign:
                if (n.equals("")||a.equals("0"))
                    {
                        if (x.equals("0"))break;
                        if (x.substring(0,1) .equals("-")) x = x.substring(1);
                        else x = "-" + x;
                        result.setText(x);
                    }
                else if (y!="0")
                {
                    if (y.substring(0,1).equals("-"))y=y.substring(1);
                    else y="-"+y;
                    result.setText(y);
                }
                break;
            default:
                break;
        }
    }


    public void jieguo (String a) {
        final TextView result = (TextView) findViewById(R.id.result);
        if (a.equals("+"))
            answer = Double.parseDouble(x) + Double.parseDouble(y);
        if (a.equals("-"))
            answer = Double.parseDouble(x) - Double.parseDouble(y);
        if (a.equals("*"))
            answer = Double.parseDouble(x) * Double.parseDouble(y);
        if (a.equals("/"))
            answer = Double.parseDouble(x) / Double.parseDouble(y);
        x=Double.toString(answer);
        if(answer%1==0)x=x.substring(0,x.length()-2);
        result.setText(x);
        str="0";
    }
}