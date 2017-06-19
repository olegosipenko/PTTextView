Android-PTTextView
==================
Deprecated - use new TextView `android:font` attribute instead

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-PTTextView-green.svg?style=true)](https://android-arsenal.com/details/1/3263)
<a href="http://www.methodscount.com/?lib=com.github.olegosipenko%3Apttextview%3A1.0.0"><img src="https://img.shields.io/badge/Methods and size-core: 181 | deps: 13751 | 2887 KB-e91e63.svg"></img></a>

![image](https://github.com/olegosipenko/PTTextView/blob/develop/art/banner.png)

An implementation of a [TextView](http://developer.android.com/reference/android/widget/TextView.html) with support of [Paratype & Google PT font family](http://www.paratype.com/public/)

A project was inspired by [RobotoTextView](https://github.com/johnkil/Android-RobotoTextView)


####List of supported fonts:
* [PTSans](https://www.google.com/fonts/specimen/PT+Sans)
* [PTSansNarrow](https://www.google.com/fonts/specimen/PT+Sans+Narrow)
* [PTSansCaption](https://www.google.com/fonts/specimen/PT+Sans+Caption)
* [PTSerif](https://www.google.com/fonts/specimen/PT+Serif)
* [PTSerifCaption](https://www.google.com/fonts/specimen/PT+Serif+Caption)
* [PTMono](https://www.google.com/fonts/specimen/PT+Mono)

![image](http://www.paratype.ru/public/ptssm_16faces.png)

###List of supported widgets:
 - PTTextView
 - PTEditText
 - PTButton
 - PTCheckBox
 - PTAutocompleteTextView
 - PTCheckedTextView
 - PTCompoundButton
 - PTExtractEditText
 - PTMultiAutoCompleteTextView
 - PTRadioButton
 - PTSwitch
 - PTToggleButton
 - PTChronometer
 - PTDigitalClock
 - PTTextClock


 ![image](https://github.com/olegosipenko/PTTextView/blob/develop/art/device-2015-08-31-155939_framed.png)

 <a href="https://play.google.com/store/apps/details?id=oleg.osipenko.pttextviewsampleapp&utm_source=global_co&utm_medium=prtnr&utm_content=Mar2515&utm_campaign=PartBadge&pcampaignid=MKT-AC-global-none-all-co-pr-py-PartBadges-Oct1515-1"><img alt="Get it on Google Play" width="200" src="https://play.google.com/intl/en_us/badges/images/apps/en-play-badge.png" /></a>

Download
--------
Download [the latest JAR][1] or grab via Maven:

```xml
<dependency>
  <groupId>com.github.olegosipenko</groupId>
  <artifactId>PTTextView</artifactId>
  <version>1.0.0</version>
</dependency>
```
or Gradle:
```groovy

repositories {
    jcenter()
}

dependencies {
    compile 'com.github.olegosipenko:pttextview:1.0.0'
}
```
[1]: https://github.com/olegosipenko/PTTextView/releases/download/v1.0.0/pttextview-1.0.0.aar

Usage
-----

#### In XML

To setup a typeface you must specify the parameter `typeface`:

``` xml
<pttextview.widget.PTTextView
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:typeface="pt_serif_bold_italic"/>
```

or specify a set of parameters `fontFamily`, `textWeight` and `textStyle`:
``` xml
<pttextview.widget.PTTextView
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fontFamily="pt_mono"
            app:textWeight="bold"
            app:textStyle="regular"/>
```

Setup typeface in code:

#### In Code

Using parameter `typeface`:
``` java
PTTextView textView = new PTTextView(context);
Typeface typeface = PTTypefaceManager.getTypeface(
        context, PTTypefaceManager.Typefaces.PT_SERIF_CAPTION_ITALIC);
PTTextViewUtils.setTypeface(textView, typeface);
```

Using parameters `fontFamily`, `textWeight` and `textStyle`:
``` java
PTTextViewUtils textView = new PTTextViewUtils(context);
Typeface typeface = PTTypefaceManager.getTypeface(
        context,
        PTTypefaceManager.FontFamilies.PT_SANS_NARROW,
        PTTypefaceManager.TextWeights.BOLD,
        PTTypefaceManager.TextStyles.REGULAR);
PTTextViewUtils.setTypeface(textView, typeface);
```

#### With Span

Using parameter `typeface`:
``` java
PTTypefaceSpan span = new PTTypefaceSpan(
        context,
        PTTypefaceManager.Typefaces.PT_SERIF_CAPTION_ITALIC);
Spannable spannable = new SpannableString("text");
spannable.setSpan(span, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
```

Using parameters `fontFamily`, `textWeight` and `textStyle`:
``` java
PTTypefaceSpan span = new PTTypefaceSpan(
        context,
        PTTypefaceManager.FontFamilies.PT_SERIF,
        PTTypefaceManager.TextWeights.BOLD,
        PTTypefaceManager.TextStyles.ITALIC);
Spannable spannable = new SpannableString("text");
spannable.setSpan(span, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
```

Gradle
------

If you intend to use is not all fonts, the extra fonts can be removed.

``` xml
android.applicationVariants.all{ variant ->
    variant.mergeAssets.doFirst {
        File fonts = file("${projectDir}/build/intermediates/exploded-aar/pttextview/pttextview/1.0.0/assets/fonts")
        if (fonts.exists()) {
            for (File file : fonts.listFiles()) {
                if (file.getName().contains("PT Sans")) {
                    println("delete " + file.getName() + " font")
                    file.delete()
                };
            }
        }
    }
}
```


Compatibility
-------------

The widget supports API down to Android 2.1 (API >= 7)

Credits
-------
The idea of this library was inspired by [Android-RobotoTextView]
(https://github.com/johnkil/Android-RobotoTextView) by [Evgeny Shishkin](https://github.com/johnkil)


License
-------

    Copyright (C) 2015 Oleg Osipenko

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
