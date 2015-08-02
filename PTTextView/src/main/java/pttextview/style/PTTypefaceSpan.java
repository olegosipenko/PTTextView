/* Copyright 2015 Oleg Osipenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pttextview.style;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

import pttextview.utils.PTTextViewUtils;
import pttextview.utils.PTTypefaceManager;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTTypefaceSpan extends MetricAffectingSpan{

    private final Typeface mTypeface;

    public PTTypefaceSpan(@NonNull Context context) {
        this(context, PTTypefaceManager.Typefaces.PT_SANS_REGULAR.getIndex());
    }

    public PTTypefaceSpan(@NonNull Context context, int typefaceId) {
        mTypeface = PTTypefaceManager.getTypeface(context, typefaceId);
    }

    public PTTypefaceSpan(@NonNull Context context, int fontFamily, int textWeight, int textStyle) {
        mTypeface = PTTypefaceManager.getTypeface(context, fontFamily, textWeight, textStyle);
    }

    @Override
    public void updateMeasureState(@NonNull TextPaint p) {
        PTTextViewUtils.setTypeface(p, mTypeface);
    }

    @Override
    public void updateDrawState(@NonNull TextPaint tp) {
        PTTextViewUtils.setTypeface(tp, mTypeface);
    }
}
