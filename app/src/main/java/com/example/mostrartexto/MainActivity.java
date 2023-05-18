package com.example.mostrartexto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView Texto;
    EditText NombreUsuario;
    Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Texto = findViewById(R.id.frase_textview);
        NombreUsuario = findViewById(R.id.frase_edittext);
        Boton = findViewById(R.id.boton_saludar);

        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = NombreUsuario.getText().toString();
                Texto.setText("Hola " + name);
            }
        });
    }
}
