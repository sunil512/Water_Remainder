package com.cloudicalabs.waterfinder.water_rem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Consumption extends Fragment {


    public Consumption() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.consumption, container, false);

        GraphView graphView = (GraphView)view.findViewById(R.id.graph);
        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graphView);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"7", "8", "9","10", "11", "12", "13"});
        staticLabelsFormatter.setVerticalLabels(new String[] {"0", "372", "744","1116", "1488", "1860","2232", "2604", "2976"});
        graphView.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

        return view;
    }

}


