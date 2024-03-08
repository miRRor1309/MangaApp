package com.example.mangaapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mangaapp.ActionActivity;
import com.example.mangaapp.FantasyActivity;
import com.example.mangaapp.R;
import com.example.mangaapp.model.Action;
import com.example.mangaapp.model.Fantasy;

import java.util.ArrayList;

public class FantasyAdapter extends RecyclerView.Adapter<FantasyAdapter.ViewHolder>{
    FantasyActivity context;
    ArrayList<Fantasy> arr_Fantasy;
    public FantasyAdapter(FantasyActivity context,ArrayList<Fantasy>arr_Fantasy){
        this.context=context;
        this.arr_Fantasy=arr_Fantasy;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View viewFantasy=layoutInflater.inflate(R.layout.items_action,parent,false);
        ViewHolder  viewHolderFantasy=new ViewHolder(viewFantasy);
        return viewHolderFantasy;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fantasy Ft=arr_Fantasy.get(position);
        holder.imgAction.setImageResource(Ft.getHinhAc());
        holder.txtTenTruyen.setText(Ft.getTentruyenAc());
        holder.txtchap.setText(Ft.getChapAc()+"");
    }

    @Override
    public int getItemCount() {
        return arr_Fantasy.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAction;
        TextView txtchap,txtTenTruyen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAction=itemView.findViewById(R.id.imgAction);
            txtchap=itemView.findViewById(R.id.txtChap);
            txtTenTruyen=itemView.findViewById(R.id.txtTenTruyen);
        }
    }
}
