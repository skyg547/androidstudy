package com.ple.myparcable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> names = new ArrayList<String>();

                names.add("dkddd");names.add("wlstn");

                getIntent().putExtra("names",names);
                Intent intent = new Intent(getApplicationContext(),Menu.class);
                startActivityForResult(intent,101);
            }
        });
    }
}
