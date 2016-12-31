package com.example.rajat.p_jatayu;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JATIN on 15-10-2016.
 */
public class Contact extends AppCompatActivity {
        List<Contact_info> contact_info;
        ListView listView;
        Contact_Adaptor contact_adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        contact_info=getContact_info();
        contact_adaptor=new Contact_Adaptor(this,contact_info);
        listView=(ListView)findViewById(R.id.contact_list);
        listView.setAdapter(contact_adaptor);
    }
    public List<Contact_info> getContact_info()
    {
     List<Contact_info> contact_infos= new ArrayList<>();
        contact_infos.add(new Contact_info("Delhi loc 1","55414154"));
        contact_infos.add(new Contact_info("Delhi loc 2","7894630"));
        contact_infos.add(new Contact_info("Punjab loc 1","525251141"));
        contact_infos.add(new Contact_info("Punjab loc 2","12345678"));
        contact_infos.add(new Contact_info("Goa loc1","87654321"));
        contact_infos.add(new Contact_info("Goa loc2","09876543"));
        return contact_infos;
    }
}
