package com.example.helloandroidbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

TextView textView;
Button addbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

             textView = findViewById(R.id.text);
             addbtn = findViewById(R.id.addbtn);





        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              textView.setText("Hello android");
            }
        });

    }
}