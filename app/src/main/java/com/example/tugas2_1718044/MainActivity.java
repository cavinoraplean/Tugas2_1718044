package com.example.tugas2_1718044;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView ivSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivSetting = findViewById(R.id.ivSetting);
        ivSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_follow:
                onStop();
                break;
            case R.id.ivSetting:
                Intent setting = new Intent(MainActivity.this, AppSetting.class);
                startActivity(setting);
                return;
        }
    }
}

//    public void setting(){
//        Intent a = new Intent(MainActivity.this, AppSetting.class);
//        startActivity(a);
//    }


