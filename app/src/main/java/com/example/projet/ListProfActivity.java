package com.example.projet;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseUser;

public class ListProfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        //

        UserAccount S1 = new UserAccount("RACHAD","Prof. Développement Mobile");
        UserAccount S2 = new UserAccount("BOUNABAT","Prof. Gestion de projet Informatique");
        UserAccount S3 = new UserAccount("MOUMANE","Prof. Sécurité des Systèmes et Réseaux");
        UserAccount S4 = new UserAccount("AL MACHKOUR","Prof. Théorie de Jeux");
        UserAccount S5 = new UserAccount("NAFIL","Prof. Production Multimédia");
        UserAccount S6 = new UserAccount("ZELLOU","Prof. Frameworks de Développement Web");
        UserAccount S7 = new UserAccount("EL HACHIMI","Prof. Gestion de Services");
        UserAccount S8 = new UserAccount("KOBBANE","Prof. Technologies WAN");
        UserAccount S9 = new UserAccount("OUDADE","Prof. Management du Web");
        UserAccount S10 = new UserAccount("BELKASMI","Prof. Codage et Cryptographie");
        UserAccount S11 = new UserAccount("ABNANE","Prof. Programmation Client Serveur");
        UserAccount S12 = new UserAccount("IDRI","Prof. Knwoldge Data Discovery");
        UserAccount S13 = new UserAccount("ZELLOU","Prof. Technologies XML");
        UserAccount S14 = new UserAccount("BELAHMER","Prof. Business English");
        UserAccount S15 = new UserAccount("LIHI","Prof. Techniques R.E. et E.E.");

        UserAccount[] users = new UserAccount[]{S1,S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15};


        // android.R.layout.simple_list_item_1 is a constant predefined layout of Android.
        // used to create a ListView with simple ListItem (Only one TextView).

        ArrayAdapter<UserAccount> arrayAdapter
                = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1 , users);

        listView.setAdapter(arrayAdapter);
    }


}