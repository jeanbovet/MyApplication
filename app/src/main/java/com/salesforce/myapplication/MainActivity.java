package com.salesforce.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.salesforce.mylibrary.MyLibraryClass;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("mylibrary");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibraryClass myLibraryClass = new MyLibraryClass();
        myLibraryClass.helloNative();
    }
}
