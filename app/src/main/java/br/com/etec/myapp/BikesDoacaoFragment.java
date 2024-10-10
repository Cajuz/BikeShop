package br.com.etec.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class BikesDoacaoFragment extends Fragment {
    FloatingActionButton idFABBikeDoacao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        idFABBikeDoacao = getView().findViewById(R.id.idFABBikeDoacao);
        View view = inflater.inflate(R.layout.fragment_bikes_doacao, container, false);
idFABBikeDoacao.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(),
                "você clikou no botão do Eduardo crazy dog!", Toast.LENGTH_SHORT).show();
    }
});
        return view;
    }
}