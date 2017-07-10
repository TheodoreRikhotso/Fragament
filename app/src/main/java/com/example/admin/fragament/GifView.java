package com.example.admin.fragament;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

import java.io.InputStream;

/**
 * Created by Admin on 6/28/2017.
 */

public class GifView extends View {

    private InputStream gifInputStream;
    private Movie gifMovie;
    private  int movieWidth, moveHieght;
    private long movieDuraion;
    private long movieStart;

    public GifView(Context context) {
        super(context);
        init(context);
    }

    public GifView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public GifView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(Context context)
    {
        setFocusable(true);
        gifInputStream = context.getResources().openRawResource(R.drawable.book);

        gifMovie = Movie.decodeStream(gifInputStream);

        movieWidth = gifMovie.width();
        moveHieght = gifMovie.height();
        movieDuraion = gifMovie.duration();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(movieWidth, moveHieght);
    }

    public int getMovieWidth() {
        return movieWidth;
    }

    public int getMoveHieght() {
        return moveHieght;
    }

    public long getMovieDuraion() {
        return movieDuraion;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        long now = SystemClock.uptimeMillis();
        if(movieStart==0){
            movieStart=now;
        }

        if (gifMovie!= null)
        {
            int dur = gifMovie.duration();
            if(dur== 0)
            {
                dur =1000;
            }
            int relTime =(int)((now= movieStart)% dur);
            gifMovie.setTime(relTime);
            gifMovie.draw(canvas,0,0);
            invalidate();
        }



    }
}

