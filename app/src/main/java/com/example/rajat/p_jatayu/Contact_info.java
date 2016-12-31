package com.example.rajat.p_jatayu;

/**
 * Created by JATIN on 18-10-2016.
 */
public class Contact_info {
    String Location;
    String contactno;
    public Contact_info(String location,String contactno)
    {
        this.contactno=contactno;
        this.Location=location;
    }
    public String getLocation()
    {
        return Location;
    }
    public String getContactno()
    {
        return contactno;
    }

}
