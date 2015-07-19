package com.github.basnopisets.pttextview.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.github.basnopisets.pttextview.utils.PTTextViewUtils;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTEditText extends AppCompatEditText {
    public PTEditText(Context context) {
        super(context);
    }

    public PTEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }

    public PTEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }
}
