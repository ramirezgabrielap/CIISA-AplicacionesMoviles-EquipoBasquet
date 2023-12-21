package com.example.equipobasquet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int VALOR_PUNTO_1 = 1;
    int VALOR_PUNTO_2 = 2;
    int VALOR_PUNTO_3 = 3;

    private TextView jugador1;
    private EditText cant1p1;
    private EditText cant1p2;
    private EditText cant1p3;

    private TextView jugador2;
    private EditText cant2p1;
    private EditText cant2p2;
    private EditText cant2p3;

    private TextView jugador3;
    private EditText cant3p1;
    private EditText cant3p2;
    private EditText cant3p3;

    private TextView jugador4;
    private EditText cant4p1;
    private EditText cant4p2;
    private EditText cant4p3;

    private TextView jugador5;
    private EditText cant5p1;
    private EditText cant5p2;
    private EditText cant5p3;

    private TextView jugador6;
    private EditText cant6p1;
    private EditText cant6p2;
    private EditText cant6p3;

    private Button registrar;

    int[] player1 = new int[8];
    int[] player2 = new int[8];
    int[] player3 = new int[8];
    int[] player4 = new int[8];
    int[] player5 = new int[8];
    int[] player6 = new int[8];

    int[] jugadores = new int[6];
    int[] jugadoresP = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugador1 = findViewById(R.id.jugador1);
        cant1p1 = findViewById(R.id.cant1p1);
        cant1p2 = findViewById(R.id.cant1p2);
        cant1p3 = findViewById(R.id.cant1p3);

        jugador2 = findViewById(R.id.jugador2);
        cant2p1 = findViewById(R.id.cant2p1);
        cant2p2 = findViewById(R.id.cant2p2);
        cant2p3 = findViewById(R.id.cant2p3);

        jugador3 = findViewById(R.id.jugador3);
        cant3p1 = findViewById(R.id.cant3p1);
        cant3p2 = findViewById(R.id.cant3p2);
        cant3p3 = findViewById(R.id.cant3p3);

        jugador4 = findViewById(R.id.jugador4);
        cant4p1 = findViewById(R.id.cant4p1);
        cant4p2 = findViewById(R.id.cant4p2);
        cant4p3 = findViewById(R.id.cant4p3);

        jugador5 = findViewById(R.id.jugador5);
        cant5p1 = findViewById(R.id.cant5p1);
        cant5p2 = findViewById(R.id.cant5p2);
        cant5p3 = findViewById(R.id.cant5p3);

        jugador6 = findViewById(R.id.jugador6);
        cant6p1 = findViewById(R.id.cant6p1);
        cant6p2 = findViewById(R.id.cant6p2);
        cant6p3 = findViewById(R.id.cant6p3);

        registrar = findViewById(R.id.registrar);

    }

    public void submit(View view){
        if(this.validar(view)){
            this.setear(view);
            this.mostrar(view);
        }
    }


    private boolean validar (View view){
        // JUGADOR 1
        if(cant1p1.getText().toString().equals("") || cant1p2.getText().toString().equals("") || cant1p3.getText().toString().equals("")){
            cant1p1.setError("Ingrese todas las cantidades");
            cant1p2.setError("Ingrese todas las cantidades");
            cant1p3.setError("Ingrese todas las cantidades");
            Toast.makeText(this, "Faltan Cantidades del jugador 1!", Toast.LENGTH_SHORT).show();
            return false;
        }

        // JUGADOR 2
        if(cant2p1.getText().toString().equals("") || cant2p2.getText().toString().equals("") || cant2p3.getText().toString().equals("")){
            cant2p1.setError("Ingrese todas las cantidades");
            cant2p2.setError("Ingrese todas las cantidades");
            cant2p3.setError("Ingrese todas las cantidades");
            Toast.makeText(this, "Faltan Cantidades del jugador 2!", Toast.LENGTH_SHORT).show();
            return false;
        }
        // JUGADOR 3
        if(cant3p1.getText().toString().equals("") || cant3p2.getText().toString().equals("") || cant3p3.getText().toString().equals("")){
            cant3p1.setError("Ingrese todas las cantidades");
            cant3p2.setError("Ingrese todas las cantidades");
            cant3p3.setError("Ingrese todas las cantidades");
            Toast.makeText(this, "Faltan Cantidades del jugador 3!", Toast.LENGTH_SHORT).show();
            return false;
        }

        // JUGADOR 4
        if(cant4p1.getText().toString().equals("") || cant4p2.getText().toString().equals("") || cant4p3.getText().toString().equals("")){
            cant4p1.setError("Ingrese todas las cantidades");
            cant4p2.setError("Ingrese todas las cantidades");
            cant4p3.setError("Ingrese todas las cantidades");
            Toast.makeText(this, "Faltan Cantidades del jugador 4!", Toast.LENGTH_SHORT).show();
            return false;
        }

        // JUGADOR 5
        if(cant5p1.getText().toString().equals("") || cant5p2.getText().toString().equals("") || cant5p3.getText().toString().equals("")){
            cant5p1.setError("Ingrese todas las cantidades");
            cant5p2.setError("Ingrese todas las cantidades");
            cant5p3.setError("Ingrese todas las cantidades");
            Toast.makeText(this, "Faltan Cantidades del jugador 5!", Toast.LENGTH_SHORT).show();
            return false;
        }

        // JUGADOR 6
        if(cant6p1.getText().toString().equals("") || cant6p2.getText().toString().equals("") || cant6p3.getText().toString().equals("")){
            cant6p1.setError("Ingrese todas las cantidades");
            cant6p2.setError("Ingrese todas las cantidades");
            cant6p3.setError("Ingrese todas las cantidades");
            Toast.makeText(this, "Faltan Cantidades del jugador 6!", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    public void setear(View view){
        // CRIS
        player1[0] = Integer.parseInt(cant1p1.getText().toString());
        player1[1] = player1[0] * VALOR_PUNTO_1;
        player1[2] = Integer.parseInt(cant1p2.getText().toString());
        player1[3] = player1[2] * VALOR_PUNTO_2;
        player1[4] = Integer.parseInt(cant1p3.getText().toString());
        player1[5] = player1[4] * VALOR_PUNTO_3;

        player1[6] = player1[1] + player1[3] + player1[5]; // PUNTOS TOTALES
        player1[7] = player1[0] + player1[2] + player1[4]; // TIROS TOTALES

        // VICHO
        player2[0] = Integer.parseInt(cant2p1.getText().toString());
        player2[1] = player2[0] * VALOR_PUNTO_1;
        player2[2] = Integer.parseInt(cant2p2.getText().toString());
        player2[3] = player2[2] * VALOR_PUNTO_2;
        player2[4] = Integer.parseInt(cant2p3.getText().toString());
        player2[5] = player2[4] * VALOR_PUNTO_3;

        player2[6] = player2[1] + player2[3] + player2[5]; // PUNTOS TOTALES
        player2[7] = player2[0] + player2[2] + player2[4]; // TIROS TOTALES

        // NICO
        player3[0] = Integer.parseInt(cant3p1.getText().toString());
        player3[1] = player3[0] * VALOR_PUNTO_1;
        player3[2] = Integer.parseInt(cant3p2.getText().toString());
        player3[3] = player3[2] * VALOR_PUNTO_2;
        player3[4] = Integer.parseInt(cant3p3.getText().toString());
        player3[5] = player3[4] * VALOR_PUNTO_3;

        player3[6] = player3[1] + player3[3] + player3[5]; // PUNTOS TOTALES
        player3[7] = player3[0] + player3[2] + player3[4]; // TIROS TOTALES

        // XUXANCO
        player4[0] = Integer.parseInt(cant4p1.getText().toString());
        player4[1] = player4[0] * VALOR_PUNTO_1;
        player4[2] = Integer.parseInt(cant4p2.getText().toString());
        player4[3] = player4[2] * VALOR_PUNTO_2;
        player4[4] = Integer.parseInt(cant4p3.getText().toString());
        player4[5] = player4[4] * VALOR_PUNTO_3;

        player4[6] = player4[1] + player4[3] + player4[5]; // PUNTOS TOTALES
        player4[7] = player4[0] + player4[2] + player4[4]; // TIROS TOTALES

        // GABO
        player5[0] = Integer.parseInt(cant5p1.getText().toString());
        player5[1] = player5[0] * VALOR_PUNTO_1;
        player5[2] = Integer.parseInt(cant5p2.getText().toString());
        player5[3] = player5[2] * VALOR_PUNTO_2;
        player5[4] = Integer.parseInt(cant5p3.getText().toString());
        player5[5] = player5[4] * VALOR_PUNTO_3;

        player5[6] = player5[1] + player5[3] + player5[5]; // PUNTOS TOTALES
        player5[7] = player5[0] + player5[2] + player5[4]; // TIROS TOTALES

        // MITZIO
        player6[0] = Integer.parseInt(cant6p1.getText().toString());
        player6[1] = player6[0] * VALOR_PUNTO_1;
        player6[2] = Integer.parseInt(cant6p2.getText().toString());
        player6[3] = player6[2] * VALOR_PUNTO_2;
        player6[4] = Integer.parseInt(cant6p3.getText().toString());
        player6[5] = player6[4] * VALOR_PUNTO_3;

        player6[6] = player6[1] + player6[3] + player6[5]; // PUNTOS TOTALES
        player6[7] = player6[0] + player6[2] + player6[4]; // TIROS TOTALES

        // EQUIPO COMPLETO
        // TIROS
        jugadores[0] = player1[7];
        jugadores[1] = player2[7];
        jugadores[2] = player3[7];
        jugadores[3] = player4[7];
        jugadores[4] = player5[7];
        jugadores[5] = player6[7];

        // TIROS
        jugadoresP[0] = player1[6];
        jugadoresP[1] = player2[6];
        jugadoresP[2] = player3[6];
        jugadoresP[3] = player4[6];
        jugadoresP[4] = player5[6];
        jugadoresP[5] = player6[6];

    }


    public void mostrar(View view){
        Intent x = new Intent(MainActivity.this, Resultado.class);
        x.putExtra("Player1", player1);
        x.putExtra("Player2", player2);
        x.putExtra("Player3", player3);
        x.putExtra("Player4", player4);
        x.putExtra("Player5", player5);
        x.putExtra("Player6", player6);
        x.putExtra("jugadores", jugadores);
        x.putExtra("jugadoresP", jugadoresP);
        startActivity(x);

    }

}


