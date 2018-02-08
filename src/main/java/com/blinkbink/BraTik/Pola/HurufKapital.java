package com.blinkbink.BraTik.Pola;

import android.content.Context;

import com.blinkbink.BraTik.Common;
import com.blinkbink.BraTik.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class HurufKapital extends Pattern {
    private Context context;
    private String patternPronounce = null;
    private String finalResultPattern = null;

    //--------------------------------------------------------------------------------------------//
    public HurufKapital(Context context){
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
            finalResultPattern = "A";
            patternPronounce = "Kapital A";
        } else if (pattern.size() == 1 && pattern.containsAll(Collections.singletonList(2))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ",";
            patternPronounce = "Koma";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(2, 3))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ";";
            patternPronounce = "Semicolon";
        }
        else if (pattern.size() == 1 && pattern.containsAll(Collections.singletonList(3))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "'";
            patternPronounce = "Petik Satu";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 2))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "B";
            patternPronounce = "Kapital B";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(2, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ":";
            patternPronounce = "Titik Dua";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "C";
            patternPronounce = "Kapital C";
        } else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(2, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "I";
            patternPronounce = "Kapital I";
        } else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "E";
            patternPronounce = "Kapital E";
        } else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(1, 3))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "K";
            patternPronounce = "Kapital K";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "D";
            patternPronounce = "Kapital D";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 2, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "F";
            patternPronounce = "Kapital F";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 2, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "H";
            patternPronounce = "Kapital H";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "J";
            patternPronounce = "Kapital J";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 2, 3))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "L";
            patternPronounce = "Kapital L";
        }
        else if (pattern.size() == 2 && pattern.containsAll(Arrays.asList(3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "-";
            patternPronounce = "Strip";
        }
        else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 3, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "M";
            patternPronounce = "Kapital M";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 3, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "O";
            patternPronounce = "Kapital O";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 3, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "S";
            patternPronounce = "Kapital S";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 3, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "!";
            patternPronounce = "Tanda Seru";
        }
        else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 3, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "(";
            patternPronounce = "Kurung Buka";
        }
        else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 3, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ")";
            patternPronounce = "Kurung Tutup";
        }
        else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "?";
            patternPronounce = "Tanda Tanya";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(2, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = ".";
            patternPronounce = "Titik";
        } else if (pattern.size() == 3 && pattern.containsAll(Arrays.asList(1, 3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "U";
            patternPronounce = "Kapital U";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "G";
            patternPronounce = "Kapital G";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 3, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "N";
            patternPronounce = "Kapital N";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 3, 4))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "P";
            patternPronounce = "Kapital P";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 3, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "R";
            patternPronounce = "Kapital R";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 3, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "T";
            patternPronounce = "Kapital T";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 2, 3, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "V";
            patternPronounce = "Kapital V";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(2, 4, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "W";
            patternPronounce = "Kapital W";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 3, 4, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "X";
            patternPronounce = "Kapital X";
        } else if (pattern.size() == 4 && pattern.containsAll(Arrays.asList(1, 3, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "Z";
            patternPronounce = "Kapital Z";
        } else if (pattern.size() == 5 && pattern.containsAll(Arrays.asList(1, 3, 4, 5, 6))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "Y";
            patternPronounce = "Kapital Y";
        } else if (pattern.size() == 5 && pattern.containsAll(Arrays.asList(1, 2, 3, 4, 5))) {
            Common.currentLocaleLanguage = Common.indonesiaLocale;
            finalResultPattern = "Q";
            patternPronounce = "Kapital Q";
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
        return patternPronounce;
    }
    //--------------------------------------------------------------------------------------------//
    public String getClassTitle(){
        Common.currentLocaleLanguage = Common.indonesiaLocale;
        return context.getString(R.string.english_capital_letters_keyboard);
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
        return new Nomor(context);
    }
    //--------------------------------------------------------------------------------------------//
    public Pattern previousPattern(Context context){
        return new HurufKecil(context);
    }
    //--------------------------------------------------------------------------------------------//
}
