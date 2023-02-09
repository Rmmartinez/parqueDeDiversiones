package com.example.parquedediversiones.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parquedediversiones.R;
import com.example.parquedediversiones.entidades.jugador;

import java.util.ArrayList;

public class listaEstadisticasAdapter extends RecyclerView.Adapter<listaEstadisticasAdapter.EstadisticaViewHolder> {

    ArrayList<jugador> listaJugadores;

    public listaEstadisticasAdapter( ArrayList<jugador> listaJugadores){
        this.listaJugadores = listaJugadores;
    }

    @NonNull
    @Override
    public EstadisticaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_estadisticas, null, false);
        return new EstadisticaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EstadisticaViewHolder holder, int position) {

            holder.viewNombre.setText(listaJugadores.get(position).getNombreJugador() + "\n Puntaje:" + listaJugadores.get(position).getPuntaje());
    }

    @Override
    public int getItemCount() {
        return listaJugadores.size();
    }

    public class EstadisticaViewHolder extends RecyclerView.ViewHolder {

        TextView viewNombre;


        public EstadisticaViewHolder(@NonNull View itemView) {
            super(itemView);
            viewNombre = itemView.findViewById(R.id.NombreJugador);
        }
    }

}
