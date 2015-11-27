package com.example.nnnnew.dailycost;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;

public class  AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        final Button expens = (Button) findViewById(R.id.expense_add_button);
        final Button income = (Button) findViewById(R.id.income_add_button);
        expens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorClick = Color.argb(255,248,88,88);
                int colorNonClick = Color.argb(255,255,255,255);
                int textcolorClick = Color.argb(255,255,255,255);
                int textcolorNonClick = Color.argb(255,0,0,0);
                expens.setBackgroundColor(colorClick);
                income.setBackgroundColor(colorNonClick);
                expens.setTextColor(textcolorClick);
                income.setTextColor(textcolorNonClick);

            }
        });


        income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorClick = Color.argb(255, 61, 228, 153);
                int colorNonClick = Color.argb(255,255,255,255);
                int textcolorClick = Color.argb(255,255,255,255);
                int textcolorNonClick = Color.argb(255,0,0,0);
                income.setBackgroundColor(colorClick);
                expens.setBackgroundColor(colorNonClick);
                income.setTextColor(textcolorClick);
                expens.setTextColor(textcolorNonClick);


            }
        });




    }


}
