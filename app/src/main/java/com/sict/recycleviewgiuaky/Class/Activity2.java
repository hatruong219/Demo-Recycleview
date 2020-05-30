package com.sict.recycleviewgiuaky.Class;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sict.recycleviewgiuaky.Data.DataSong;
import com.sict.recycleviewgiuaky.R;
import com.sict.recycleviewgiuaky.adapter.Adapter;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<DataSong> dataSongs;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.recycleview);
        recyclerView = (RecyclerView) findViewById( R.id.recycleview );
        // data
        ArrayList<DataSong> dataSongs = new ArrayList<>();
        DataSong data1 = new DataSong( R.drawable.tienanh1,"Người Xa Lạ Từng Yêu","Hồ Gia Khánh" );
        dataSongs.add( data1 );
        DataSong data2 = new DataSong( R.drawable.tienanh2,"Về Với Thực Tại","Nguyễn Đình Vũ" );
        dataSongs.add( data2 );
        DataSong data3 = new DataSong( R.drawable.tienanh3,"Ngắm Hoa Lệ Rơi 2","Duy Cường" );
        dataSongs.add( data3 );
        DataSong data4 = new DataSong( R.drawable.tienanh4,"Bước Qua Đời Nhau","Lê Bảo Bình" );
        dataSongs.add( data4 );
        DataSong data5 = new DataSong( R.drawable.tienanh5,"Buồn Lắm Em Ơi","Trịnh Đình Quang" );
        dataSongs.add( data5 );
        DataSong data6 = new DataSong( R.drawable.tienanh6,"Chỉ Là Câu Hứa","Đinh Tùng Huy" );
        dataSongs.add( data6 );
        adapter = new Adapter( this, dataSongs );
        adapter.notifyDataSetChanged();

        recyclerView.setHasFixedSize( true );
        LinearLayoutManager layoutManager = new LinearLayoutManager( this, RecyclerView.VERTICAL, false );
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setAdapter( adapter );

    }
}
