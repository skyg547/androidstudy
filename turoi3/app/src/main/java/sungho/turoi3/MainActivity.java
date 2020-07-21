package sungho.turoi3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] items = {"망고 쥬스", "토마토 쥬스", "포도 쥬스"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button listButton =  (Button)findViewById(R.id.List);

    listButton.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v){

            AlretDialog.Builder builder = new AlretDialog.Builder(MainActivity.this);
            builder.setTitle("리스트");
            builder.setItems(items, new DialogInterface.OnClickListener(){
                @Override
                        public void onClick(DialogInterface dialogInterface,int i){
                    Toast.makeText(getApplicationContext(), items[i], Toast.LENGTH_SHORT).show();

                }

            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

    });

    Button exitButton = (Button) findViewById(R.id.Exit);
    exitButton.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View v){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("정말 종ㅇ료/");
                    builder.setTitle("종료 알림")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialog.cancel();
                                }
                            });
        }
    });
}
