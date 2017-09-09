package com.medialablk.gifview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.medialablk.easygifview.EasyGifView;

public class MainActivity extends AppCompatActivity {

    private EasyGifView easyGifView;
    Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        easyGifView = (EasyGifView) findViewById(R.id.easyGifView);

        btnChange = (Button) findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                easyGifView.setGifFromResource(R.drawable.play);
            }
        });
    }
}
