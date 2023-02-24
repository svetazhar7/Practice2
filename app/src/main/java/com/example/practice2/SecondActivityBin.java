package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.practice2.databinding.SecondActivityBinding;

public class SecondActivityBin extends AppCompatActivity {
    private SecondActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Инициализация объекта binding через метод inflate класса SecondActivityBinding,
        // который создает экземпляр классаSecondActivityBinding на основе разметки activity_second.xml
        binding = SecondActivityBinding.inflate(getLayoutInflater());
        // Установка View для активности из объекта binding
        setContentView(binding.getRoot());
        // Декларативный способ
        binding.button.setOnClickListener(this::onClickMethod);

        // Программный способ
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "Программный способ c ViewBinding");
            }
        });
    }

    // Метод-обработчик для декларативного способа
    public void onClickMethod(View view)
    {
        Log.i("MyApp", "Декларативный способ c ViewBinding ");
    }
}
