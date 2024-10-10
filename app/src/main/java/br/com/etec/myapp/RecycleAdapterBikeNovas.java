package br.com.etec.myapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapterBikeNovas extends RecyclerView.Adapter<RecycleAdapterBikeNovas.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
     // Criando variavel que representa o xml no java
        CardView idModelosBikeNovas;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //apresentando o java para o xml do modelo
            idModelosBikeNovas = itemView.findViewById(R.id.idModelosBikeNovas);
        }
    }
}
