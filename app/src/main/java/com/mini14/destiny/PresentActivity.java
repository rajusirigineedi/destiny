package com.mini14.destiny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class PresentActivity extends AppCompatActivity {
    View mpc;
    View card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present);
        card = findViewById(R.id.oneq);
        mpc = findViewById(R.id.cardMPC);
        Animation animation = AnimationUtils.loadAnimation(PresentActivity.this,R.anim.scaleanimationnow);
        card.startAnimation(animation);
        mpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PresentActivity.this,TechActivity.class));
                finish();
            }
        });
    }
}
