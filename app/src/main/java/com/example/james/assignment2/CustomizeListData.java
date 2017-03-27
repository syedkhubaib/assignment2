package com.example.james.assignment2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;

/**
 * Created by James Bong on 3/25/2017.
 */

public class CustomizeListData extends ArrayAdapter<String> {

    TextView nameView,number,firstAlphabits;
    String contactName;
    static String [] contactNumber={"03459044641","03449265572", "03005251693","03339144674","234235345",
            "34234523536","3453453457","45645645668","56456456459","547457567510",
            "345345345311","45634454512","45634646313","5756756714","65768787687",
            "456465756756","9877676766","34543534534","8797979795","893974987398",
            "74573487538","7374872337","342342323","4353453456","564564543",
            "6575675434","64563432342","67634543443","788732234","783494782",
            "34534534534","5654654656","5464565467","54645634534","4534543534",
            "42342423","345353455","453453453","345435643","3465656554",
            "4565674543","5645634","54676754434","523122343","45234534",
            "34534534534","435345345","3456674554","546456455","564564564",
            "5464565465","567567676"};
    ImageView listImage;
    public CustomizeListData(Context context, String [] resource)
    {

        super(context, R.layout.custom_list,resource); //load over costume view with all contact string array
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){

        LayoutInflater fromXMLViewToJavaView=LayoutInflater.from(getContext()); //coverts xml file to view object

        View myView=fromXMLViewToJavaView.inflate(R.layout.custom_list,parent,false); //it tells convert xml into this object i.e myView



        firstAlphabits=(TextView)myView.findViewById(R.id.twoNameCharacter); //for first alphabets of the name
        nameView=(TextView)myView.findViewById(R.id.nameView); //for showing full name
        number=(TextView)myView.findViewById(R.id.number); //for mobile number
        listImage =(ImageView) myView.findViewById(R.id.imageView); //for accessing image in xml


        contactName= getItem(position); //for returning the contact name of the position specified in string name array


        nameView.setText(contactName); // for setting contact name in xml view
        //for splitting name into first name and second name
        splitName();
        changeColor();
        number.setText(contactNumber[position]);




    return myView;

    }

     public void changeColor()
    {
        if(firstAlphabits.getText().charAt(0)=='A'  || firstAlphabits.getText().charAt(0)=='B' || firstAlphabits.getText().charAt(0)=='C')
              listImage.setImageResource(R.drawable.icon2);
        else if(firstAlphabits.getText().charAt(0)=='D'  || firstAlphabits.getText().charAt(0)=='E' || firstAlphabits.getText().charAt(0)=='F')
            listImage.setImageResource(R.drawable.icon3);
        else if(firstAlphabits.getText().charAt(0)=='G'  || firstAlphabits.getText().charAt(0)=='H' || firstAlphabits.getText().charAt(0)=='I')
            listImage.setImageResource(R.drawable.icon4);
        else if(firstAlphabits.getText().charAt(0)=='J'  || firstAlphabits.getText().charAt(0)=='K' || firstAlphabits.getText().charAt(0)=='L')
            listImage.setImageResource(R.drawable.icon5);
        else if(firstAlphabits.getText().charAt(0)=='M'  || firstAlphabits.getText().charAt(0)=='N' || firstAlphabits.getText().charAt(0)=='O')
            listImage.setImageResource(R.drawable.icon6);
        else if(firstAlphabits.getText().charAt(0)=='P'  || firstAlphabits.getText().charAt(0)=='Q' || firstAlphabits.getText().charAt(0)=='R')
            listImage.setImageResource(R.drawable.icon6);
        else if(firstAlphabits.getText().charAt(0)=='S'  || firstAlphabits.getText().charAt(0)=='T' || firstAlphabits.getText().charAt(0)=='U')
            listImage.setImageResource(R.drawable.icon2);
        else if(firstAlphabits.getText().charAt(0)=='W'  || firstAlphabits.getText().charAt(0)=='X' || firstAlphabits.getText().charAt(0)=='Y')
            listImage.setImageResource(R.drawable.icon3);
        else if (firstAlphabits.getText().charAt(0)=='Z')
            listImage.setImageResource(R.drawable.icon4);




    }
    private  void splitName(){
        String[] words=contactName.split(" ");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        String twchar="";
        for(String w:words){

            twchar+=w.charAt(0);
        }
        firstAlphabits.setText(twchar);
    }
}
