package com.android.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View miMenu = inflater.inflate(R.layout.fragment_menu, container, false);

        final ImageButton btn1Menu;
        final ImageButton btn2Menu;
        final ImageButton btn3Menu;

        btn1Menu = miMenu.findViewById(R.id.linterna);
        btn2Menu = miMenu.findViewById(R.id.musica);
        btn3Menu = miMenu.findViewById(R.id.favorito);

        btn1Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn1Menu.setBackgroundColor(getResources().getColor(R.color.colorFocus));
                btn2Menu.setBackgroundColor(getResources().getColor(R.color.colorDefault));
                btn3Menu.setBackgroundColor(getResources().getColor(R.color.colorDefault));

                ((ComunicaMenu) getActivity()).menu(0);
            }
        });

        btn2Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn1Menu.setBackgroundColor(getResources().getColor(R.color.colorDefault));
                btn2Menu.setBackgroundColor(getResources().getColor(R.color.colorFocus));
                btn3Menu.setBackgroundColor(getResources().getColor(R.color.colorDefault));

                ((ComunicaMenu) getActivity()).menu(1);
            }
        });

        btn3Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn1Menu.setBackgroundColor(getResources().getColor(R.color.colorDefault));
                btn2Menu.setBackgroundColor(getResources().getColor(R.color.colorDefault));
                btn3Menu.setBackgroundColor(getResources().getColor(R.color.colorFocus));

                ((ComunicaMenu) getActivity()).menu(2);
            }
        });

        return miMenu;
    }

}
