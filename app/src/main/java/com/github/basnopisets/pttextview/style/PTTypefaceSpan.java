package com.github.basnopisets.pttextview.style;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

import com.github.basnopisets.pttextview.utils.PTTextViewUtils;
import com.github.basnopisets.pttextview.utils.PTTypefaceManager;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTTypefaceSpan extends MetricAffectingSpan{

    private final Typeface mTypeface;

    public PTTypefaceSpan(Context context) {
        this(context, PTTypefaceManager.Typefaces.PT_SANS_REGULAR.getIndex());
    }

    public PTTypefaceSpan(Context context, int typefaceId) {
        mTypeface = PTTypefaceManager.getTypeface(context, typefaceId);
    }

    public PTTypefaceSpan(Context context, int fontFamily, int textWeight, int textStyle) {
        mTypeface = PTTypefaceManager.getTypeface(context, fontFamily, textWeight, textStyle);
    }

    @Override
    public void updateMeasureState(TextPaint p) {
        PTTextViewUtils.setTypeface(p, mTypeface);
    }

    @Override
    public void updateDrawState(TextPaint tp) {
        PTTextViewUtils.setTypeface(tp, mTypeface);
    }
}
