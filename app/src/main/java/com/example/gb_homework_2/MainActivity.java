package com.example.gb_homework_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gb_homework_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textView.setText("верхняя строчка, настроенная из кода");
        binding.textView2.setText("нижняя строчка, настроенная из кода");

    }
}