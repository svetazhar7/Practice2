package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class SecondActivity extends AppCompatActivity {

    private RatingBar ratingBar;
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

        ratingBar = findViewById(R.id.ratingBar);
        float rating = getIntent().getFloatExtra("rating", 0.0f);//получение значения
        ratingBar.setRating(rating);//Установка рейтинга из переданного из прошлой активности значения
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            //слушатель на изменения значений RatingBar
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                // Создаем новый Intent для перехода в другую активность
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                // Передаем значение RatingBar в Intent
                intent.putExtra("rating", rating);
                // Запускаем активность
                startActivity(intent);
            }
        });
    }
    public void onClickMethod(View view)
    {
        Log.i("MyApp", "Декларативный способ");
    }

}