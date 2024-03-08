package com.example.mangaapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mangaapp.FantasyActivity;
import com.example.mangaapp.R;
import com.example.mangaapp.ShounenActivity;
import com.example.mangaapp.model.Fantasy;
import com.example.mangaapp.model.Shounen;

import java.util.ArrayList;

public class ShounenAdapter extends RecyclerView.Adapter<ShounenAdapter.ViewHolder>{
    ShounenActivity context;
    ArrayList<Shounen> arr_Shounen;
    public ShounenAdapter(ShounenActivity context,ArrayList<Shounen>arr_Fantasy){
        this.context=context;
        this.arr_Shounen=arr_Shounen;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View viewShounen=layoutInflater.inflate(R.layout.items_action,parent,false);
        ViewHolder  viewHolderShounen=new ViewHolder(viewShounen);
        return viewHolderShounen;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Shounen Sh=arr_Shounen.get(position);
        holder.imgAction.setImageResource(Sh.getHinhAc());
        holder.txtTenTruyen.setText(Sh.getTentruyenAc());
        holder.txtchap.setText(Sh.getChapAc()+"");
    }

    @Override
    public int getItemCount() {
        return arr_Shounen.size();
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
