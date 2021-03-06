package com.cookandroid.teen901;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class schoolmain extends AppCompatActivity {
    ImageButton snack_back_btn;
    Button btn_snack;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schoolmain);
        setTitle("TalkTeen");

        // findViewById
        snack_back_btn = (ImageButton)findViewById(R.id.snack_back_btn);
        btn_snack = (Button)findViewById(R.id.btn_snack);

        snack_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // back 화사표 클릭시 로그인 액티비티 전환
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        btn_snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 새우깡 클릭 시 snack 액티비티 전환
                Intent intent = new Intent(getApplicationContext(), snack.class);
                startActivity(intent);
            }
        });
    }
}