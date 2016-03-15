package br.com.woliveiras.listtestapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PalestraFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private TextView tvTitulo;
    private TextView tvAutor;


    public PalestraFragment() {
        // Required empty public constructor
    }

    public static PalestraFragment newInstance(String param1, String param2) {
        PalestraFragment fragment = new PalestraFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.speaker_list_item, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        tvTitulo = (TextView) view.findViewById(R.id.tv_titulo);
        tvAutor = (TextView) view.findViewById(R.id.tv_autor);
    }

    public void setTitulo(String titulo) {
        tvTitulo.setText(titulo);
    }

    public void setAutor(String autor) {
        tvAutor.setText("Autor: " + autor);
    }
}
