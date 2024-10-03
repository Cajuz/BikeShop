package br.com.etec.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdpterViewPagerBikes extends FragmentStateAdapter { //Vai conectar e gerenciar os fragmentos
    public AdpterViewPagerBikes(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 : return new BikesNovasFragment();
            case 1 : return new BikesUsadasFragment();
            case 2 : return new BikesDoacaoFragment();
            default : return new BikesNovasFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3; //quantos fragmentos vai gerenciar
    }
}
