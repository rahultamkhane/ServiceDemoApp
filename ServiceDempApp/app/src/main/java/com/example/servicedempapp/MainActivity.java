package com.example.servicedempapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Toast.makeText(getBaseContext(), "Service started", Toast.LENGTH_SHORT);
        startService(new Intent(getBaseContext(), MyService.class));
    }

    public void stop(View view) {
        Toast.makeText(getBaseContext(), "Service stopped", Toast.LENGTH_SHORT);
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}

