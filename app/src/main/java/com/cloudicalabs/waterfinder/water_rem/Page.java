package com.cloudicalabs.waterfinder.water_rem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Page extends Activity {

    EditText ed;
    RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page);
        ed = (EditText)findViewById(R.id.editText);
        rb1 = (RadioButton)findViewById(R.id.radioButton1);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);

        TextView tv = (TextView) findViewById(R.id.next);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed.getText().toString().equals("")) {
                    if (rb1.isChecked()) {
                        int input = Integer.valueOf(ed.getText().toString());
                        double out = input / 24.0;
                        out = Double.parseDouble(new DecimalFormat("#.0").format(out));
                        Intent m = new Intent(Page.this, MainActivity.class);
                        m.putExtra("res", out);
                        startActivity(m);
                    } else if (rb2.isChecked()) {
                        int input = Integer.valueOf(ed.getText().toString());
                        double out = ((input * 2 / 3) * 0.029574);
                        out = Double.parseDouble(new DecimalFormat("#.0").format(out));
                        Intent m = new Intent(Page.this, MainActivity.class);
                        m.putExtra("res", out);
                        startActivity(m);
                    }
                }

            }
        });

    }
}

