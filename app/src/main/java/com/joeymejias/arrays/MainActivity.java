package com.joeymejias.arrays;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        Log.v("LogExample Array List 1", String.valueOf(myArray[0]));
        Log.v("LogExample Array List 1", String.valueOf(myArray[1]));
        Log.v("LogExample Array List 1", String.valueOf(myArray[2]));
        Log.v("LogExample Array List 1", String.valueOf(myArray[3]));
        Log.v("LogExample Array List 1", String.valueOf(myArray[4]));

        int[] myArray2 = {10, 20, 30, 40, 50};
        for (int i : myArray2) {
            Log.v("LogExample Array List 2", String.valueOf(i));
        }

        int[] myArray3 = {10, 20, 30, 40, 50};
        for (int i = 0; i < myArray3.length; i++) {
            Log.v("LogExample Array List 3", String.valueOf(myArray3[i]));
        }

        int[] myArray4 = {10, 20, 30, 40, 50};
        Log.v("LogExample Array List 4", Arrays.toString(myArray4));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
