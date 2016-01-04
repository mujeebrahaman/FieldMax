
package com.fieldmax.android.fieldmaxv2.util;

import android.content.res.AssetManager;
import android.graphics.Typeface;

import java.util.Hashtable;

public class TypefaceCache {

    private static final String FIELDMAX_FONT_LIGHT = "fonts/Raleway_Light.ttf";
    private static final String FIELDMAX_FONT_MEDIUM = "fonts/Raleway_Medium.ttf";
    private static final String FIELDMAX_FONT_BOLD = "fonts/Raleway_Bold.ttf";
    private static final String FIELDMAX_FONT_REGULAR = "fonts/Raleway_Regular.ttf";
    private static final String FIELDMAX_FONT_SEMIBOLD = "fonts/Raleway_SemiBold.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_BLACK = "fonts/Roboto_Black.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_ITALIC = "fonts/Roboto_Italic.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_LIGHT = "fonts/Roboto_Light.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_LIGHT_ITALIC = "fonts/Roboto_LightItalic.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_MEDIUM = "fonts/Roboto_Medium.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_REGULAR = "fonts/Roboto_Regular.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_THIN = "fonts/Roboto_Thin.ttf";
    private static final String FIELDMAX_FABRICA = "fonts/Fabrica.ttf";
    private static final String FIELDMAX_FONT_ROBOTO_BOLD = "fonts/Roboto_Bold.ttf";



    private static final Hashtable<String, Typeface> CACHE = new Hashtable<String, Typeface>();

    public static Typeface get(AssetManager manager, int typefaceCode) {
        synchronized (CACHE) {
            String typefaceName = getTypefaceName(typefaceCode);
            if (!CACHE.containsKey(typefaceName)) {
                Typeface t = Typeface.createFromAsset(manager, typefaceName);
                CACHE.put(typefaceName, t);
            }
            return CACHE.get(typefaceName);
        }
    }

    private static String getTypefaceName(int typefaceCode) {
        String typefaceTemp = "";
        switch (typefaceCode) {
            case 0:
                typefaceTemp = FIELDMAX_FONT_LIGHT;
                break;
            case 1:
                typefaceTemp = FIELDMAX_FONT_MEDIUM;
                break;
            case 2:
                typefaceTemp = FIELDMAX_FONT_BOLD;
                break;
            case 3:
                typefaceTemp = FIELDMAX_FONT_REGULAR;
                break;
            case 4:
                typefaceTemp = FIELDMAX_FONT_SEMIBOLD;
                break;
            case 5:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_BLACK;
                break;
            case 6:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_ITALIC;
                break;
            case 7:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_LIGHT;
                break;
            case 8:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_LIGHT_ITALIC;
                break;
            case 9:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_MEDIUM;
                break;
            case 10:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_REGULAR;
                break;
            case 11:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_THIN;
                break;
            case 12:
                typefaceTemp = FIELDMAX_FONT_ROBOTO_BOLD;
                break;
            case 13:
                typefaceTemp = FIELDMAX_FABRICA;
                break;
            default:
                typefaceTemp = FIELDMAX_FONT_REGULAR;
        }
        return typefaceTemp;
    }// End of getTypefaceName method
}// End of TypefaceCache Class
