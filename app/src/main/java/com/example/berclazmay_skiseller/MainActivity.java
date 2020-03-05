package com.example.berclazmay_skiseller;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu items for use in the action bar
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handle presses on the action bar items
        switch(item.getItemId()){
            case R.id.action_home:
                openHome();
                return true;
            case R.id.action_products:
                openProducts();
                return true;
            case R.id.action_findUs:
                openFindUs();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSettings() {

    }

    private void openFindUs() {

    }

    private void openProducts() {

    }

    private void openHome() {

    }


}
