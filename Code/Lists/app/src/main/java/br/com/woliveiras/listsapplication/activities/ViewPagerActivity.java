package br.com.woliveiras.listsapplication.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import br.com.woliveiras.listsapplication.adapters.PalestrasPagerAdapter;
import br.com.woliveiras.listsapplication.R;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager pagerPalestras = (ViewPager) findViewById(R.id.pager_palestras);
        pagerPalestras.setAdapter(new PalestrasPagerAdapter(getSupportFragmentManager()));
    }
}
