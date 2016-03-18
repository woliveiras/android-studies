package br.com.woliveiras.listtestapplication.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.woliveiras.listtestapplication.fragments.PalestraFragment;
import br.com.woliveiras.listtestapplication.R;
import br.com.woliveiras.listtestapplication.models.Palestra;

public class ScrollViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palestra_list);

        Palestra palestra1 = new Palestra()
                .setTitulo("Bind de views no Android")
                .setAutor("William Oliveira");

        Palestra palestra2 = new Palestra()
                .setTitulo("React é lindo!")
                .setAutor("Jota Teles");

        PalestraFragment palestraFragment1 = PalestraFragment.newInstance(palestra1, PalestraFragment.LIST_TYPE);
        PalestraFragment palestraFragment2 = PalestraFragment.newInstance(palestra2, PalestraFragment.LIST_TYPE);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container, palestraFragment1);
        fragmentTransaction.add(R.id.main_container, palestraFragment2);
        fragmentTransaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
