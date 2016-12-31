package com.example.rajat.p_jatayu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by JATIN on 04-10-2016.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        final ImageView gear1=(ImageView)findViewById(R.id.gear1);
        final ImageView gear2=(ImageView)findViewById(R.id.gear2);
        final ImageView gear3=(ImageView)findViewById(R.id.gear3);
        final ImageView gear4=(ImageView)findViewById(R.id.gear4);
        final ImageView logo2=(ImageView)findViewById(R.id.logo2);
        final Animation an1 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.animation1);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.animation2);
        final Animation an3 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.animation2);
        final Animation an4 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.animation1);

        logo2.setImageResource(R.mipmap.back3);

        gear1.setAlpha(127);
        gear2.setAlpha(190);

        gear1.startAnimation(an1);
        gear2.startAnimation(an2);
        gear3.startAnimation(an3);
        gear4.startAnimation(an4);

        an1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent i =new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            overridePendingTransition(R.anim.trans_right_in,R.anim.trans_right_out);
                Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                // Vibrate for 500 milliseconds
                v.vibrate(500);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}

