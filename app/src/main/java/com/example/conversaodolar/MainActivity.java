package com.example.conversaodolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button buttonCalcular;
Button buttonCalcular2;
EditText editTextDolar;
EditText editTextReal;
TextView textViewResultado;
TextView textViewResultado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular2 = findViewById(R.id.buttonCalcular2);
        editTextDolar = findViewById(R.id.editTextDolar);
        editTextReal = findViewById(R.id.editTextReal);
        textViewResultado = findViewById(R.id.textViewResultado);
        textViewResultado2 = findViewById(R.id.textViewResultado2);

  buttonCalcular2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          double valor1 = Double.parseDouble(editTextDolar.getText().toString());
          double Resultado = (valor1 * 5);
          textViewResultado.setText(String.valueOf(Resultado));
      }
  });
  buttonCalcular.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          double valor2 = Double.parseDouble(editTextReal.getText().toString());
          double Resultado2 = (valor2 / 5);
          textViewResultado2.setText(String.valueOf(Resultado2));
      }
  });

    }
}