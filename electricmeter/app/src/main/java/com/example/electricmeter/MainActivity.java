package com.example.electricmeter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et = findViewById(R.id.edittext1);
        TextView tv = findViewById(R.id.textView7);
        Button bt = findViewById(R.id.Pokazania);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et.getText().toString());
                tv.setText(""+num1*4);
            }
        });

        Button profile_button = findViewById(R.id.profile_button);
        profile_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent change = new Intent(".Profile");
                startActivity(change);
            }
        });
    }

}