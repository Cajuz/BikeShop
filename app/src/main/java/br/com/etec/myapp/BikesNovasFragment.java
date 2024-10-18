package br.com.etec.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BikesNovasFragment extends Fragment {

    private List<BikeNova> LstBikeNova;
    RecyclerView idRecBikeNovas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);

        idRecBikeNovas = view.findViewById(R.id.idRecBikesNovas);

        //carregando os objetos na lista

        LstBikeNova = new ArrayList<>();
        LstBikeNova.add(
                new BikeNova("Mobilete", R.drawable.mobilete));
        new BikeNova("Da cor Amarela", R.drawable.bicicleta_amarela);
        new BikeNova("Da cor Vermelha", R.drawable.bicicleta_vermelha);
        new BikeNova("Da cor Preta", R.drawable.bicicleta_preta);
        new BikeNova("Da cor Azul", R.drawable.bicicleta_azul);
        new BikeNova("Para Corrida", R.drawable.bicicleta_corrida);
        new BikeNova("De excursão", R.drawable.bicicleta_excursao);
        new BikeNova("Para Morro Baixo", R.drawable.bicicleta_morrobaixo);
        new BikeNova("Para Passeio", R.drawable.bicicleta_passeio);
        new BikeNova("Estilo Retrô", R.drawable.bicicleta_retro);


        //carregando o adaptador
        RecycleAdapterBikeNovas adapterBikeNovas = new RecycleAdapterBikeNovas(getContext(), LstBikeNova);

        idRecBikeNovas.setLayoutManager(new GridLayoutManager(getContext(), 2));

        idRecBikeNovas.setAdapter(adapterBikeNovas);


        return view;
    }
}