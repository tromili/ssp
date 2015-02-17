package com.example.hanjelito.appbm;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;

/**
 * Created by hanjelito on 16/02/2015.
 */

public class PublicprofileFragment extends Fragment {

    GridView gridView;
    GridView gridViewCont;

    static final String[] numbers = new String[] {
            "#","Nombre", "Barrio", "Ubicación", "Monto Total", "Observaciones"};

    static final String[] values = new String[] { "1.",
            "Juan Chong","PAMPA","Lima","$ 350.00","Muy alejado" };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.publicprofileview, container, false);



        gridView = (GridView) view.findViewById(R.id.gridView1);
        gridViewCont = (GridView) view.findViewById(R.id.gridViewCont);


        String[] values = new String[] { "1.",
                "Juan Chong","PAMPA","Lima","$ 350.00","Muy alejado" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity()
                .getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, numbers);

        ArrayAdapter<String> adaptercont = new ArrayAdapter<String>(getActivity()
                .getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, values);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, numbers);

        gridView.setAdapter(adapter);
        gridViewCont.setAdapter(adaptercont);

        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Toast.makeText(getActivity().getApplicationContext(),
                        ((TextView) v).getText(), Toast.LENGTH_SHORT).show();

            }
        });

       // return rootView;
       return view;
    }
}