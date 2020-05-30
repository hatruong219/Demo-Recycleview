package com.sict.recycleviewgiuaky.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.sict.recycleviewgiuaky.Data.DataSong;
import com.sict.recycleviewgiuaky.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private ArrayList<DataSong> dataSongs;
    public Adapter(Context context, ArrayList<DataSong> dataSongs) {
        this.context = context;
        this.dataSongs = dataSongs;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from( parent.getContext() );
        View view = layoutInflater.inflate( R.layout.itemsong, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, final int position) {
        Picasso.with( context ).load( dataSongs.get( position ).getImgitem() )
                .into( holder.imgitem );
        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( context,"Bạn đã chọn "+dataSongs.get( position ).getNamesong(),Toast.LENGTH_SHORT ).show();
            }
        } );
        holder.namesong.setText( dataSongs.get( position ).getNamesong() );
        holder.namesing.setText( dataSongs.get( position ).getNamesing() );
    }

    @Override
    public int getItemCount() {
        return dataSongs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgitem;
        TextView namesong;
        TextView namesing;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            // ánh xạ
            anhxa();
        }

        private void anhxa() {
            imgitem = itemView.findViewById( R.id.imgitem );
            namesong = itemView.findViewById( R.id.namesong );
            namesing = itemView.findViewById( R.id.namesing );
        }
    }
}
