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
                EditText textBoxMiles = (EditText) findViewById(R.id.textMiles);
                EditText textBoxKilometers = (EditText) findViewById(R.id.textKilometers);
                double valueMiles = Double.valueOf(textBoxMiles.getText().toString());
                double valueKilometers = valueMiles / .62137;
                DecimalFormat decimalNumber = new DecimalFormat("##.##");
                textBoxKilometers.setText(decimalNumber.format(valueKilometers).toString());
            }
        });


        // Kilometers to Miles
        convertKmToMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EditText textBoxMiles = (EditText) findViewById(R.id.textMiles);
                EditText textBoxKilometers = (EditText) findViewById(R.id.textKilometers);
                double valueKilometers = Double.valueOf(textBoxKilometers.getText().toString());
                double valueMiles = valueKilometers * .62137;
                DecimalFormat decimalNumber = new DecimalFormat("##.##");
                textBoxMiles.setText(decimalNumber.format(valueMiles).toString());
            }
        });
    }
}
