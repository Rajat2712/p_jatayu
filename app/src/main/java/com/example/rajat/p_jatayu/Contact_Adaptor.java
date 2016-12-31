package com.example.rajat.p_jatayu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JATIN on 19-10-2016.
 */
public class Contact_Adaptor extends BaseAdapter {

    Context context;
    List<Contact_info> list;

    public Contact_Adaptor(Context context,List<Contact_info> list)
    {
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listview=inflater.inflate(R.layout.contact_list,null,true);
        TextView title=(TextView)listview.findViewById(R.id.Cust_title);
        final TextView info=(TextView)listview.findViewById(R.id.Cust_info);

        title.setText(list.get(position).getLocation());
        info.setText(list.get(position).getContactno());
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + info.toString()));
                context.startActivity(intent);
            }
        });
        return listview;
    }
}
