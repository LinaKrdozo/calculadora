package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textViewResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultado);
        /*textViewResultado.setText("hola mundo");*/
    }

    public void escribirSiete(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("7");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "7");
        }
    }

    public void escribirOcho(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("8");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "8");
        }
    }

    public void escribirNueve(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("9");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "9");
        }
    }

    public void escribirCuatro(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("4");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "4");
        }
    }

    public void escribirCinco(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("5");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "5");
        }
    }

    public void escribirSeis(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("6");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "6");
        }
    }

    public void escribirUno(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("1");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "1");
        }
    }

    public void escribirDos(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("2");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "2");
        }
    }

    public void escribirTres(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("3");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "3");
        }
    }

    public void escribirCero(View view) {
        float valor = Float.parseFloat(textViewResultado.getText().toString());
        if (valor == 0.0f){
            textViewResultado.setText("0");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "0");
        }
    }

    public void escribirPunto(View view) {
        if( !String.valueOf(textViewResultado.getText()).contains(".") ){
            textViewResultado.setText(textViewResultado.getText() + ".");
        }
    }

    public void limpiarResultado(View view) {
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion="";
        textViewResultado.setText("0");
    }

    public void dividir(View view) {
        numero1 = Float.parseFloat(textViewResultado.getText().toString());
        operacion = "/";
        textViewResultado.setText("0");

    }

    public void multiplicar(View view) {
        numero1 = Float.parseFloat(String.valueOf(textViewResultado.getText()));
        operacion = "*";
        textViewResultado.setText("0");
    }

    public void resta(View view) {
        numero1 = Float.parseFloat(String.valueOf(textViewResultado.getText()));
        operacion = "-";
        textViewResultado.setText("0");
    }

    public void suma(View view) {
        numero1 = Float.parseFloat(String.valueOf(textViewResultado.getText()));
        operacion = "+";
        textViewResultado.setText("0");
    }


    public void mostrarResultado(View view) {
        numero2 = Float.parseFloat(String.valueOf(textViewResultado.getText()));
        float result = 0.0f;

        if(operacion.equals("/")){
            if(numero2 != 0.0f){
                result = numero1 / numero2;
            }else{
                result = 0.0f;
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }
        }else if(operacion.equals("*")){
            result = numero1 * numero2;
        }else if(operacion.equals("-")){
            result = numero1 - numero2;
        }else if(operacion.equals("+")){
            result = numero1 + numero2;
        }
        textViewResultado.setText(result + "");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

      }


}
