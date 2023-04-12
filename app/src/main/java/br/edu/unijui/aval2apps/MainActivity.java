package br.edu.unijui.aval2apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText originTemp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        originTemp = findViewById(R.id.originTemp);
        RadioButton originCelsius = findViewById(R.id.originCelsius);

        originCelsius.setOnCheckedChangeListener(
               (__, checado) -> {
                   System.out.println("Lixo "+checado);


                }
        );
    }


    private float celsiusToKelvin(float originCelsius) {
        return 0;

    }

    private float celsiusToFarenheit(float originCelsius) {
        return 0;

    }

    private float farenheitToCelsius(float originFarenheit) {
        return 0;

    }

    private float farenheitToKelvin(float originFarenheit) {
        return 0;

    }

    private float kelvinToFarenheit(float originKelvin) {
        return 0;

    }


    private float kelvinToCelsius(float originKelvin) {
        return 0;

    }
}