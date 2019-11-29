package com.example.tugas9backup.Adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas9backup.R;
import com.example.tugas9backup.model.Mahasiswa;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.ViewHolder> {
    private ArrayList<Mahasiswa> dataList;

    public RecViewAdapter(ArrayList<Mahasiswa> datalist){
        this.dataList = datalist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater. from (parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs , parent, false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNim());
        holder.txtNoHP.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return (dataList != null ? dataList.size(): 0);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHP;
        public ViewHolder(@NonNull View itemview){
            super(itemview);
            txtNama = itemview.findViewById(R.id.txtNamaMhs);
            txtNpm  = itemview.findViewById(R.id.txtNimMhs);
            txtNoHP = itemview.findViewById(R.id.txtNhpMhs);
        }
    }
}
