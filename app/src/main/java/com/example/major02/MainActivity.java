package com.example.major02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button startBtn;
    Button aboutBtn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn  = findViewById(R.id.startBtn);
        aboutBtn = findViewById(R.id.aboutBtn);
        final EditText nameText = findViewById(R.id.nameEditText);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(),question.class);
                intent.putExtra("Myname",name);
                startActivity(intent);

            }
        });


    }
}
