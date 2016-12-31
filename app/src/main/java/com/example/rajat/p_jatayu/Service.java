package com.example.rajat.p_jatayu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by JATIN on 15-10-2016.
 */
public class Service extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner;
    ArrayAdapter<CharSequence> arrayAdapter;
    TextView Title,info;
    String tit[]={
            "Car Service","Insurance","Doorstep Service","Spare Parts","Modify my Car","Emergency response"
    };
    String inf[]={
            "We service your car yo",
            "With driving around in an ATV you'll need some insurence son",
            "We do door step service for lazy ass people like you mf",
            "Spare parts......coz thats how we earn dope bruhh",
            "Why did you buy that shit in the first plzce bitch",
            "We come to recuse your sorry ass"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service);
        Title=(TextView)findViewById(R.id.ser_title);
        info=(TextView)findViewById(R.id.ser_info);

        spinner = (Spinner) findViewById(R.id.service_spinner);

        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.ser_spinner_menu, R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Toast.makeText(getApplicationContext(),"Select an option",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_LONG).show();
                        Title.setText(tit[position]);
                        info.setText(inf[position]);
                        Title.setVisibility(View.VISIBLE);
                        info.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_LONG).show();
                        Title.setText(tit[position]);
                        info.setText(inf[position]);
                        Title.setVisibility(View.VISIBLE);
                        info.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_LONG).show();
                        Title.setText(tit[position]);
                        info.setText(inf[position]);
                        Title.setVisibility(View.VISIBLE);
                        info.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_LONG).show();
                        Title.setText(tit[position]);
                        info.setText(inf[position]);
                        Title.setVisibility(View.VISIBLE);
                        info.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_LONG).show();
                        Title.setText(tit[position]);
                        info.setText(inf[position]);
                        Title.setVisibility(View.VISIBLE);
                        info.setVisibility(View.VISIBLE);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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
