package com.example.practice2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    private Button button;
    public float rating = 0;//Изначальное значение рейтинга
    private ActivityResultLauncher<Intent> launcher; // Объявляем переменную типа ActivityResultLauncher

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        // Регистрируем обратный вызов
        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK) {
                        // Получаем значение рейтинга из переданного Intent
                        float rating = result.getData().getFloatExtra("rating", 0.0f);
                        button.setText("Ваша оценка: " + rating);// Устанавливаем текст на кнопке,
                        // который будет содержать значение rating
                    }
                });

        TextView textView = findViewById(R.id.textView9);//textView9 - это фио пользователя
        String text = getResources().getString(R.string.fio);//инициализация строкой fio
        textView.setText(text);//установка значения

        ImageView imageView = findViewById(R.id.imageView4);//imageView4 - фото профиля пользователя
        imageView.setImageResource(R.drawable.ava1);//установка изображения

        button = findViewById(R.id.button4);// Ищем кнопку с id "button4" в разметке

        button.setOnClickListener(new View.OnClickListener()
        {
            // Устанавливаем слушатель нажатий на кнопку, который будет выполняться при нажатии на нее
            @Override
            public void onClick(View v) {
                // Создаем объект Intent для перехода на вторую активность
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("rating", rating);// Добавляем в Intent значение rating
                launcher.launch(intent); // Запускаем вторую активность с помощью обратного вызова
            }
        });

    }
}
