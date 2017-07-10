package com.example.admin.fragament;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Admin on 6/21/2017.
 */

public class CustomerAdpter extends BaseAdapter implements MediaPlayer.OnCompletionListener{

    MediaPlayer mp;
    private Context c;
    private ArrayList<French> french;
    private LayoutInflater inflater;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();


        }
    };
    public CustomerAdpter(Context c, ArrayList<French> french) {
        this.c = c;
        this.french = french;
    }

    @Override
    public int getCount() {
        return french.size();
    }

    @Override
    public Object getItem(int position) {
        return french.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null)
        {
            convertView=inflater.inflate(R.layout.model,parent,false);
        }
        TextView tvEnglish =(TextView)convertView.findViewById(R.id.tvEnglish);
        TextView tvFrench =(TextView)convertView.findViewById(R.id.tvFrench);
        ImageView imPic =(ImageView)convertView.findViewById(R.id.imPic);
        ImageView ibSpeak =(ImageView) convertView.findViewById(R.id.ibSpeaker);

        final String english = french.get(position).getEnglishWord();
        String frenchWord = french.get(position).getFrenchWord();
        int  pic = french.get(position).getImage();
        int  speak = french.get(position).getImageButton();

        tvEnglish.setText(english);
        tvFrench.setText(frenchWord);

        ibSpeak.setImageResource(speak);

        imPic.setImageResource(pic);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(c,english,Toast.LENGTH_LONG).show();
                if(english.equalsIgnoreCase("one"))
                {
                    mp = MediaPlayer.create(c,R.raw.one);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("two"))
                {
                    mp = MediaPlayer.create(c,R.raw.two);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("three"))
                {
                    mp = MediaPlayer.create(c,R.raw.three);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("four"))
                {
                    mp = MediaPlayer.create(c,R.raw.four);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("five"))
                {
                    mp = MediaPlayer.create(c,R.raw.five);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("six"))
                {
                    mp = MediaPlayer.create(c,R.raw.six);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Seven"))
                {
                    mp = MediaPlayer.create(c,R.raw.seven);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("eight"))
                {
                    mp = MediaPlayer.create(c,R.raw.eight);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("nine"))
                {
                    mp = MediaPlayer.create(c,R.raw.nine);


                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("ten"))
                {
                    mp = MediaPlayer.create(c,R.raw.ten);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
//
                /// verb class
                if(english.equalsIgnoreCase("Walk"))
                {
                    mp = MediaPlayer.create(c,R.raw.walk);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("call"))
                {
                    mp = MediaPlayer.create(c,R.raw.call);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("cry"))
                {
                    mp = MediaPlayer.create(c,R.raw.cry);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("eat"))
                {
                    mp = MediaPlayer.create(c,R.raw.eat);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("cook"))
                {
                    mp = MediaPlayer.create(c,R.raw.cook);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("kiss"))
                {
                    mp = MediaPlayer.create(c,R.raw.kiss);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("in action"))
                {
                    mp = MediaPlayer.create(c,R.raw.action);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("jog"))
                {
                    mp = MediaPlayer.create(c,R.raw.jog);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);

                }
                if(english.equalsIgnoreCase("sit"))
                {
                    mp = MediaPlayer.create(c,R.raw.sit);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("laugh"))
                {
                    mp = MediaPlayer.create(c,R.raw.laugh);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }

                if(english.equalsIgnoreCase("sleep"))
                {
                    mp = MediaPlayer.create(c,R.raw.sleep);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("run"))
                {
                    mp = MediaPlayer.create(c,R.raw.run);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }

                if(english.equalsIgnoreCase("play"))
                {
                    mp = MediaPlayer.create(c,R.raw.four);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("watch"))
                {
                    mp = MediaPlayer.create(c,R.raw.watch);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("talk"))
                {
                    mp = MediaPlayer.create(c,R.raw.talk);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("open"))
                {
                    mp = MediaPlayer.create(c,R.raw.open);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("close"))
                {
                    mp = MediaPlayer.create(c,R.raw.close);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                /// //furniture class

                if(english.equalsIgnoreCase("Bed"))
                {
                    mp = MediaPlayer.create(c,R.raw.bed);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Bench"))
                {
                    mp = MediaPlayer.create(c,R.raw.bench);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Chair"))
                {
                    mp = MediaPlayer.create(c,R.raw.chair);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Closet"))
                {
                    mp = MediaPlayer.create(c,R.raw.closet);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Curtain"))
                {
                    mp = MediaPlayer.create(c,R.raw.curtain);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Stool"))
                {
                    mp = MediaPlayer.create(c,R.raw.stool);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Table"))
                {
                    mp = MediaPlayer.create(c,R.raw.table);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("Wardrobe"))
                {
                    mp = MediaPlayer.create(c,R.raw.wardrobe);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                /// //class
                if(english.equalsIgnoreCase("can you help me"))
                {
                    mp = MediaPlayer.create(c,R.raw.canuhelpme);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("goodbye"))
                {
                    mp = MediaPlayer.create(c,R.raw.goodbye);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);

                }
                if(english.equalsIgnoreCase("how are you"))
                {
                    mp = MediaPlayer.create(c,R.raw.hau);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("glad to meet you"))
                {
                    mp = MediaPlayer.create(c,R.raw.gladtomettyot);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("What is the time"))
                {
                    mp = MediaPlayer.create(c,R.raw.whatitime);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("good morning"))
                {
                    mp = MediaPlayer.create(c,R.raw.goodmorni);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);

                }
                if(english.equalsIgnoreCase("goodnight"))
                {
                    mp = MediaPlayer.create(c,R.raw.goodnight);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }
                if(english.equalsIgnoreCase("good afternoon"))
                {
                    mp = MediaPlayer.create(c,R.raw.gooafternoon);
                    mp.start();
                    mp.setOnCompletionListener(mCompletionListener);
                }

            }
        });
        return  convertView;
    }



    private void releaseMediaPlayer() {

        if (mp != null) {

            mp.release();


            mp = null;
        }
    }
    @Override
    public void onCompletion(MediaPlayer mp) {

    }
}
