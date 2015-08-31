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

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Switch;

import pttextview.utils.PTTextViewUtils;

/**
 * A {@link android.widget.Switch} with native support for all the Google PT fonts.
 * <br>
 *
 * @author Oleg Osipenko on 19.07.15.
 */
@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class PTSwitch extends Switch {

    /**
     * Simple constructor is used when created view programmatically
     *
     * @param context The Context the widget is running in, through which it can
     *                access the current theme, resources, etc.
     */

    public PTSwitch(Context context) {
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
     * @see #PTSwitch(Context, AttributeSet, int)
     */

    public PTSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }

    /**
     * Constructor is used when creating view through XML with specifying
     * {@link android.content.res.Resources.Theme} attribute. This
     * constructor of View allows subclasses to use
     * their own base style when they are inflating.
     *
     * @param context      The Context the widget is running in, through which it can
     *                     access the current theme, resources, etc.
     * @param attrs        The attributes of the XML tag that is inflating the widget.
     * @param defStyleAttr The default style to apply to this widget. If 0, no style
     *                     will be applied (beyond what is included in the theme). This may
     *                     either be an attribute resource, whose value will be retrieved
     *                     from the current theme, or an explicit style resource.
     * @see #PTSwitch(Context, AttributeSet)
     */

    public PTSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }

    /**
     * Constructor is used when creating view through XML with specifying
     * {@link android.content.res.Resources.Theme} attribute or style resource. This
     * constructor of View allows subclasses to use
     * their own base style when they are inflating.
     *
     * @param context      The Context the widget is running in, through which it can
     *                     access the current theme, resources, etc.
     * @param attrs        The attributes of the XML tag that is inflating the widget.
     * @param defStyleAttr The default style to apply to this widget. If 0, no style
     *                     will be applied (beyond what is included in the theme). This may
     *                     either be an attribute resource, whose value will be retrieved
     *                     from the current theme, or an explicit style resource.
     * @param defStyleRes  A resource identifier of a style resource that supplies default
     *                     values for the view, used only if defStyleAttr is 0 or can not
     *                     be found in the theme. Can be 0 to not look for defaults.
     * @see #PTSwitch(Context, AttributeSet)
     */

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PTSwitch(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        if (!isInEditMode()) {
            PTTextViewUtils.setTypeface(this, context, attrs);
        }
    }
}
