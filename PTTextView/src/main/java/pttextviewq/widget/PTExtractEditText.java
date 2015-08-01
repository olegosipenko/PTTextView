package pttextviewq.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.os.Build;
import android.util.AttributeSet;

import pttextviewq.utils.PTTextViewUtils;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTExtractEditText extends ExtractEditText {
    public PTExtractEditText(Context context) {
        super(context);
    }

    public PTExtractEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }

    public PTExtractEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PTExtractEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }
}
