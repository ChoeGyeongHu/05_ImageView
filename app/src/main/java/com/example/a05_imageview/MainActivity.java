package com.example.a05_imageview;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        ImageView firstImage = (ImageView)findViewById(R.id.firstImage);

        int imageResource = getResources().getIdentifier("@drawable/snowtree", null, this.getPackageName());
        firstImage.setImageResource(imageResource);
    }
}
