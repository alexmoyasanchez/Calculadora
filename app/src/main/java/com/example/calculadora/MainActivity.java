package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    boolean coseno = false;
    boolean seno = false;
    Double[] numero = new Double[20];
    Double dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.ceroButton);
        button0.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.unoButton);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.dosButton);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.tresButton);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.cuatroButton);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.cincoButton);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.seisButton);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.sieteButton);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.ochoButton);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.nueveButton);
        button9.setOnClickListener(this);
        Button buttonPunto = (Button) findViewById(R.id.puntoButton);
        buttonPunto.setOnClickListener(this);

        Button buttonSuma = (Button) findViewById(R.id.sumaButton);
        buttonSuma.setOnClickListener(this);
        Button buttonResta = (Button) findViewById(R.id.restaButton);
        buttonResta.setOnClickListener(this);
        Button buttonMultiplicar = (Button) findViewById(R.id.multiplicarButton);
        buttonMultiplicar.setOnClickListener(this);
        Button buttonDividir = (Button) findViewById(R.id.dividirButton);
        buttonDividir.setOnClickListener(this);
        Button buttonSeno = (Button) findViewById(R.id.senButton);
        buttonSeno.setOnClickListener(this);
        Button buttonCoseno = (Button) findViewById(R.id.cosButton);
        buttonCoseno.setOnClickListener(this);
        Button buttonIgual = (Button) findViewById(R.id.igualButton);
        buttonIgual.setOnClickListener(this);
        Button buttonClear = (Button) findViewById(R.id.clearButton);
        buttonClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        TextView pantalla = (TextView) findViewById(R.id.resultadoTextView);
        int selector = v.getId();
        String x = pantalla.getText().toString();

        try {
            switch (selector) {
                case R.id.ceroButton:
                    pantalla.setText(x + "0");
                    break;
                case R.id.unoButton:
                    pantalla.setText(x + "1");
                    break;
                case R.id.dosButton:
                    pantalla.setText(x + "2");
                    break;
                case R.id.tresButton:
                    pantalla.setText(x + "3");
                    break;
                case R.id.cuatroButton:
                    pantalla.setText(x + "4");
                    break;
                case R.id.cincoButton:
                    pantalla.setText(x + "5");
                    break;
                case R.id.seisButton:
                    pantalla.setText(x + "6");
                    break;
                case R.id.sieteButton:
                    pantalla.setText(x + "7");
                    break;
                case R.id.ochoButton:
                    pantalla.setText(x + "8");
                    break;
                case R.id.nueveButton:
                    pantalla.setText(x + "9");
                    break;
                case R.id.puntoButton:
                    if (decimal == false) {
                        pantalla.setText(x + ".");
                        decimal = true;
                    } else return;
                    break;
                case R.id.clearButton:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.sumaButton:
                    suma = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.restaButton:
                    resta = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.multiplicarButton:
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.dividirButton:
                    division = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.senButton:
                    seno=true;
                    numero[0]=Double.parseDouble(x);
                    pantalla.setText("");
                    dato=Math.sin(numero[0]*Math.PI/180);
                    pantalla.setText(String.valueOf(dato));
                    decimal = false;
                    break;
                case R.id.cosButton:
                    coseno = true;
                    numero[0]=Double.parseDouble(x);
                    pantalla.setText("");
                    dato=Math.cos(numero[0]*Math.PI/180);
                    pantalla.setText(String.valueOf(dato));
                    decimal=false;
                    break;
                case R.id.igualButton:
                    numero[1] = Double.parseDouble(x);
                    if (suma == true) {
                        dato = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(dato));
                    } else if (resta == true) {
                        dato = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(dato));
                    } else if (multiplicacion == true) {
                        dato = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(dato));
                    } else if (division == true) {
                        dato = numero[0] / numero[1];
                        pantalla.setText(String.valueOf(dato));
                    }
                    decimal = false;
                    suma = false;
                    division = false;
                    multiplicacion = false;
                    resta = false;
                    break;
            }


        } catch (Exception e) {
            pantalla.setText("Error");
        }

    }
}