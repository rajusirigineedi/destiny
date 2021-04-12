package com.mini14.destiny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class TechActivity extends AppCompatActivity {

    View tech;
    View card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        tech = findViewById(R.id.btechbutton);
        card = findViewById(R.id.onew);
        Animation animation = AnimationUtils.loadAnimation(TechActivity.this,R.anim.scaleanimationnow);
        card.startAnimation(animation);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TechActivity.this,SelectTopicsActivity.class));
                finish();
            }
        });
    }
}
