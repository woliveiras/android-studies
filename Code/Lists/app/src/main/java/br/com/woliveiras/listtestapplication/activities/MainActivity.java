package br.com.woliveiras.listtestapplication.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.woliveiras.listtestapplication.PalestraFragment;
import br.com.woliveiras.listtestapplication.R;
import br.com.woliveiras.listtestapplication.models.Palestra;

public class MainActivity extends AppCompatActivity {

    private PalestraFragment fragmentPalestra1;
    private PalestraFragment fragmentPalestra2;
    private PalestraFragment fragmentPalestra3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LinearLayout mainContainer = (LinearLayout) findViewById(R.id.main_container);

        Palestra palestra = new Palestra()
                .setTitulo("Bind de views no Android")
                .setAutor("William Oliveira");

        PalestraFragment palestraFragment = PalestraFragment.newInstance(palestra);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container, palestraFragment);
        fragmentTransaction.commit();

//        fragmentPalestra1 = (PalestraFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_palestra1);
//        fragmentPalestra2 = (PalestraFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_palestra2);
//        fragmentPalestra3 = (PalestraFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_palestra3);
    }

    @Override
    protected void onResume() {
        super.onResume();

//        fragmentPalestra1.setTitulo("Bind de Views no Android");
//        fragmentPalestra1.setAutor("WOliveiraS");
//
//        fragmentPalestra2.setTitulo("React é vida! React <3");
//        fragmentPalestra2.setAutor("Jota Teles");
//
//        fragmentPalestra3.setTitulo("Java é foda!");
//        fragmentPalestra3.setAutor("Dinesh Trivedi");
    }
}
