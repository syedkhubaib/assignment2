package com.example.james.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondScreenController extends Activity{

    TextView name, number, firstAlphabet;
    ImageView listImage;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);
        getAllView();

        Intent intent=getIntent();
        int positin=intent.getIntExtra("contact",0);
        listImage =(ImageView)findViewById(R.id.secondscreen); //for accessing image in xml
        name.setText(MainActivity.contacts[positin]);
        number.setText(CustomizeListData.contactNumber[positin]);

        splitName(MainActivity.contacts[positin]);
        changeColor();
    }

    private void getAllView()
    {
        name=(TextView)findViewById(R.id.nameView2);
        number=(TextView)findViewById(R.id.numberView2);
        firstAlphabet=(TextView)findViewById(R.id.textView3);

    }


    private  void splitName(String name){
        String[] words=name.split(" ");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        String twchar="";
        for(String w:words){
            twchar+=w.charAt(0);
        }
        firstAlphabet.setText(twchar);
    }
    public void changeColor()
    {
        if(firstAlphabet.getText().charAt(0)=='A'  || firstAlphabet.getText().charAt(0)=='B' || firstAlphabet.getText().charAt(0)=='C')
            listImage.setImageResource(R.drawable.icon2);
        else if(firstAlphabet.getText().charAt(0)=='D'  || firstAlphabet.getText().charAt(0)=='E' || firstAlphabet.getText().charAt(0)=='F')
            listImage.setImageResource(R.drawable.icon3);
        else if(firstAlphabet.getText().charAt(0)=='G'  || firstAlphabet.getText().charAt(0)=='H' || firstAlphabet.getText().charAt(0)=='I')
            listImage.setImageResource(R.drawable.icon4);
        else if(firstAlphabet.getText().charAt(0)=='J'  || firstAlphabet.getText().charAt(0)=='K' || firstAlphabet.getText().charAt(0)=='L')
            listImage.setImageResource(R.drawable.icon5);
        else if(firstAlphabet.getText().charAt(0)=='M'  || firstAlphabet.getText().charAt(0)=='N' || firstAlphabet.getText().charAt(0)=='O')
            listImage.setImageResource(R.drawable.icon6);
        else if(firstAlphabet.getText().charAt(0)=='P'  || firstAlphabet.getText().charAt(0)=='Q' || firstAlphabet.getText().charAt(0)=='R')
            listImage.setImageResource(R.drawable.icon6);
        else if(firstAlphabet.getText().charAt(0)=='S'  || firstAlphabet.getText().charAt(0)=='T' || firstAlphabet.getText().charAt(0)=='U')
            listImage.setImageResource(R.drawable.icon2);
        else if(firstAlphabet.getText().charAt(0)=='W'  || firstAlphabet.getText().charAt(0)=='X' || firstAlphabet.getText().charAt(0)=='Y')
            listImage.setImageResource(R.drawable.icon3);
        else if (firstAlphabet.getText().charAt(0)=='Z')
            listImage.setImageResource(R.drawable.icon4);




    }
}
