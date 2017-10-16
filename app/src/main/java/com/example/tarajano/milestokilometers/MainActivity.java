package com.example.tarajano.milestokilometers;

import java.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convertMiToKm = (Button) findViewById(R.id.buttonConvertMiToKm);
        Button convertKmToMi = (Button) findViewById(R.id.buttonConvertKmToMi);

        // Miles to Kilometers
        convertMiToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EditText editTextMi = (EditText) findViewById(R.id.editTextMi);
                EditText editTextKm = (EditText) findViewById(R.id.editTextKm);
                double valueMi = Double.valueOf(editTextMi.getText().toString());
                double valueKm = valueMi / .62137;
                DecimalFormat decimalNumber = new DecimalFormat("##.##");
                editTextKm.setText(decimalNumber.format(valueKm).toString());
            }
        });

        // Kilometers to Miles
        convertKmToMi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    EditText editTextMi = (EditText) findViewById(R.id.editTextMi);
                    EditText editTextKm = (EditText) findViewById(R.id.editTextKm);
                    double valueKm = Double.valueOf(editTextKm.getText().toString());
                    double valueMi = valueKm * .62137;
                    DecimalFormat decimalNumber = new DecimalFormat("##.##");
                    editTextMi.setText(decimalNumber.format(valueMi).toString());
                }
            });
    }
}
