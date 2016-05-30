package com.cloudicalabs.waterfinder.water_rem;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiaFragment extends DialogFragment {

    int pos;

    ListAdapter listAdapter;
    RecyclerView recyclerView;
    Button ok;



    public DiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.dialog, container, false);
        setCancelable(false);
        ok = (Button) v.findViewById(R.id.submit);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.list);
        listAdapter = new ListAdapter(getContext(),getData());
        recyclerView.setAdapter(listAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos = listAdapter.selectedPos;
                String value = String.valueOf(pos);
                FragmentManager fm = getFragmentManager();
                MainScreen mainScreen = (MainScreen)fm.findFragmentById(R.id.ms);
                mainScreen.onSelectValue(value);
                dismiss();
            }
        });

        return v;

    }

    public static List<Listen> getData()
    {
        List<Listen> data = new ArrayList<>();
        int[] images = {R.drawable.bottle,R.drawable.lotion,R.drawable.soap,R.drawable.soda,R.drawable.sodaa};
        String[] texts = {"250ml","300ml","500ml","750ml","1ltr"};
        for (int i=0;i<texts.length && i<images.length;i++){
            Listen current = new Listen();
            current.img = images[i];
            current.text= texts[i];
            data.add(current);
        }
        return data;
    }

}
