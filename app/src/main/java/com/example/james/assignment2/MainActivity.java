package com.example.james.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    static String [] contacts={"Syed Khubaib","Mutahir Kiani", "Nifasat Ali","Qadir Nawaz" ,"Arsalan Amjid" ,"Hamza Hanif", "Muhammad Zubair", "Safyan Yousafzai","Rana Azman", "Zaheer Uddin" ,"Usman Aziz","Zakham baig" , "Mushtaq Ahmed", "Amjid Javaid" , "Abdul Aziz", "Hanif Muhammad" ,"Mehmood Sadiq" , "Muhammad Ashraf",  "Gulraiz Khan", "Ashraf Thanvi","Sharjeel Peeto", "Waqar Khan", "Shanza Aslam" ,"Waheed Raza", "Ebad Javaid", "Furqan Sajjad" , "Javaid Akram", "Khuraam Nawaz", "Muhammad Bilal",  "Fareed Ullah", "Syed Munir", "Syed Abdullah", "Jawad Khan", "Sahil Khan", "Javed Khan", "Yaseen Khan","Nazar Muhammad","Arif Khawar", "Obaid Nawaz", "Paris Khan", "Sajjad Jahanzaib", "Ghaznavi Amjad", "Dawood Lala", "Jawad Khan", "Shahzaib Khizar", "Ijaz Zaman" ,"Akram Jan","Khan Jan","Wahab Khan","Ijaz Aslam", "Yaseen Iftikhar"};
    TextView nameView,number,firstAlphabits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ListAdapter listAdapter=new CustomizeListData(this,contacts);

        ListView mylistView=(ListView) findViewById(R.id.Listviiew1);
        mylistView.setAdapter(listAdapter);

        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name=String.valueOf(parent.getItemAtPosition(position));


                Intent detailView=new Intent(MainActivity.this,SecondScreenController.class);
                detailView.putExtra("contact", position);
                startActivity(detailView);
            }

        });
    }
}
