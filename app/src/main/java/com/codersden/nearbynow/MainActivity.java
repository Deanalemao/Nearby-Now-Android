package com.codersden.nearbynow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation=findViewById(R.id.bottomNavigation);
        bottomNavigation.show(2,true);

        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.home_icon));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.add));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.profile_icon));
    }
}