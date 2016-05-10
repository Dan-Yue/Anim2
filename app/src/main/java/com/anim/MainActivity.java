package com.anim;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
//    private Animation animation;
    private Button button;
    private ImageView imageView;
    private AnimationDrawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn);
        imageView = (ImageView) findViewById(R.id.imageView);
//        animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        drawable = (AnimationDrawable) imageView.getDrawable();
        button.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
//                      AlphaAnimation anim = new AlphaAnimation(0,1);
//
//                      imageView.startAnimation(animation);
                      drawable.start();

                  }
              }
        );

    }
}
