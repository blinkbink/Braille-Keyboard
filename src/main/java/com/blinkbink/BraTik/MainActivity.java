package com.blinkbink.BraTik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.util.Locale;

//The main screen of the app shortcut icon
public class MainActivity extends AppCompatActivity {

    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //If the user changes the current system language
            Common.currentSystemLanguage = Locale.getDefault().getLanguage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Opensetting(View view)
    {
        //Intent dialogIntent = new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS);
        //dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //startActivity(dialogIntent);

        InputMethodManager im = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        im.showInputMethodPicker();
    }

}