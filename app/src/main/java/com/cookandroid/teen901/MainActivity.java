package com.cookandroid.teen901;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email_id;
    Button email_btn_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("TalkTeen");
        // find ViewById
        email_id = (EditText) findViewById(R.id.email_id);
        email_btn_id = (Button) findViewById(R.id.email_btn_id);


        email_btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email_id.getText().toString().equals("미림여자정보과학고등학교")) {
                    // 미림여자정보과학고등학교를 입력하였을때 Toast로 "환영합니다"를 출력
                    Toast.makeText(getApplicationContext(), "환영합니다", Toast.LENGTH_LONG).show();
                    // submit 클릭시 액티비티 전환
                    Intent intent = new Intent(getApplicationContext(), schoolmain.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "학교명을 제대로 기입해주시기 바랍니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
