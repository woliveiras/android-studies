package br.com.woliveiras.listtestapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private PalestraFragment fragmentPalestra1;
    private PalestraFragment fragmentPalestra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentPalestra1 = (PalestraFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_palestra1);
        fragmentPalestra2 = (PalestraFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_palestra2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        fragmentPalestra1.setTitulo("Bind de Views no Android");
        fragmentPalestra1.setAutor("WOliveiraS");

        fragmentPalestra2.setTitulo("Android vs iOS");
        fragmentPalestra2.setAutor("Teles");
    }
}
