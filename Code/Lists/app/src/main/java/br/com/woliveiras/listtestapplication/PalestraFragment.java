package br.com.woliveiras.listtestapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.woliveiras.listtestapplication.models.Palestra;


public class PalestraFragment extends Fragment {

    private static final String ARG_PALESTRA = "palestra";
    private Palestra palestra;
    private TextView tvTitulo;
    private TextView tvAutor;


    public PalestraFragment() {
        // Required empty public constructor
    }

    public static PalestraFragment newInstance(Palestra palestra) {
        PalestraFragment fragment = new PalestraFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PALESTRA, palestra);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            palestra = (Palestra) getArguments().getSerializable(ARG_PALESTRA);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.speaker_list_item, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        tvTitulo = (TextView) view.findViewById(R.id.tv_titulo);
        tvAutor = (TextView) view.findViewById(R.id.tv_autor);

        bindViews(palestra);
    }

    public void setPalestra(Palestra palestra) {
        this.palestra = palestra;
        bindViews(palestra);

    }

    public void bindViews(Palestra palestra) {
        tvTitulo.setText(palestra.getTitulo());
        tvAutor.setText(palestra.getAutor());
    }
}
