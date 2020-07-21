package com.ple.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    EditText EditText_email, EditText_password;

    RelativeLayout RelativeLayout_login;
    String emailOK="123";
    String pasewordOK = "1234";

    String inputEmail = "";
    String inputPassword="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText_email = findViewById(R.id.editText_email);
        EditText_password = findViewById(R.id.editText2_password);
        RelativeLayout_login = findViewById(R.id.relativelayout_login);


        //값 가져오기 - 검사 {123@gmail.com /1234)
        // 클릭감지
        // 값을 다른 액티비티로 넘긴다
        RelativeLayout_login.setEnabled(false);
        EditText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("SENTI",charSequence+","+i2);

                if(charSequence != null) {
                    inputEmail = charSequence.toString();
                    RelativeLayout_login.setEnabled(vaild());
                    RelativeLayout_login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String email = EditText_email.getText().toString();
                            String password = EditText_password.getText().toString();

                            Intent intent = new Intent (MainActivity.this, LoginResultActivity.class);
                            intent.putExtra("email",email);
                            intent.putExtra("password",password);
                            startActivity(intent);
                        }
                    });
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        EditText_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("SENTI",charSequence+","+i2);
                if(charSequence != null){
                    inputPassword = charSequence.toString();
                    RelativeLayout_login.setEnabled(vaild());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

       // RelativeLayout_login.setClickable(true);


    }

    public boolean vaild(){
        return inputEmail.equals(emailOK) && inputPassword.equals(pasewordOK);
    }
}

