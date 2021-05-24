package com.cookandroid.teen901;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class snack extends AppCompatActivity {
    ImageButton back_btn;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        setTitle("스낵류");

        // findViewById
        back_btn = (ImageButton) findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 스낵류 클릭시 스낵류 화면 전환 전환
                Intent intent = new Intent(getApplicationContext(), schoolmain.class);
                startActivity(intent);
            }
        });
    }
}
