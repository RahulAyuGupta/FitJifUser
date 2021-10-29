package com.fitjifuser.ui.MainActivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.fitjifuser.R;
import com.fitjifuser.ui.History.HistoryActivity;
import com.fitjifuser.ui.MyProfile.MyProfileActivity;
import com.fitjifuser.ui.MyWorkout.MyWorkoutActivity;
import com.fitjifuser.ui.Notification.NotificationActivity;
import com.fitjifuser.ui.Setting.SettingActivity;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;
    private DrawerLayout drawer;
    private FragmentManager fm;
    //private ProgressBarHandler mProgressBarHandler;
    Toolbar toolbar;
    private ActionBarDrawerToggle toggle;
    private TextView userNameTV;
    //private CircleImageView userImageView;
    private String USERNAME;
    private TextView offerAndFreeRides;
    private String promo_status;
    private ActionBar actionBar;
    private TextView nav_version;
    private String version;
    private String refer_code1;
    private Menu menu_option;
    private TextView nav_version1;
    private String customer_type;
    private int backCount;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        drawer =(DrawerLayout) findViewById(R.id.drawer_layout1);
        toggle =new ActionBarDrawerToggle(this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        if (Build.VERSION.SDK_INT > 22) {
            toggle.getDrawerArrowDrawable().setColor(getColor(R.color.purple_200));

        }
        toggle.syncState();
        navigationView =(NavigationView)findViewById(R.id.nav_view1);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        menu_option = navigationView.getMenu();
        try {
            View headerLayout =navigationView.getHeaderView(0);
            //userNameTV = (TextView)headerLayout.findViewById(R.id.userNameTV);
            //userImageView=(CircleImageView)headerLayout.findViewById(R.id.userImageView);


            getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
                @Override
                public void onBackStackChanged(){
                    backCount = getSupportFragmentManager().getBackStackEntryCount();
                    if (backCount > 0) {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // show back button
                        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                onBackPressed();
                            }
                        });
                    } else if(backCount ==0){
                        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                        getSupportFragmentManager().popBackStack();
                        getSupportFragmentManager().popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
                        toggle.syncState();
                        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                drawer.openDrawer(GravityCompat.START);
                                if (drawer.isDrawerOpen(GravityCompat.START)) {
                                    drawer.closeDrawer(GravityCompat.START);
                                }
                            }
                        });
                    }
                }
            });


        }catch (Exception e){}


    }



    @Override
    public void onBackPressed() {
        // DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // android.os.Process.killProcess(android.os.Process.myPid());
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id ==R.id.action_settings){
            return false;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item){

        int id = item.getItemId();
         if(id ==R.id.nav_settings){
            Intent i1 = new Intent(MainActivity.this, SettingActivity.class);
            i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i1);

        }
         else if(id ==R.id.nav_notifications){
             Intent i1 = new Intent(MainActivity.this, NotificationActivity.class);
             i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
             startActivity(i1);

         }

         else if(id ==R.id.nav_history){
             Intent i1 = new Intent(MainActivity.this, HistoryActivity.class);
             i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
             startActivity(i1);

         }
         else if(id ==R.id.nav_my_workouts){
             Intent i1 = new Intent(MainActivity.this, MyWorkoutActivity.class);
             i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
             startActivity(i1);

         }
         else if(id ==R.id.nav_security){
             Intent i1 = new Intent(MainActivity.this, MyProfileActivity.class);
             i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
             startActivity(i1);

         }

        DrawerLayout drawer =(DrawerLayout)findViewById(R.id.drawer_layout1);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onDestroy(){
        System.gc();
        super.onDestroy();
    }
}
