package com.github.basnopisets.pttextview.test;

import android.graphics.Typeface;
import android.test.AndroidTestCase;

import static com.github.basnopisets.pttextview.utils.PTTypefaceManager.getTypeface;
import static com.github.basnopisets.pttextview.utils.PTTypefaceManager.getTypeface;

/**
 * Created by Oleg on 19.07.15.
 */
public class PTTypefaceManagerTest extends AndroidTestCase {

    private Typeface ptSans;
    private Typeface ptSansItalic;
    private Typeface ptSansBold;
    private Typeface ptSansBoldItalic;
    private Typeface ptSansNarrow;
    private Typeface ptSansNarrowBold;
    private Typeface ptSansCaption;
    private Typeface ptSansCaptionBold;

    private Typeface ptSerif;
    private Typeface ptSerifItalic;
    private Typeface ptSerifBold;
    private Typeface ptSerifBoldItalic;
    private Typeface ptSerifCaption;
    private Typeface ptSerifCaptionItalic;

    private Typeface ptMono;
    private Typeface ptMonoBold;

    public void setUp() throws Exception {
        super.setUp();
        ptSans = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Regular.ttf");
        ptSansItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Italic.ttf");
        ptSansBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Bold.ttf");
        ptSansBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Bold Italic.ttf");

        ptSansNarrow = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Narrow Regular.ttf");
        ptSansNarrowBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Narrow Bold.ttf");

        ptSansCaption = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Caption Regular.ttf");
        ptSansCaptionBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Caption Bold.ttf");

        ptSerif = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Regular.ttf");
        ptSerifItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Italic.ttf");
        ptSerifBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Bold.ttf");
        ptSerifBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Bold Italic.ttf");

        ptSerifCaption = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Caption Regular.ttf");
        ptSerifCaptionItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Caption Italic.ttf");

        ptMono = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Mono Regular.ttf");
        ptMonoBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Mono Bold.ttf");
    }

    public void testGetTypeface() throws Exception {
        assertEquals(ptSans.getStyle(), getTypeface(getContext(), 0));
        assertEquals(ptSansItalic, getTypeface(getContext(), 1));
        assertEquals(ptSansBold, getTypeface(getContext(), 2));
        assertEquals(ptSansBoldItalic, getTypeface(getContext(), 3));
        assertEquals(ptSansNarrow, getTypeface(getContext(), 4));
        assertEquals(ptSansNarrowBold, getTypeface(getContext(), 5));
        assertEquals(ptSansCaption, getTypeface(getContext(), 6));
        assertEquals(ptSansCaptionBold, getTypeface(getContext(), 7));
        assertEquals(ptSerif, getTypeface(getContext(), 8));
        assertEquals(ptSerifItalic, getTypeface(getContext(), 9));
        assertEquals(ptSerifBold, getTypeface(getContext(), 10));
        assertEquals(ptSerifBoldItalic, getTypeface(getContext(), 11));
        assertEquals(ptSerifCaption, getTypeface(getContext(), 12));
        assertEquals(ptSerifCaptionItalic, getTypeface(getContext(), 13));
        assertEquals(ptMono, getTypeface(getContext(), 14));
        assertEquals(ptMonoBold, getTypeface(getContext(), 15));
    }

    public void testGetTypeface1() throws Exception {
        assertEquals(ptSans, getTypeface(getContext(), 0, 0, 0));
        assertEquals(ptSansNarrow, getTypeface(getContext(), 1, 0, 0));
        assertEquals(ptSansCaption, getTypeface(getContext(), 2, 0, 0));
        assertEquals(ptSerif, getTypeface(getContext(), 3, 0, 0));
        assertEquals(ptSerifCaption, getTypeface(getContext(), 4, 0, 0));
        assertEquals(ptMono, getTypeface(getContext(), 5, 0, 0));

        assertEquals(ptSansBold, getTypeface(getContext(), 0, 1, 0));
        assertEquals(ptSansNarrowBold, getTypeface(getContext(), 1, 1, 0));
        assertEquals(ptSansCaptionBold, getTypeface(getContext(), 2, 1, 0));
        assertEquals(ptSerifBold, getTypeface(getContext(), 3, 1, 0));
        assertEquals(ptSerifCaption, getTypeface(getContext(), 4, 1, 0));
        assertEquals(ptMonoBold, getTypeface(getContext(), 5, 1, 0));

        assertEquals(ptSansItalic, getTypeface(getContext(), 0, 0, 1));
        assertEquals(ptSansNarrow, getTypeface(getContext(), 1, 0, 1));
        assertEquals(ptSansCaption, getTypeface(getContext(), 2, 0, 1));
        assertEquals(ptSerifItalic, getTypeface(getContext(), 3, 0, 1));
        assertEquals(ptSerifCaption, getTypeface(getContext(), 4, 0, 1));
        assertEquals(ptMono, getTypeface(getContext(), 5, 0, 1));

        assertEquals(ptSansBoldItalic, getTypeface(getContext(), 0, 1, 1));
        assertEquals(ptSansNarrow, getTypeface(getContext(), 1, 1, 1));
        assertEquals(ptSansCaption, getTypeface(getContext(), 2, 1, 1));
        assertEquals(ptSerifBoldItalic, getTypeface(getContext(), 3, 1, 1));
        assertEquals(ptSerifCaptionItalic, getTypeface(getContext(), 4, 1, 1));
        assertEquals(ptMonoBold, getTypeface(getContext(), 5, 1, 1));
    }
}