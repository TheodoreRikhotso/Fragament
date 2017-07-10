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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Number extends Fragment {

    ListView iv;

    public Number() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootVeiw = inflater.inflate(R.layout.fragment_number, container, false);
       // View header = inflater.inflate(R.layout.header, container, false);
         iv =(ListView)rootVeiw.findViewById(R.id.ivNumber);
       //View header = inflater.inflate(R.layout.header, null);


        iv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3)
            {
                Toast.makeText(getActivity().getApplicationContext(), "" + position, Toast.LENGTH_SHORT).show();
            }
        });
        CustomerAdpter customerAdpter = new CustomerAdpter(this.getActivity(),getNumber());
        iv.setAdapter(customerAdpter);
        //iv.addHeaderView(header);


        return rootVeiw;
    }




    private ArrayList<French> getNumber() {
        ArrayList<French> number = new ArrayList<>();

        French french = new French("One", "un", R.drawable.one,R.drawable.speaker);
        number.add(french);
        french = new French("Two", "deux", R.drawable.tw,R.drawable.speaker);
        number.add(french);
        french = new French("Three", "trois", R.drawable.three,R.drawable.speaker);
        number.add(french);
        french = new French("Four", "quatre", R.drawable.four,R.drawable.speaker);
        number.add(french);
        french = new French("Five", "cinq", R.drawable.five,R.drawable.speaker);
        number.add(french);
        french = new French("Six", "six", R.drawable.six,R.drawable.speaker);
        number.add(french);
        french = new French("Seven", "sept", R.drawable.seven,R.drawable.speaker);
        number.add(french);
        french = new French("Eight", "huit", R.drawable.eight,R.drawable.speaker);
        number.add(french);
        french = new French("Nine", "neuf", R.drawable.nine,R.drawable.speaker);
        number.add(french);
        french = new French("TeN", "dix", R.drawable.ten,R.drawable.speaker);
        number.add(french);



        return number;

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onPause() {
        super.onPause();
    }


}
