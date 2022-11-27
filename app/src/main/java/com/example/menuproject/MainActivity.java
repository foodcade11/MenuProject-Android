package com.example.menuproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=findViewById(R.id.img);
        registerForContextMenu(img);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.imgcontext,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.c_shere){
            Toast.makeText(MainActivity.this,"Share Selected",Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.c_del){
            Toast.makeText(MainActivity.this,"Delate Selected",Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.c_crop){
            Toast.makeText(MainActivity.this,"Crop Selected",Toast.LENGTH_LONG).show();
        }


        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.main_search){
            Toast.makeText(MainActivity.this,"Search Selected",Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.main_update){
            Toast.makeText(MainActivity.this,"update Selected",Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.main_exit){
            MainActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}