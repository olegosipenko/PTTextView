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
    private Typeface ptSansNarrowItalic;
    private Typeface ptSansNarrowBold;
    private Typeface ptSansNarrowBoldItalic;
    private Typeface ptSansCaption;
    private Typeface ptSansCaptionItalic;
    private Typeface ptSansCaptionBold;
    private Typeface ptSansCaptionBoldItalic;

    private Typeface ptSerif;
    private Typeface ptSerifItalic;
    private Typeface ptSerifBold;
    private Typeface ptSerifBoldItalic;
    private Typeface ptSerifNarrow;
    private Typeface ptSerifNarrowItalic;
    private Typeface ptSerifNarrowBold;
    private Typeface ptSerifNarrowBoldItalic;
    private Typeface ptSerifCaption;
    private Typeface ptSerifCaptionItalic;
    private Typeface ptSerifCaptionBold;
    private Typeface ptSerifCaptionBoldItalic;

    public void setUp() throws Exception {
        super.setUp();
        ptSans = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Regular.ttf");
        ptSansItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Italic.ttf");
        ptSansBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Bold.ttf");
        ptSansBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Bold Italic.ttf");

        ptSansNarrow = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Narrow.ttf");
        // TODO find italic and change to it
        ptSansNarrowItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Narrow.ttf");
        ptSansNarrowBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Narrow Bold.ttf");
        // TODO find italic and change to it
        ptSansNarrowBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Narrow Bold.ttf");

        ptSansCaption = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Caption Regular.ttf");
        // TODO find italic and change to it
        ptSansCaptionItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Caption Regular.ttf");
        ptSansCaptionBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Caption Bold.ttf");
        // TODO find italic and change to it
        ptSansCaptionBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Sans Caption Bold.ttf");


        ptSerif = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Regular.ttf");
        ptSerifItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Italic.ttf");
        ptSerifBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Bold.ttf");
        ptSerifBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Bold Italic.ttf");

        ptSerifNarrow = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Regular.ttf");
        ptSerifNarrowItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Itali.ttf");
        ptSerifNarrowBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Bold.ttf");
        ptSerifNarrowBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Bold Italic.ttf");

        ptSerifCaption = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Caption Regular.ttf");
        ptSerifCaptionItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Caption Italic.ttf");
        // TODO find bold versions and change to it
        ptSerifCaptionBold = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Caption Regular.ttf");
        ptSerifCaptionBoldItalic = Typeface.createFromAsset(getContext().getAssets(), "fonts/PT Serif Caption Italic.ttf");
    }

    public void testGetTypeface() throws Exception {
        assertEquals(ptSans, getTypeface(getContext(), 0));
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
    }

    public void testGetTypeface1() throws Exception {
        assertEquals(ptSans, getTypeface(getContext(), 0, 0, 0));
        assertEquals(ptSansNarrow, getTypeface(getContext(), 1, 0, 0));
        assertEquals(ptSansCaption, getTypeface(getContext(), 2, 0, 0));
        assertEquals(ptSerif, getTypeface(getContext(), 3, 0, 0));
        assertEquals(ptSerifNarrow, getTypeface(getContext(), 4, 0, 0));
        assertEquals(ptSerifCaption, getTypeface(getContext(), 5, 0, 0));

        assertEquals(ptSansBold, getTypeface(getContext(), 0, 1, 0));
        assertEquals(ptSansNarrowBold, getTypeface(getContext(), 1, 1, 0));
        assertEquals(ptSansCaptionBold, getTypeface(getContext(), 2, 1, 0));
        assertEquals(ptSerifBold, getTypeface(getContext(), 3, 1, 0));
        assertEquals(ptSerifNarrowBold, getTypeface(getContext(), 4, 1, 0));
        assertEquals(ptSerifCaptionBold, getTypeface(getContext(), 5, 1, 0));

        assertEquals(ptSansItalic, getTypeface(getContext(), 0, 0, 1));
        assertEquals(ptSansNarrowItalic, getTypeface(getContext(), 1, 0, 1));
        assertEquals(ptSansCaptionItalic, getTypeface(getContext(), 2, 0, 1));
        assertEquals(ptSerifItalic, getTypeface(getContext(), 3, 0, 1));
        assertEquals(ptSerifNarrowItalic, getTypeface(getContext(), 4, 0, 1));
        assertEquals(ptSerifCaptionItalic, getTypeface(getContext(), 5, 0, 1));

        assertEquals(ptSans, getTypeface(getContext(), 0, 1, 1));
        assertEquals(ptSansNarrow, getTypeface(getContext(), 1, 1, 1));
        assertEquals(ptSansCaption, getTypeface(getContext(), 2, 1, 1));
        assertEquals(ptSerif, getTypeface(getContext(), 3, 1, 1));
        assertEquals(ptSerifNarrow, getTypeface(getContext(), 4, 1, 1));
        assertEquals(ptSerifCaption, getTypeface(getContext(), 5, 1, 1));
    }
}