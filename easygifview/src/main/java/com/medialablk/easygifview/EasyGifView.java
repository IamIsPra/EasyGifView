package com.medialablk.easygifview;

/**
 * Created by Isuru Prabath on 9/9/2017.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.util.AttributeSet;
import android.view.View;

import java.io.IOException;
import java.io.InputStream;

public class EasyGifView extends View {

    private Movie mMovie;
    private long lngMovie;
    private int intId = 0;

    private long lngWidth = 0;
    private long lngHeight = 0;
    private long lngDuration = 0;

    public EasyGifView(Context context) throws IOException {
        super(context);
    }

    public EasyGifView(Context context, AttributeSet attrSet) throws IOException{
        super(context, attrSet);
    }

    public EasyGifView(Context context, AttributeSet attrSet, int newStyle) throws IOException {
        super(context, attrSet, newStyle);
    }

    public void setGifFromResource(int resourceId)
    {
        this.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        InputStream inputStream = getContext().getResources().openRawResource(resourceId);
        mMovie = Movie.decodeStream(inputStream);

        this.intId = resourceId;
        this.lngWidth = mMovie.width();
        this.lngHeight = mMovie.height();
        this.lngDuration = mMovie.duration();
    }

    public int getGifFromResource(){
        return intId;
    }

    public long getGifWidth(){
        return lngWidth;
    }

    public long getGifHeight(){
        return lngHeight;
    }

    public long getGifDuration(){
        return lngDuration;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mMovie == null) {
            return;
        }

        long lngCurrentTime = android.os.SystemClock.uptimeMillis();

        if (lngMovie == 0) {
            lngMovie = lngCurrentTime;
        }

        int rTime = (int)((lngCurrentTime - lngMovie) % mMovie.duration());
        mMovie.setTime(rTime);
        mMovie.draw(canvas,0,0);
        this.invalidate();
    }
}