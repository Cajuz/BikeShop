package br.com.etec.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapterBikeNovas extends RecyclerView.Adapter<RecycleAdapterBikeNovas.ViewHolder> {
    //variaveis que representam a lista e o contexto
    private Context context;
    private List<BikeNova> lstBikeNova;

    //crianco o construtor


    public RecycleAdapterBikeNovas(Context context, List<BikeNova> lstBikeNova) {
        this.context = context;
        this.lstBikeNova = lstBikeNova;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bikes_novas,parent,false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idModeloTituloBikeNova.setText(lstBikeNova.get(position.getTitulo()));
        holder.idModeloImagemBikeNova.setImageResource(lstBikeNova.get(position.getImagem()));

    }

    @Override
    public int getItemCount() {
        return lstBikeNova.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
     // Criando variavel que representa o xml no java
        CardView idModelosBikeNovas;
        ImageView idModeloImagemBikeNova;
        TextView idModeloTituloBikeNova;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //apresentando o java para o xml do modelo
            idModelosBikeNovas = itemView.findViewById(R.id.idModelosBikeNovas);
            idModeloImagemBikeNova = itemView.findViewById(R.id.idModeloImagemBikeNova);
            idModeloTituloBikeNova = itemView.findViewById(R.id.idModeloTituloBikeNova);

        }
    }
}
