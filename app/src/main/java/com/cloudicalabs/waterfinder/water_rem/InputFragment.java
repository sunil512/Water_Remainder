package com.cloudicalabs.waterfinder.water_rem;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputFragment extends DialogFragment {

    EditText ed;
    RadioButton rb1,rb2;
    Button b1,b2;


    public InputFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.input, container, false);
        ed = (EditText)view.findViewById(R.id.editText);
        rb1 = (RadioButton)view.findViewById(R.id.radioButton1);
        rb2 = (RadioButton)view.findViewById(R.id.radioButton2);
        b1 = (Button)view.findViewById(R.id.cancel);
        b2 = (Button)view.findViewById(R.id.confirm);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed.getText().toString().equals("")) {
                    if (rb1.isChecked()) {
                        int input = Integer.valueOf(ed.getText().toString());
                        double out = input / 24.0;
                        out = Double.parseDouble(new DecimalFormat("#.0").format(out));
                        Intent m = new Intent(getActivity().getBaseContext(), MainScreen.class);
                        m.putExtra("res", out);
                        getActivity().startActivity(m);
                    } else if (rb2.isChecked()) {
                        int input = Integer.valueOf(ed.getText().toString());
                        double out = ((input * 2 / 3) * 0.029574);
                        out = Double.parseDouble(new DecimalFormat("#.0").format(out));
                        Intent m = new Intent(getActivity().getBaseContext(), MainActivity.class);
                        m.putExtra("res", out);
                        getActivity().startActivity(m);
                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return view;
    }


}
