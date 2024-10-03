package br.com.etec.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class BikesActivity extends AppCompatActivity {
   TabLayout idTabLayoutBikes;
   ViewPager2 idViewPagerBikes;
   AdpterViewPagerBikes adpterViewPagerBikes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bikes_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        idTabLayoutBikes = findViewById(R.id.idTabLayoutBikes);
        idViewPagerBikes = findViewById(R.id.idViewPagerBikes);

        adpterViewPagerBikes = new AdpterViewPagerBikes(this);

        idViewPagerBikes.setAdapter(adpterViewPagerBikes);

        idTabLayoutBikes.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                idViewPagerBikes.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}