package com.ple.myparcable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Intent pass =getIntent();
        processIntent(pass);

    }


    private  void processIntent(Intent intent){

        if(intent != null){
            ArrayList<String> namese = (ArrayList<String>) intent.getSerializableExtra("names");

            if(namese != null){

                Toast.makeText(getApplicationContext(),"전달받은 이름 리스트 개수 :" +namese.size(), Toast.LENGTH_SHORT).show();


            }
        }

    }
}
