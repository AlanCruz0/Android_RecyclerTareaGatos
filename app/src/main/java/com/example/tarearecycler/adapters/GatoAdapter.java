package com.example.tarearecycler.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull GatoAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return gatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
