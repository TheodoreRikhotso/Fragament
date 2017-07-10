package com.example.admin.fragament;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class Action_Fragment extends Fragment {


    public Action_Fragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootVeiw = inflater.inflate(R.layout.fragment_number, container, false);

       // View header = inflater.inflate(R.layout.header, container, false);
        ListView  iv =(ListView)rootVeiw.findViewById(R.id.ivNumber);
        //View header = inflater.inflate(R.layout.header, null);

        CustomerAdpter customerAdpter = new CustomerAdpter(this.getActivity(),getNumber());
        iv.setAdapter(customerAdpter);
        //iv.addHeaderView(header);


        return rootVeiw;
    }








    private ArrayList<French> getNumber() {
        ArrayList<French> number = new ArrayList<>();

        French french = new French("Walk", "marche", R.drawable.walk,R.drawable.speaker);
        number.add(french);
        french = new French("call", "appel", R.drawable.call,R.drawable.speaker);
        number.add(french);
        french = new French("cry", "cri", R.drawable.cry,R.drawable.speaker);
        number.add(french);
        french = new French("eat", "manger", R.drawable.eats,R.drawable.speaker);
        number.add(french);
        french = new French("cook", "cuisinier", R.drawable.cook,R.drawable.speaker);
        number.add(french);
        french = new French("kiss", "baiser", R.drawable.kiss,R.drawable.speaker);
        number.add(french);
        french = new French("in action", "En action", R.drawable.action,R.drawable.speaker);
        number.add(french);
        french = new French("jog", "faire du jogging", R.drawable.jog,R.drawable.speaker);
        number.add(french);
        french = new French("sit", "asseoir", R.drawable.sit,R.drawable.speaker);
        number.add(french);
        french = new French("laugh", "rire", R.drawable.laugh,R.drawable.speaker);
        number.add(french);
        french = new French("sleep", "dormir", R.drawable.sleep,R.drawable.speaker);
        number.add(french);
        french = new French("run", "courir", R.drawable.run,R.drawable.speaker);
        number.add(french);
        french = new French("play", "jouer", R.drawable.play,R.drawable.speaker);
        number.add(french);
        french = new French("watch", "regarder", R.drawable.ten,R.drawable.speaker);
        number.add(french);
        french = new French("talk", "parler", R.drawable.talk,R.drawable.speaker);
        number.add(french);
        french = new French("Open", "ouvrir", R.drawable.open,R.drawable.speaker);
        number.add(french);
        french = new French("close", "Fermer", R.drawable.diesslin_use_other_door,R.drawable.speaker);
        number.add(french);



        return number;

    }



}
