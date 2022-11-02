package com.example.pgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView grid;

    int icons[]=
            {
                    R.drawable.a,
                    R.drawable.b,
                    R.drawable.c,
                    R.drawable.d,
                    R.drawable.e,
                    R.drawable.f,
                    R.drawable.g,
                    R.drawable.h,
                    R.drawable.i,
            };
    String name[]={"A","B","C","D","E","F","G","H","I"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid=(GridView)findViewById(R.id.grid);
        gridAdapter obj=new gridAdapter(this,name,icons);
        grid.setAdapter(obj);



    }
}
