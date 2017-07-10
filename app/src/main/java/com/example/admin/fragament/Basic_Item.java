package com.example.admin.fragament;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Basic_Item extends Fragment {

    ListView iv;
        MediaPlayer mp;
        public Basic_Item(){

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment





        //View header = View.inflate(this.getActivity(),R.layout.header, null);
        View rootVeiw = inflater.inflate(R.layout.fragment_number, container, false);

        iv =(ListView)rootVeiw.findViewById(R.id.ivNumber);
        //View header = inflater.inflate(R.layout.header, null);

        //header = inflater.inflate(R.layout.header, null, false);
        CustomerAdpter customerAdpter = new CustomerAdpter(this.getActivity(),getNumber());
        iv.setAdapter(customerAdpter);
        //iv.addHeaderView(header);

//        iv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                List<French> f = new ArrayList<>() ;
//
//                French french = f.get(position);
//
//                String english=french.getEnglishWord();
//
//                if(english.equalsIgnoreCase("Bed"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.one);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Wardrobe"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.goodnight);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Bench"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.three);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Chair"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.four);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Closet"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.five);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Curtain"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.six);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Headboard"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.seven);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Stool"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.eight);
//                    mp.start();
//                }
//                if(english.equalsIgnoreCase("Table"))
//                {
//                    mp = MediaPlayer.create(Basic_Item.this.getActivity(),R.raw.nine);
//
//
//                    mp.start();
//                }
//
//            }
//        });



        return rootVeiw;

    }



    private ArrayList<French> getNumber() {
        ArrayList<French> number = new ArrayList<>();


            French french = new French("Bed", "Lit", R.drawable.bed, R.drawable.speaker);
            number.add(french);
            french = new French("Wardrobe", "garde-robe", R.drawable.wardrope, R.drawable.speaker);
            number.add(french);
            french = new French("Bench", "Banc", R.drawable.bnch, R.drawable.speaker);
            number.add(french);
            french = new French("Chair", "chaise", R.drawable.chair, R.drawable.speaker);
            number.add(french);
            french = new French("Closet", "placard", R.drawable.closet, R.drawable.speaker);
            number.add(french);
            french = new French("Curtain", "rideau", R.drawable.curtain, R.drawable.speaker);
            number.add(french);
            french = new French("Headboard", "Tête de lit", R.drawable.headbord, R.drawable.speaker);
            number.add(french);
            french = new French("Stool", "tabouret", R.drawable.stool, R.drawable.speaker);
            number.add(french);
            french = new French("Table", "table", R.drawable.table, R.drawable.speaker);
            number.add(french);



        return number;

    }


}
