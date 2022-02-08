package com.example.soomta_ad.classView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.soomta_ad.R;
import com.example.soomta_ad.homeView.homeFragment;
import com.example.soomta_ad.myPage.myPageMainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FragmentClassMainActivity extends Fragment {
    ViewGroup viewGroup;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        viewGroup = (ViewGroup)inflater.inflate(R.layout.class_main,container,false);
        ImageButton educationMain = viewGroup.findViewById(R.id.educationMain);
        ImageButton certificateMain = viewGroup.findViewById(R.id.certificateMain);
        ImageButton employeementMain = viewGroup.findViewById(R.id.employeementMain);
        ImageButton artMain = viewGroup.findViewById(R.id.artMain);
        ImageButton retackMain = viewGroup.findViewById(R.id.retackMain);
        ImageButton ectMain = viewGroup.findViewById(R.id.ectMain);

        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        educationMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentEducationMain fragmentEducationMain = new FragmentEducationMain();
                transaction.replace(R.id.content_layout, fragmentEducationMain);
                transaction.commit();
            }
        });
        certificateMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentCertificateMain fragmentCertificateMain = new FragmentCertificateMain();
                transaction.replace(R.id.content_layout, fragmentCertificateMain);
                transaction.commit();
            }
        });
        employeementMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentEmployeementMain fragmentEmployeementMain = new FragmentEmployeementMain();
                transaction.replace(R.id.content_layout, fragmentEmployeementMain);
                transaction.commit();
            }
        });
        artMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentArtMain fragmentArtMain = new FragmentArtMain();
                transaction.replace(R.id.content_layout, fragmentArtMain);
                transaction.commit();
            }
        });
        retackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmenTretackMain fragmenTretackMain = new FragmenTretackMain();
                transaction.replace(R.id.content_layout, fragmenTretackMain);
                transaction.commit();
            }
        });
        ectMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentEctMain fragmentEctMain = new FragmentEctMain();
                transaction.replace(R.id.content_layout, fragmentEctMain);
                transaction.commit();
            }
        });

        return viewGroup;
//        viewGroup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                System.out.println(R.id.educationMain + "이게 널이라고?");
//                System.out.println(viewGroup.getId());
//
//                switch (viewGroup.getId()){
//                    case R.id.educationMain:
//                        FragmentEducationMain fragmentEducationMain = new FragmentEducationMain();
//                        transaction.replace(R.id.content_layout, fragmentEducationMain);
//                        break;
//                    case R.id.certificateMain:
//                        FragmentCertificateMain fragmentCertificateMain = new FragmentCertificateMain();
//                        transaction.replace(R.id.content_layout, fragmentCertificateMain);
//                        break;
//                }
//                transaction.commit();
//            }
//        });

    }

}
