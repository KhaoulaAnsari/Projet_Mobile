package com.example.projet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EmploiActivity extends AppCompatActivity {
    private Button btnDownload;
    String URL = "http://africau.edu/images/default/sample.pdf"; //exemple d'Url de l'emploi du temps
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDownload = (Button) findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new DownloadTask(EmploiActivity.this, URL);
            }
        });
    }
}
