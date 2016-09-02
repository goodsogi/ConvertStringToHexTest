package com.commax.convertstringtohextest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertHexstringToHex();
    }

    private void convertHexstringToHex() {
        String s="0x22";
        s = s.replaceFirst("^0x", "");
        int value =  Integer.valueOf(s, 16);

    }
}
