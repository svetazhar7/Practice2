package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Button button4 = findViewById(R.id.button3);
        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "Программный способ");
            }
        };
        button4.setOnClickListener(myClickListener);

    }
    public void onClickMethod(View view)
    {
        Log.i("MyApp", "Декларативный способ");
    }

}

