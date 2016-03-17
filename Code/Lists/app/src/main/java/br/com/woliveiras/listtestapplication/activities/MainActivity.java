package br.com.woliveiras.listtestapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.woliveiras.listtestapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOpenScrollViewActivity = (Button) findViewById(R.id.button_open_scrollview);
        Button buttonOpenViewPagerActivity = (Button) findViewById(R.id.button_open_viewpager);

        buttonOpenScrollViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScrollViewActivity.class);
                startActivity(intent);
            }
        });

        buttonOpenViewPagerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });


    }

}
