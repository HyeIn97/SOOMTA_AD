package com.example.soomta_ad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.soomta_ad.classView.FragmentClassMainActivity;
import com.example.soomta_ad.homeView.homeFragment;
import com.example.soomta_ad.loginAndJoinView.FragmentLogin;
import com.example.soomta_ad.myPage.myPageMainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //private BottomNavigationView navView;
    BottomNavigationView bottomNavView;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavView = findViewById(R.id.nav_view);
        loginBtn = findViewById(R.id.logInBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.content_layout, new FragmentLogin()).commitAllowingStateLoss();
            }
        });
        bottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.content_layout, new homeFragment()).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.list:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.content_layout, new FragmentClassMainActivity()).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.search:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.content_layout, new SearchMainActivity()).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.user:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.content_layout, new myPageMainActivity()).commitAllowingStateLoss();
                        return true;
                    }
                }
                return false;
            }
        });
        // defaul view - main
        bottomNavView.setSelectedItemId(R.id.nav_home);
    }
}