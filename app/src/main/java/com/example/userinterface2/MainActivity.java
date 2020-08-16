package com.example.userinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        Button b1 = new Button(this);
        b1.setText("첫번째버튼");
        container.addView(b1);

        Button b2 = new Button(this);
        b2.setText("두번째버튼");
        container.addView(b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"첫번째버튼클릭",Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"두번째버튼클릭",Toast.LENGTH_LONG).show();
            }
        });

        setContentView(container);
    }
}
