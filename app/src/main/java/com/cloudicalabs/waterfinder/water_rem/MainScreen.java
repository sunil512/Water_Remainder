package com.cloudicalabs.waterfinder.water_rem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainScreen extends Fragment {

    double ram;
    TextView gls;

    public MainScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.main_screen, container, false);

        TextView textView = (TextView)view.findViewById(R.id.res);
        Intent r = getActivity().getIntent();
        double res = r.getDoubleExtra("res", 0);
        String result = Double.toString(res);
        textView.setText(result);

        ram = Double.parseDouble(textView.getText().toString());
        gls = (TextView) view.findViewById(R.id.glasses);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiaFragment df = new DiaFragment();
                df.show(getFragmentManager(),"Frag");
            }
        });


        return view;
    }

    public void onSelectValue(String value) {
        switch (value){
            case "0":
                if (ram == 0){
                    gls.setText("0");
                }else if (ram == 1.0){
                    gls.setText("4");
                }else if (ram >= 1.5){
                    gls.setText("6");
                }else if (ram == 2.0){
                    gls.setText("8");
                }else if (ram >= 2.5){
                    gls.setText("10");
                }else if (ram == 3.0){
                    gls.setText("12");
                }else if (ram >= 3.5){
                    gls.setText("14");
                }else if (ram == 4.0){
                    gls.setText("16");
                }else if (ram >= 4.5){
                    gls.setText("18");
                }else if (ram == 5.0){
                    gls.setText("20");
                }else if (ram >= 5.5){
                    gls.setText("22");
                }else if (ram == 6.0){
                    gls.setText("24");
                }
                break;
            case "1":
                if (ram == 0){
                    gls.setText("0");
                }else if (ram == 1.0){
                    gls.setText("3");
                }else if (ram == 2.0){
                    gls.setText("6");
                }else if (ram >= 2.5){
                    gls.setText("8");
                }else if (ram == 3.0){
                    gls.setText("9");
                }else if (ram >= 3.5){
                    gls.setText("11");
                }else if (ram == 4.0){
                    gls.setText("12");
                }else if (ram >= 4.5){
                    gls.setText("14");
                }else if (ram == 5.0){
                    gls.setText("15");
                }else if (ram >= 5.5){
                    gls.setText("17");
                }else if (ram == 6.0){
                    gls.setText("18");
                }
                break;
            case "2":
                if (ram == 0){
                    gls.setText("0");
                }else if (ram == 1.0){
                    gls.setText("2");
                }else if (ram == 2.0){
                    gls.setText("4");
                }else if (ram >= 2.5){
                    gls.setText("5");
                }else if (ram == 3.0){
                    gls.setText("6");
                }else if (ram >= 3.5){
                    gls.setText("7");
                }else if (ram == 4.0){
                    gls.setText("8");
                }else if (ram >= 4.5){
                    gls.setText("9");
                }else if (ram == 5.0){
                    gls.setText("10");
                }else if (ram >= 5.5){
                    gls.setText("11");
                }else if (ram == 6.0){
                    gls.setText("12");
                }
                break;
            case "3":
                if (ram == 0){
                    gls.setText("0");
                }else if (ram == 1.0){
                    gls.setText("2");
                }else if (ram == 2.0){
                    gls.setText("3");
                }else if (ram >= 2.5){
                    gls.setText("4");
                }else if (ram == 3.0){
                    gls.setText("5");
                }else if (ram >= 3.5){
                    gls.setText("6");
                }else if (ram == 4.0){
                    gls.setText("7");
                }else if (ram >= 4.5){
                    gls.setText("8");
                }else if (ram == 5.0){
                    gls.setText("9");
                }else if (ram >= 5.5){
                    gls.setText("10");
                }else if (ram == 6.0){
                    gls.setText("11");
                }
                break;
            case "4":
                if (ram == 0){
                    gls.setText("0");
                }else if (ram == 1.0){
                    gls.setText("1");
                }else if (ram == 2.0){
                    gls.setText("2");
                }else if (ram >= 2.5){
                    gls.setText("3");
                }else if (ram == 3.0){
                    gls.setText("3");
                }else if (ram >= 3.5){
                    gls.setText("4");
                }else if (ram == 4.0){
                    gls.setText("4");
                }else if (ram >= 4.5){
                    gls.setText("5");
                }else if (ram == 5.0){
                    gls.setText("5");
                }else if (ram >= 5.5){
                    gls.setText("6");
                }else if (ram == 6.0){
                    gls.setText("6");
                }
                break;
        }
    }
}
