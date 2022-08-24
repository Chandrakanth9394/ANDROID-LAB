package com.example.lifecycle;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"ONCREATE CALLED",Toast.LENGTH_SHORT).show();
        Log.d("lifecycle", "onCreate: called");
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"ONSTART",Toast.LENGTH_SHORT).show();
        Log.d("lifecycle", "onStart: onstart called");
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"ONRESUME",Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","on resume called");
    }

    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"ONSTOP", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onstop called");
    }
    protected void onRestart()
    {
         super.onRestart();
         Toast.makeText(this,"ONRESTART",Toast.LENGTH_SHORT).show();
         Log.d("lifecycle","onrestart called");
    }
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "ONDESTROY", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onDestroy called");
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"ONPAUSE",Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onPause Called");
    }
}

