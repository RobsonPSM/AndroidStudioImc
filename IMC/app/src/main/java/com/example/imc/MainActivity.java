package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
    }

    public void imc(View view){
        float m = Float.parseFloat(editPeso.getText().toString());
        float h = Float.parseFloat(editPeso.getText().toString());
        float cimc = m/(h*h);
        if(cimc >= 18.5 && cimc <= 24.99){
            textResultado.setText("IMC = " + cimc + "! Peso normal!");
        } else if (cimc >= 25 && cimc <= 29.99) {
            textResultado.setText("IMC = " + cimc + "! Acima do peso!");
        } else if (cimc >= 30 && cimc < 34.99) {
            textResultado.setText("IMC = " + cimc + "! Obesidade Grau 1!");
        } else if (cimc >= 35 && cimc < 39.99) {
            textResultado.setText("IMC = " + cimc + "! Obesidade Grau 2(Severa)!");
        } else if (cimc >=40) {
            textResultado.setText("IMC = " + cimc + "! Obesidade Grau 3(Mórbida)!");
        }
    }

}