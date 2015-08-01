package pttextviewq.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import pttextviewq.utils.PTTextViewUtils;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTButton extends AppCompatButton {
    public PTButton(Context context) {
        super(context);
    }

    public PTButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }

    public PTButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }
}
