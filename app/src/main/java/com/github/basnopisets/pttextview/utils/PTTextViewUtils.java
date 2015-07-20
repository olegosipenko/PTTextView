package com.github.basnopisets.pttextview.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.github.basnopisets.pttextview.R;
import com.github.basnopisets.pttextview.widget.PTTextView;

/**
 * Created by Oleg on 18.07.15.
 */
public class PTTextViewUtils {

    private PTTextViewUtils() {
    }

    public static void setTypeface(TextView textView, Context context, AttributeSet attrs) {
        Typeface typeface;

        if (null != attrs) {
            TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.PTTextView);

            if (array.hasValue(R.styleable.PTTextView_typeface)) {
                int typefaceValue = array.getInt(R.styleable.PTTextView_typeface, PTTypefaceManager.Typefaces.PT_SANS_REGULAR.getIndex());
                typeface = PTTypefaceManager.getTypeface(context, typefaceValue);
            } else {
                int fontFamily = array.getInt(R.styleable.PTTextView_fontFamily, PTTypefaceManager.FontFamilies.PT_SANS.ordinal());
                int textWeight = array.getInt(R.styleable.PTTextView_textWeight, PTTypefaceManager.TextWeights.NORMAL.ordinal());
                int textStyle = array.getInt(R.styleable.PTTextView_textStyle, PTTypefaceManager.TextStyles.REGULAR.ordinal()) ;

                typeface = PTTypefaceManager.getTypeface(context, fontFamily, textWeight, textStyle);
            }

            array.recycle();
        } else {
            typeface = PTTypefaceManager.getTypeface(context, PTTypefaceManager.Typefaces.PT_SANS_REGULAR.getIndex());
        }

        setTypeface(textView, typeface);
    }

    public static void setTypeface(TextView textView, Typeface typeface) {
        textView.setPaintFlags(textView.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        textView.setTypeface(typeface);
    }

    public static void setTypeface(Paint paint, Typeface typeface) {
        paint.setFlags(paint.getFlags() | Paint.SUBPIXEL_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        paint.setTypeface(typeface);
    }
}
