package pttextviewq.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

import pttextviewq.utils.PTTextViewUtils;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTCheckBox extends AppCompatCheckBox {
    public PTCheckBox(Context context) {
        super(context);
    }

    public PTCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }

    public PTCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }
}
