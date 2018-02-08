package com.blinkbink.BraTik.Pola;

import android.content.Context;

import com.blinkbink.BraTik.Common;
import com.blinkbink.BraTik.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

//Just contain English small characters pattern
public class HurufKecil extends Pattern {
    private Context context;
    private String patternPronounce = null;
    private String finalResultPattern = null;
    //--------------------------------------------------------------------------------------------//
    public HurufKecil(Context context){
        this.context = context;
        Common.currentLanguage = Common.ENGLISH_LANGUAGE_INPUT_METHOD;
        Common.currentLocaleLanguage = Common.indonesiaLocale;
        Common.isRTL = false;
    }
    //--------------------------------------------------------------------------------------------//
    @SuppressWarnings("All")
    public void setPattern(Set pattern) {
        if (pattern.size() == 1 && pattern.containsAll(Collections.singletonList(1))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "a";
            patternPronounce = "a";
        } else if (pattern.size() == 1 && pattern.containsAll(Collections.singletonList(2))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ",";
            patternPronounce = "Koma";
        } else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 2))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "b";
            patternPronounce = "b";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(2, 3))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ";";
            patternPronounce = "Semicolon";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(2, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ":";
            patternPronounce = "Titik Dua";
        }
        else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ".";
            patternPronounce = "Titik";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "c";
            patternPronounce = "c";
        } else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "e";
            patternPronounce = "e";
        } else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(2, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "i";
            patternPronounce = "i";
        } else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 3))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "k";
            patternPronounce = "k";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "d";
            patternPronounce = "d";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 2, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "f";
            patternPronounce = "f";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 2, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "h";
            patternPronounce = "h";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "j";
            patternPronounce = "j";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 2, 3))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "l";
            patternPronounce = "l";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 3, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "m";
            patternPronounce = "m";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 3, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "o";
            patternPronounce = "o";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 3, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "s";
            patternPronounce = "s";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 3, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "!";
            patternPronounce = "Tanda Seru";
        }
        else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 3, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "(";
            patternPronounce = context.getString(R.string.KurungBuka);
        }
        else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 3, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ")";
            patternPronounce = context.getString(R.string.KurungTutup);
        }
        else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "?";
            patternPronounce = "Tanda Tanya";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "-";
            patternPronounce = "Strip";
        }
        else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "u";
            patternPronounce = "u";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "g";
            patternPronounce = "g";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 3, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "n";
            patternPronounce = "n";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 3, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "p";
            patternPronounce = "p";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 3, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "r";
            patternPronounce = "r";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 3, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "t";
            patternPronounce = "t";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "v";
            patternPronounce = "v";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 4, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "w";
            patternPronounce = "w";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 3, 4, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "x";
            patternPronounce = "x";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 3, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "z";
            patternPronounce = "z";
        } else if (pattern.size() == 5 && pattern.containsAll(Arrays.asList(1, 2, 3, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "q";
            patternPronounce = "q";
        } else if (pattern.size() == 5 && pattern.containsAll(Arrays.asList(1, 3, 4, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "y";
            patternPronounce = "y";
        } else {
            finalResultPattern = null;
            patternPronounce = null;
        }
    }
    //--------------------------------------------------------------------------------------------//
    public String getPatternResult() {
        return finalResultPattern;
    }
    //--------------------------------------------------------------------------------------------//
    public String getPatternPronounce(){
        return patternPronounce != null ? patternPronounce : finalResultPattern;
    }
    //--------------------------------------------------------------------------------------------//
    public String getClassTitle(){
        Common.currentLocaleLanguage = Common.currentSystemLocaleLanguage;
        return context.getString(R.string.english_small_letters_keyboard);
    }
    //--------------------------------------------------------------------------------------------//
    public int getClassTitleSoundPath() {
        return -1;
    }
    //--------------------------------------------------------------------------------------------//
    public int getPatternSoundPronounce(){
        return -1;
    }
    //--------------------------------------------------------------------------------------------//
    public Pattern nextPattern(Context context){
        return new HurufKapital(context);
    }
    //--------------------------------------------------------------------------------------------//
    public Pattern previousPattern(Context context){
        return new SpesialKarakter(context);
    }
    //--------------------------------------------------------------------------------------------//
}
