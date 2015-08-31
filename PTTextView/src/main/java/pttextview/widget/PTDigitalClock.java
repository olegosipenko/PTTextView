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

package pttextview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.DigitalClock;

import pttextview.utils.PTTextViewUtils;

/**
 * A {@link android.widget.DigitalClock} with native support
 * for all the Google PT fonts.
 * <br>
 *
 * @author Oleg Osipenko on 19.07.15.
 */
public class PTDigitalClock extends DigitalClock {

    /**
     * Simple constructor is used when created view programmatically
     *
     * @param context The Context the widget is running in, through which it can
     *                access the current theme, resources, etc.
     */

    public PTDigitalClock(Context context) {
        super(context);
    }

    /**
     * Constructor is used when creating view through XML with attributes
     * specified in the XML file. This version uses a default style of
     * 0, so the only attribute values applied are those in the Context's Theme
     * and the given AttributeSet.
     * <br>
     * <br>
     * The method onFinishInflate() will be called after all children have been
     * added.
     *
     * @param context The Context the widget is running in, through which it can
     *                access the current theme, resources, etc.
     * @param attrs   The attributes of the XML tag that is inflating the widget.
     */

    public PTDigitalClock(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }
}
