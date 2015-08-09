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

package pttextview.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.util.SparseArray;

/**
 * A typeface manager that creates and holds {@link android.graphics.Typeface} object instances
 * <p/>
 * Created by Oleg on 18.07.15.
 */
public class PTTypefaceManager {

    private static final int FONTS = 14;

    private static final SparseArray<Typeface> typefaces = new SparseArray(FONTS);

    /**
     * Utitlity method that returns {@link android.graphics.Typeface} object
     * instance based on "typeface" attribute value
     *
     * @param context the widget running in
     * @param index   value of "typeface" attribute
     * @return {@link android.graphics.Typeface}
     */

    public static Typeface getTypeface(@NonNull Context context, int index) {
        Typeface typeface = typefaces.get(index);
        if (null == typeface) {
            typeface = initTypeface(context, index);
            typefaces.put(index, typeface);
        }
        return typeface;
    }

    /**
     * Utitlity method that returns {@link android.graphics.Typeface} object instance
     * based on set of parameters
     *
     * @param context    the widget running in
     * @param fontFamily value of "fontFamily" attribute
     * @param textWeight value of "textWeight" attribute
     * @param textStyle  value of "textStyle" attribute
     * @return {@link android.graphics.Typeface}
     * @throws IllegalArgumentException in case of invalid "typeface" attribute value
     */

    public static Typeface getTypeface(@NonNull Context context, @NonNull int fontFamily,
                                       int textWeight, int textStyle) throws IllegalArgumentException {
        int index = getTypefaceIndex(fontFamily, textWeight, textStyle);
        return getTypeface(context, index);
    }

    private static int getTypefaceIndex(int fontFamily, int textWeight, int textStyle) {
        if (fontFamily == FontFamilies.PT_SANS.ordinal()) {
            if (textWeight == TextWeights.NORMAL.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SANS_REGULAR.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SANS_ITALIC.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else if (textWeight == TextWeights.BOLD.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SANS_BOLD.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SANS_BOLD_ITALIC.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else {
                throw new IllegalArgumentException("Unknown `textWeight` attribute value "
                        + textWeight);
            }
        } else if (fontFamily == FontFamilies.PT_SANS_NARROW.ordinal()) {
            if (textWeight == TextWeights.NORMAL.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SANS_NARROW.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SANS_NARROW.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else if (textWeight == TextWeights.BOLD.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SANS_NARROW_BOLD.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SANS_NARROW_BOLD.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else {
                throw new IllegalArgumentException("Unknown `textWeight` attribute value "
                        + textWeight);
            }
        } else if (fontFamily == FontFamilies.PT_SANS_CAPTION.ordinal()) {
            if (textWeight == TextWeights.NORMAL.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SANS_CAPTION.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SANS_CAPTION.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else if (textWeight == TextWeights.BOLD.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SANS_CAPTION_BOLD.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SANS_CAPTION_BOLD.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else {
                throw new IllegalArgumentException("Unknown `textWeight` attribute value "
                        + textWeight);
            }
        } else if (fontFamily == FontFamilies.PT_SERIF.ordinal()) {
            if (textWeight == TextWeights.NORMAL.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SERIF.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SERIF_ITALIC.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else if (textWeight == TextWeights.BOLD.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SERIF_BOLD.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SERIF_BOLD_ITALIC.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else {
                throw new IllegalArgumentException("Unknown `textWeight` attribute value "
                        + textWeight);
            }
        } else if (fontFamily == FontFamilies.PT_SERIF_CAPTION.ordinal()) {
            if (textWeight == TextWeights.NORMAL.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SERIF_CAPTION.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SERIF_CAPTION_ITALIC.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else if (textWeight == TextWeights.BOLD.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_SERIF_CAPTION.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_SERIF_CAPTION_ITALIC.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else {
                throw new IllegalArgumentException("Unknown `textWeight` attribute value "
                        + textWeight);
            }
        } else if (fontFamily == FontFamilies.PT_MONO.ordinal()) {
            if (textWeight == TextWeights.NORMAL.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_MONO_REGULAR.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_MONO_REGULAR.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else if (textWeight == TextWeights.BOLD.ordinal()) {
                if (textStyle == TextStyles.REGULAR.ordinal()) {
                    return Typefaces.PT_MONO_BOLD.getIndex();
                } else if (textStyle == TextStyles.ITALIC.ordinal()) {
                    return Typefaces.PT_MONO_BOLD.getIndex();
                } else {
                    throw new IllegalArgumentException("Unknown `textStyle` attribute value "
                            + textStyle);
                }
            } else {
                throw new IllegalArgumentException("Unknown `textWeight` attribute value "
                        + textWeight);
            }
        } else {
            throw new IllegalArgumentException("Unknown `fontFamily` attribute value "
                    + fontFamily);
        }
    }

    private static Typeface initTypeface(Context context, int index) {
        return Typeface.createFromAsset(context.getAssets(), Typefaces.getFilePathByIndex(index));
    }

    public enum Typefaces {

        PT_SANS_REGULAR("fonts/PT Sans Regular.ttf", 0),
        PT_SANS_ITALIC("fonts/PT Sans Italic.ttf", 1),
        PT_SANS_BOLD("fonts/PT Sans Bold.ttf", 2),
        PT_SANS_BOLD_ITALIC("fonts/PT Sans Bold Italic.ttf", 3),
        PT_SANS_NARROW("fonts/PT Sans Narrow Regular.ttf", 4),
        PT_SANS_NARROW_BOLD("fonts/PT Sans Narrow Bold.ttf", 5),
        PT_SANS_CAPTION("fonts/PT Sans Caption Regular.ttf", 6),
        PT_SANS_CAPTION_BOLD("fonts/PT Sans Caption Bold.ttf", 7),
        PT_SERIF("fonts/PT Serif Regular.ttf", 8),
        PT_SERIF_ITALIC("fonts/PT Serif Italic.ttf", 9),
        PT_SERIF_BOLD("fonts/PT Serif Bold.ttf", 10),
        PT_SERIF_BOLD_ITALIC("fonts/PT Serif Bold Italic.ttf", 11),
        PT_SERIF_CAPTION("fonts/PT Serif Caption Regular.ttf", 12),
        PT_SERIF_CAPTION_ITALIC("fonts/PT Serif Caption Italic.ttf", 13),
        PT_MONO_REGULAR("fonts/PT Mono Regular.ttf", 14),
        PT_MONO_BOLD("fonts/PT Mono Bold.ttf", 15);

        private final String filePath;
        private final int index;

        Typefaces(String filePath, int index) {
            this.filePath = filePath;
            this.index = index;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public int getIndex() {
            return index;
        }

        public static String getFilePathByIndex(int index) {
            for (Typefaces typeface : Typefaces.values()) {
                if (typeface.getIndex() == index) return typeface.getFilePath();
            }
            return null;
        }
    }

    enum FontFamilies {

        PT_SANS,
        PT_SANS_NARROW,
        PT_SANS_CAPTION,
        PT_SERIF,
        PT_SERIF_CAPTION,
        PT_MONO
    }

    enum TextWeights {

        NORMAL,
        BOLD

    }

    enum TextStyles {

        REGULAR,
        ITALIC

    }
}
