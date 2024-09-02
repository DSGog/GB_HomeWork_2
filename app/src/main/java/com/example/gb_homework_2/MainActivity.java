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

        binding.customView.setTopText("верхняя строчка, настроенная из кода");
        binding.customView.setBottomText("нижняя строчка, настроенная из кода");

    }
}