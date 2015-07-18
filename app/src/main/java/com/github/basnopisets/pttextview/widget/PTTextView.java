package com.github.basnopisets.pttextview.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.github.basnopisets.pttextview.utils.PTTextViewUtils;

/**
 * Created by Oleg on 18.07.15.
 */
public class PTTextView extends AppCompatTextView {
    public PTTextView(Context context) {
        super(context);
    }

    public PTTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.initTypeface(this, context, attrs);
        }
    }

    public PTTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        if (!isInEditMode()) {
            PTTextViewUtils.initTypeface(this, context, attrs);
        }
    }
}
