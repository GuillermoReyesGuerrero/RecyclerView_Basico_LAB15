package com.example.guillermo.recyclerview_basico_lab15;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by guillermo on 26/02/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListViewHolder>{
    String[][] datos;

    public Adapter(String[][] datos) {
        this.datos = datos;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        ListViewHolder lista=new ListViewHolder(view);
        return lista;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.txtNombre.setText(datos[position][0]);
        holder.txtControl.setText(datos[position][1]);
        holder.txtCarrera.setText(datos[position][2]);

    }

    @Override
    public int getItemCount() {
        return datos.length;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView txtNombre,txtControl,txtCarrera;

        public ListViewHolder(View itemView) {
            super(itemView);
            imagen=itemView.findViewById(R.id.imagen);
            txtNombre=itemView.findViewById(R.id.txtNombre);
            txtControl=itemView.findViewById(R.id.txtControl);
            txtCarrera=itemView.findViewById(R.id.txtCarrera);
        }
    }
}
