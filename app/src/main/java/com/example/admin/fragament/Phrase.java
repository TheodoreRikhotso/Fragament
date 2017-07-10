package com.example.admin.fragament;

import android.content.Context;
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


public class Phrase extends Fragment {


    public Phrase() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.fragment_number, container, false);
        //View header = (View)inflater.inflate(R.layout.header, container, false);
        ListView iv =(ListView)rootVeiw.findViewById(R.id.ivNumber);
        //View header = inflater.inflate(R.layout.header, null);

        iv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayList<French> number = new ArrayList<>();
                    French f = number.get(position);

                Toast.makeText(Phrase.this.getActivity(), " "+f.getEnglishWord(),Toast.LENGTH_LONG).show();
            }
        });
        CustomerAdpter customerAdpter = new CustomerAdpter(this.getActivity(),getNumber());
        iv.setAdapter(customerAdpter);
        //iv.addHeaderView(header);



        return rootVeiw;
    }

    private ArrayList<French> getNumber() {
        ArrayList<French> number = new ArrayList<>();

        French french = new French("how are you", "Comment allez-vous", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
         french = new French("how are you", "Comment allez-vous", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("can you help me", "Pouvez-vous m'aider", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("goodbye", "Au Revoir", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("hi", "salut", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("am good", "Suis bon", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("glad to meet you", "ravie de faire ta connaissance", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("where do u stay", "où est-ce que vous résidez", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("Table", "quel est", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("What is the time", "garde-robe le temps", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("good morning", "Bonjour", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("goodnight", "bonne nuit", R.drawable.phrases,R.drawable.speaker);
        number.add(french);
        french = new French("good afternoon", "bonne après-midi", R.drawable.phrases,R.drawable.speaker);
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
