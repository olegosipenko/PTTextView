package com.github.basnopisets.pttextview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.DigitalClock;

import com.github.basnopisets.pttextview.utils.PTTextViewUtils;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTDigitalClock extends DigitalClock {

    public PTDigitalClock(Context context) {
        super(context);
    }

    public PTDigitalClock(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }
}
