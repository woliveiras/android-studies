package br.com.woliveiras.listtestapplication.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import br.com.woliveiras.listtestapplication.fragments.PalestraFragment;
import br.com.woliveiras.listtestapplication.models.Palestra;

/**
 * Created by williamsouza on 3/17/16.
 */
public class PalestrasPagerAdapter extends FragmentPagerAdapter {

    private final List<Palestra> listaPalestras;

    public PalestrasPagerAdapter(FragmentManager fm) {
        super(fm);

        listaPalestras = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Palestra palestra = new Palestra()
                    .setTitulo("Android cap. " + (i + 1))
                    .setAutor("WOliveiras");

            listaPalestras.add(palestra);
        }
    }

    @Override
    public Fragment getItem(int position) {
        Palestra palestra = listaPalestras.get(position);

        return PalestraFragment.newInstance(palestra, PalestraFragment.PAGER_TYPE);
    }

    @Override
    public int getCount() {
        return listaPalestras == null ? 0 : listaPalestras.size();
    }
}
