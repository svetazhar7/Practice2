package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        TextView textView = findViewById(R.id.textView9);//textView9 - это фио пользователя
        String text = getResources().getString(R.string.fio);//инициализация строкой fio
        textView.setText(text);//установка значения

        ImageView imageView = findViewById(R.id.imageView4);//imageView4 - фото профиля пользователя
        imageView.setImageResource(R.drawable.ava1);//установка изображения
    }
}


