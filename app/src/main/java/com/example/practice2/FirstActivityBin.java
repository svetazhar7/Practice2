package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.practice2.databinding.FirstActivityBinding;


public class FirstActivityBin extends AppCompatActivity {
    private FirstActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Инициализация объекта binding через метод inflate класса FirstActivityBinding,
        // который создает экземпляр класса FirstActivityBinding на основе разметки activity_first.xml
        binding = FirstActivityBinding.inflate(getLayoutInflater());

        // Установка View для активности из объекта binding
        setContentView(binding.getRoot());

        binding.textView9.setText(getString(R.string.fio));//устаноывка строки fio на TextView9

        binding.imageView4.setImageResource(R.drawable.ava1);//установка изображения на ImageView4
    }
}