package com.example.rajat.p_jatayu;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import me.kaelaela.verticalviewpager.VerticalViewPager;
import me.kaelaela.verticalviewpager.transforms.DefaultTransformer;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton atv,ser,contact,locate,about,trends;
    ImageView prod_image,news_image,cont_image,ser_image,about_image,loc_image;
    Toolbar toolbar;
    GifImageView gifImageView;

    int Giflist[]=
            {
              R.drawable.gif3,R.drawable.giphy
            };

    @Override

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifImageView=(GifImageView)findViewById(R.id.gif);
        gifImageView.setImageResource(Giflist[1]);
        toolbar=(Toolbar)findViewById(R.id.main_toolbar);
        atv=(ImageButton)findViewById(R.id.button1);
        ser=(ImageButton)findViewById(R.id.button2);
        locate=(ImageButton)findViewById(R.id.button3);
        contact=(ImageButton)findViewById(R.id.button4);
        about=(ImageButton)findViewById(R.id.button5);
        trends=(ImageButton)findViewById(R.id.button6);

        prod_image=(ImageView)findViewById(R.id.prod_image);
        news_image=(ImageView)findViewById(R.id.news_image);
        cont_image=(ImageView)findViewById(R.id.cont_image);
        ser_image=(ImageView)findViewById(R.id.ser_image);
        about_image=(ImageView)findViewById(R.id.about_image);
        loc_image=(ImageView)findViewById(R.id.loc_image);

        prod_image.setImageResource(R.mipmap.car);
        cont_image.setImageResource(R.mipmap.call);
        loc_image.setImageResource(R.mipmap.locate);
        news_image.setImageResource(R.mipmap.news);
        ser_image.setImageResource(R.mipmap.ser);
        about_image.setImageResource(R.mipmap.about_us);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("JM");
        toolbar.setNavigationIcon(R.mipmap.logo3);
        toolbar.setLogoDescription("Click to know our legacy");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Legacy.class);
                startActivity(intent);
            }
        });

        locate.setImageResource(R.mipmap.locate);
        contact.setImageResource(R.mipmap.call);
        ser.setImageResource(R.drawable.service);
        about.setImageResource(R.drawable.about);

        // button1 listener
        atv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Product.class);
                startActivity(intent);
            }
        });
        // button2 listener
        ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Service.class);
                startActivity(intent);
            }
        });
        // button3 listener
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Contact.class);
                startActivity(intent);
            }
        });
        // button4 listener
        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Locate.class);
                startActivity(intent);
            }
        });

        trends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,News.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,About.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode==KeyEvent.KEYCODE_BACK)
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
