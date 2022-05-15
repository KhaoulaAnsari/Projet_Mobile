package com.example.projet;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListStudentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        //

        UserAccount S1 = new UserAccount("ABOUROUH NAOUFAL","1");
        UserAccount S2 = new UserAccount("AJRAOUI OMAR","2");
        UserAccount S3 = new UserAccount("ALHAOUIL AMINA","3");
        UserAccount S4 = new UserAccount("AMER BOUTAINA ","4");
        UserAccount S5 = new UserAccount("AMIRA WISSAL","5");
        UserAccount S6 = new UserAccount("ANSARI KHAOULA","6");
        UserAccount S7 = new UserAccount("ASSADI IKRAM","7");
        UserAccount S8 = new UserAccount("BAIBA MOHAMED","8");
        UserAccount S9 = new UserAccount("BAKILI YASSINE","9");
        UserAccount S10 = new UserAccount("BENKACHCHA YAHYA","10");
        UserAccount S11 = new UserAccount("BESSA HAMZA","11");
        UserAccount S12 = new UserAccount("BOUAICHE ABDELLAH","12");
        UserAccount S13 = new UserAccount("BOUASSA KHALID","13");
        UserAccount S14 = new UserAccount("CHAMRANI SALIMA","14");
        UserAccount S15 = new UserAccount("CHENIGUER TAOUFIQ","15");
        UserAccount S16 = new UserAccount("ABOUROUH NAOUFAL","16");
        UserAccount S17 = new UserAccount("AJRAOUI OMAR","17");
        UserAccount S18 = new UserAccount("ALHAOUIL AMINA","18");
        UserAccount S19 = new UserAccount("AMER BOUTAINA ","19");
        UserAccount S20 = new UserAccount("AMIRA WISSAL","20");
        UserAccount S21 = new UserAccount("ANSARI KHAOULA","21");
        UserAccount S22 = new UserAccount("ASSADI IKRAM","22");
        UserAccount S23 = new UserAccount("BAIBA MOHAMED","23");
        UserAccount S24 = new UserAccount("BAKILI YASSINE","24");
        UserAccount S25 = new UserAccount("BENKACHCHA YAHYA","25");
        UserAccount S26 = new UserAccount("BESSA HAMZA","26");
        UserAccount S27 = new UserAccount("BOUAICHE ABDELLAH","27");
        UserAccount S28 = new UserAccount("BOUASSA KHALID","28");
        UserAccount S29 = new UserAccount("CHAMRANI SALIMA","29");
        UserAccount S30 = new UserAccount("CHENIGUER TAOUFIQ","30");

        UserAccount[] users = new UserAccount[]{S1,S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16,S17, S18, S19, S20, S21, S22, S23, S24, S25, S26, S27, S28, S29, S30};



        // android.R.layout.simple_list_item_1 is a constant predefined layout of Android.
        // used to create a ListView with simple ListItem (Only one TextView).

        ArrayAdapter<UserAccount> arrayAdapter
                = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1 , users);

        listView.setAdapter(arrayAdapter);

    }


}