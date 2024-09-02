package com.example.gb_homework_2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.example.gb_homework_2.databinding.CustomViewBinding;

public class CustomView extends FrameLayout {

    private CustomViewBinding binding;

    public CustomView(Context context) {
        super(context);
        init(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        binding = CustomViewBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public void setTopText(String text) {
        binding.textView.setText(text);
    }

    public void setBottomText(String text) {
        binding.textView2.setText(text);
    }
}