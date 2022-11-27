package com.android.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivityFragment extends AppCompatActivity implements ComunicaMenu {

    private Fragment[] misFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        misFragment = new Fragment[]{new LinternaFragment(), new MusicaFragment(), new FavoritosFragment()};

        // Iniciar en Linterna Fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.container, misFragment[0]).commit();

    }

    @Override
    public void menu(int queBoton) {
        switch (queBoton) {
            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, misFragment[0]).commit();
                break;
            case 1:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, misFragment[1]).commit();
                break;
            case 2:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, misFragment[2]).commit();
                break;
        }
    }
}
