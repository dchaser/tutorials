package com.example.dasun.newboston;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //we need a handle to android.content.res.Resources; to get the Screen size using DisplayMetrics
        Resources res = getResources();

        //conversion of Complex Unit DIP into actual pixel size, here we need 100px
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,100,res.getDisplayMetrics());

        //xcxcx

        Button b = new Button(MainActivity.this);

        b.setWidth(px);
        b.setHeight(px);

        //test comment
    }

    private static int GetActualDIPValue(Activity activity, int PX){

        Resources r = activity.getResources();

        int actualDIP = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,PX, r.getDisplayMetrics());

        return actualDIP;
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
