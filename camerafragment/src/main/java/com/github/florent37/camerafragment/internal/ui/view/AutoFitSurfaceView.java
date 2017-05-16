package com.github.florent37.camerafragment.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/*
 * Created by memfis on 7/6/16.
 */
@SuppressWarnings("deprecation")
@SuppressLint("ViewConstructor")
public class AutoFitSurfaceView extends SurfaceView {

    private final static String TAG = "AutoFitSurfaceView";

    private final SurfaceHolder surfaceHolder;

    public AutoFitSurfaceView(@NonNull Context context, SurfaceHolder.Callback callback) {
        super(context);

        this.surfaceHolder = getHolder();

        this.surfaceHolder.addCallback(callback);
        this.surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int width = resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        final int height = resolveSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        setMeasuredDimension(width, height);
    }
}
