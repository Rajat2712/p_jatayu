package com.example.rajat.p_jatayu;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;


import pl.droidsonroids.gif.GifImageView;

/**
 * Created by JATIN on 15-12-2016.
 */
public class Car1 extends Fragment {

    CardView cardView_specs,cardView_gif,cardView_costs,cardView_access;
    GifImageView gifImageView;
    Animation a1,a2,a3,a4;
    Gallery gallery;
    ImageView selectedImageView;
    String C1_heading[]={"Accessory1","Accessory2","Accessory3","Accessory4","Accessory5"};
    String C1_Row_heading[]={};
    String C1_Row_detail[]={};
    //String C1_A1_heading[]={};
    String C1_A1_Row_heading[]={"A1_R1_H","A1_R2_H","A1_R3_H","A1_R4_H","A1_R5_H"};
    String C1_A1_Row_detail[]={"A1_R1_D","A1_R2_D","A1_R3_D","A1_R4_D","A1_R5_D"};
    //String C1_A2_heading[]={};
    String C1_A2_Row_heading[]={"A2_R1_H","A2_R2_H","A2_R3_H","A2_R4_H","A2_R5_H"};
    String C1_A2_Row_detail[]={"A2_R1_D","A2_R2_D","A2_R3_D","A2_R4_D","A2_R5_D"};
    //String C1_A3_heading[]={};
    String C1_A3_Row_heading[]={"A3_R1_H","A3_R2_H","A3_R3_H","A3_R4_H","A3_R5_H"};
    String C1_A3_Row_detail[]={"A3_R1_D","A3_R2_D","A3_R3_D","A3_R4_D","A3_R5_D"};
    //String C1_A4_heading[]={};
    String C1_A4_Row_heading[]={"A4_R1_H","A4_R2_H","A4_R3_H","A4_R4_H","A4_R5_H"};
    String C1_A4_Row_detail[]={"A4_R1_D","A4_R2_D","A4_R3_D","A4_R4_D","A4_R5_D"};
    //String C1_A5_heading[]={};
    String C1_A5_Row_heading[]={"A5_R1_H","A5_R2_H","A5_R3_H","A5_R4_H","A5_R5_H"};
    String C1_A5_Row_detail[]={"A5_R1_D","A5_R2_D","A5_R3_D","A5_R4_D","A5_R5_D"};

    TextView C1_H,C1_R1_H,C1_R1_D,C1_R2_H,C1_R2_D,C1_R3_H,C1_R3_D,C1_R4_H,C1_R4_D,C1_R5_H,C1_R5_D;
    int imgs[] =
            {
                    R.drawable.back,R.drawable.about,R.drawable.button_look,R.drawable.logo2,R.drawable.logo1
            };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.car1, null);
        cardView_gif=(CardView)view.findViewById(R.id.card_view_pics);
        cardView_costs=(CardView)view.findViewById(R.id.card_view_cost);
        cardView_specs=(CardView)view.findViewById(R.id.Car1_specs);
        cardView_access=(CardView)view.findViewById(R.id.Car1_access);
        gifImageView=(GifImageView)view.findViewById(R.id.gif);
        gallery=(Gallery) view.findViewById(R.id.gallery1);
        selectedImageView = (ImageView) view.findViewById(R.id.selectedImageView);
        C1_H=(TextView)view.findViewById(R.id.C1_H);
        C1_R1_H=(TextView)view.findViewById(R.id.C1_R1_H);
        C1_R1_D=(TextView)view.findViewById(R.id.C1_R1_D);
        C1_R2_H=(TextView)view.findViewById(R.id.C1_R2_H);
        C1_R2_D=(TextView)view.findViewById(R.id.C1_R2_D);
        C1_R3_H=(TextView)view.findViewById(R.id.C1_R3_H);
        C1_R3_D=(TextView)view.findViewById(R.id.C1_R3_D);
        C1_R4_H=(TextView)view.findViewById(R.id.C1_R4_H);
        C1_R4_D=(TextView)view.findViewById(R.id.C1_R4_D);
        C1_R5_H=(TextView)view.findViewById(R.id.C1_R5_H);
        C1_R5_D=(TextView)view.findViewById(R.id.C1_R5_D);


        a1= AnimationUtils.loadAnimation(getContext(),R.anim.trans_left_in);
        a2= AnimationUtils.loadAnimation(getContext(),R.anim.trans_right_in);
        a3=AnimationUtils.loadAnimation(getContext(),R.anim.trans_left_out);
        a4=AnimationUtils.loadAnimation(getContext(),R.anim.trans_right_out);
        gifImageView.setImageResource(R.drawable.gif3);
        cardView_specs.setAnimation(a2);
        cardView_access.setAnimation(a1);
        cardView_costs.setAnimation(a2);


        return view;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        gallery.setSpacing(20);
        gallery.setAnimationDuration(3000);
        //gallery.setUnselectedAlpha(0.25f);
        gallery.setAdapter(new ImageAdapter(getActivity()));
        //selectedImageView.setImageResource(imgs[0]);
        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedImageView.setImageResource(imgs[position]);
                switch (position){
                    case 0:
                        //C1_heading=C1_A1_heading;
                        C1_Row_heading=C1_A1_Row_heading;
                        C1_Row_detail=C1_A1_Row_detail;
                        break;
                    case 1:
                        //C1_heading=C1_A2_heading;
                        C1_Row_heading=C1_A2_Row_heading;
                        C1_Row_detail=C1_A2_Row_detail;
                        break;
                    case 2:
                        //C1_heading=C1_A3_heading;
                        C1_Row_heading=C1_A3_Row_heading;
                        C1_Row_detail=C1_A3_Row_detail;
                         break;
                    case 3:
                        //C1_heading=C1_A4_heading;
                        C1_Row_heading=C1_A4_Row_heading;
                        C1_Row_detail=C1_A4_Row_detail;
                        break;
                    case 4:
                        //C1_heading=C1_A5_heading;
                        C1_Row_heading=C1_A5_Row_heading;
                        C1_Row_detail=C1_A5_Row_detail;
                        break;
                }

                C1_H.setText(C1_heading[position]);
                C1_R1_H.setText(C1_Row_heading[0]);
                C1_R1_D.setText(C1_Row_detail[0]);
                C1_R2_H.setText(C1_Row_heading[1]);
                C1_R2_D.setText(C1_Row_detail[1]);
                C1_R3_H.setText(C1_Row_heading[2]);
                C1_R3_D.setText(C1_Row_detail[2]);
                C1_R4_H.setText(C1_Row_heading[3]);
                C1_R4_D.setText(C1_Row_detail[3]);
                C1_R5_H.setText(C1_Row_heading[4]);
                C1_R5_D.setText(C1_Row_detail[4]);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedImageView.setImageResource(imgs[0]);
            }
        });

        /*gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                //imgSwitcher.setImageResource(imgs[arg2]);
                selectedImageView.setImageResource(imgs[arg2]);
            }
        });
*/

    }



    public class ImageAdapter extends BaseAdapter {

        private Context ctx;

        public ImageAdapter(Context c) {
            ctx = c;
        }

        public int getCount() {

            return imgs.length;
        }

        public Object getItem(int arg0) {

            return arg0;
        }

        public long getItemId(int arg0) {

            return arg0;
        }

        public View getView(int arg0, View arg1, ViewGroup arg2) {

            ImageView iView = new ImageView(ctx);
            iView.setImageResource(imgs[arg0]);
            iView.setScaleType(ImageView.ScaleType.FIT_XY);
            iView.setLayoutParams(new Gallery.LayoutParams(600, 600));
            return iView;
        }
    }



}






