package br.com.woliveiras.listsapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.woliveiras.listsapplication.models.Palestra;
import br.com.woliveiras.listsapplication.R;

public class PalestraFragment extends Fragment {

    private static final String ARG_PALESTRA = "palestra";
    public static final String TYPE = "type";

    public static final int LIST_TYPE = 100;
    public static final int PAGER_TYPE = 110;

    private Palestra palestra;
    private int type;
    private TextView tvTitulo;
    private TextView tvAutor;


    public PalestraFragment() {
        // Required empty public constructor
    }

    public static PalestraFragment newInstance(Palestra palestra, int type) {
        PalestraFragment fragment = new PalestraFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PALESTRA, palestra);
        args.putInt(TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            palestra = (Palestra) getArguments().getSerializable(ARG_PALESTRA);
            type = getArguments().getInt(TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = null;

        switch (type) {
            case LIST_TYPE:
                view = inflater.inflate(R.layout.speaker_list_item, container, false);
                break;

            case PAGER_TYPE:
                view = inflater.inflate(R.layout.speaker_pager_item, container, false);
        }

        return view;
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
