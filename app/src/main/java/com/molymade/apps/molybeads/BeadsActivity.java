package com.molymade.apps.molybeads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class BeadsActivity extends AppCompatActivity {
    ImageView b0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beads);
        b0 = (ImageView)findViewById(R.id.imageView);
    }
}
