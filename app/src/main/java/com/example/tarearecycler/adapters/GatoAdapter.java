package com.example.tarearecycler.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tarearecycler.R;
import com.example.tarearecycler.models.Gato;

import java.util.List;

public class GatoAdapter extends RecyclerView.Adapter<GatoAdapter.ViewHolder>{

    private List<Gato> gatos;

    public GatoAdapter(List<Gato> gatos) {
        this.gatos = gatos;
    }

    @NonNull
    @Override
    public GatoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.gato_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GatoAdapter.ViewHolder holder, int position) {
        Gato gato = gatos.get(position);
        holder.setData(gato);
    }

    @Override
    public int getItemCount() {
        return gatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtBigote;
        TextView txtColor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtBigote = itemView.findViewById(R.id.bigotes);
            txtColor = itemView.findViewById(R.id.color);
        }
        public void setData(Gato gato) {
            txtBigote.setText(gato.getBigotes().getTamano());
            txtColor.setText(gato.getColor().getColor());
        }
    }
}
