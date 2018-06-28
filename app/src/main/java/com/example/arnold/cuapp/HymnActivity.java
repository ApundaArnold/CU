package com.example.arnold.cuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class HymnActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hymn, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.S1) {
            Intent intent = new Intent(this,Song1.class);
            startActivity(intent);

        } else if (id == R.id.S2) {
            Intent intent = new Intent(this,Song2.class);
            startActivity(intent);

        } else if (id == R.id.S3) {
            Intent intent = new Intent(this,Song3.class);
            startActivity(intent);


        } else if (id == R.id.S4){
            Intent intent = new Intent(this,Song4.class);
            startActivity(intent);


        }
     else if (id == R.id.S5) {
            Intent intent = new Intent(this,Song5.class);
            startActivity(intent);


        } else if (id == R.id.S6) {
            Intent intent = new Intent(this,Song6.class);
            startActivity(intent);

    } else if (id == R.id.S7){
            Intent intent = new Intent(this,Song7.class);
            startActivity(intent);


        }
    else if (id == R.id.S8) {
            Intent intent = new Intent(this,Song8.class);
            startActivity(intent);



        } else if (id == R.id.S9) {
            Intent intent = new Intent(this,Song9.class);
            startActivity(intent);



        } else if (id == R.id.S10){
            Intent intent = new Intent(this,Song10.class);
            startActivity(intent);

        } else if (id == R.id.S11) {
            Intent intent = new Intent(this,Song11.class);
            startActivity(intent);

    } else if (id == R.id.S12) {
            Intent intent = new Intent(this,Song12.class);
            startActivity(intent);


        } else if (id == R.id.S13){
            Intent intent = new Intent(this,Song13.class);
            startActivity(intent);

        } else if (id == R.id.S14) {
            Intent intent = new Intent(this,Song14.class);
            startActivity(intent);

        } else if (id == R.id.S15) {
            Intent intent = new Intent(this,Song15.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
