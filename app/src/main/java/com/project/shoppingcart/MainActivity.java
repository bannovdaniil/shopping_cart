package com.project.shoppingcart;

import android.os.Bundle;
import android.view.FocusFinder;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonPlus = findViewById(R.id.button_plus);
        final Button buttonMinus = findViewById(R.id.button_minus);


        buttonPlus.setOnClickListener(view -> setCountEditText(1));
        buttonMinus.setOnClickListener(view -> setCountEditText(-1));
    }

    public void setCountEditText(int num) {
        EditText editText = findViewById(R.id.item_count_EditText);
        Integer count = 0;
        try {
            count = Integer.parseInt(editText.getText().toString());
        } catch (Exception err) {
        }
        count += num;
        if (count >= 0) {
            editText.setText(count.toString());
        } else {
            editText.setText("0");
        }
    }
}