package com.sict.recycleviewgiuaky;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.sict.recycleviewgiuaky.Class.Activity2;

public class MainActivity extends AppCompatActivity {
    private Button btnopen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Toolbar toolbar = findViewById( R.id.toolbar );
        ImageView imgmusic = findViewById( R.id.imgmusic );
        setSupportActionBar( toolbar );

        Glide.with( getApplicationContext() )
                .load( "" )
                .centerCrop().optionalCircleCrop()
                .into( imgmusic );
        btnopen = (Button) findViewById( R.id.btnopen );
        btnopen.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), Activity2.class );
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu , menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.share){
            Toast.makeText( getApplicationContext(), "Bạn chọn Share" , Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.restore){
            Toast.makeText( getApplicationContext(), "Bạn chọn Folder" , Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.restore){
            Toast.makeText( getApplicationContext(), "Bạn chọn Folder" , Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.folder){
            Toast.makeText( getApplicationContext(), "Bạn chọn Folder" , Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.like){
            Toast.makeText( getApplicationContext(), "Bạn chọn Like" , Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText( getApplicationContext(),"Bạn chọn About",Toast.LENGTH_SHORT ).show();
        }
        return true;
    }
}
