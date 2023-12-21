package com.example.equipobasquet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {

    private EditText view1_1;
    private EditText view1_2;
    private EditText view1_3;
    private EditText total1view1;
    private EditText total1view2;
    private EditText total1view3;
    private EditText resultview1;

    private EditText view2_1;
    private EditText view2_2;
    private EditText view2_3;
    private EditText total2view1;
    private EditText total2view2;
    private EditText total2view3;
    private EditText resultview2;

    private EditText view3_1;
    private EditText view3_2;
    private EditText view3_3;
    private EditText total3view1;
    private EditText total3view2;
    private EditText total3view3;
    private EditText resultview3;

    private EditText view4_1;
    private EditText view4_2;
    private EditText view4_3;
    private EditText total4view1;
    private EditText total4view2;
    private EditText total4view3;
    private EditText resultview4;

    private EditText view5_1;
    private EditText view5_2;
    private EditText view5_3;
    private EditText total5view1;
    private EditText total5view2;
    private EditText total5view3;
    private EditText resultview5;

    private EditText view6_1;
    private EditText view6_2;
    private EditText view6_3;
    private EditText total6view1;
    private EditText total6view2;
    private EditText total6view3;
    private EditText resultview6;


    private TextView masTiros;
    private TextView masPuntos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        view1_1 = findViewById(R.id.view1_1);
        view1_2 = findViewById(R.id.view1_2);
        view1_3 = findViewById(R.id.view1_3);
        total1view1 = findViewById(R.id.total1view1);
        total1view2 = findViewById(R.id.total1view2);
        total1view3 = findViewById(R.id.total1view3);
        resultview1 = findViewById(R.id.resultview1);

        view2_1 = findViewById(R.id.view2_1);
        view2_2 = findViewById(R.id.view2_2);
        view2_3 = findViewById(R.id.view2_3);
        total2view1 = findViewById(R.id.total2view1);
        total2view2 = findViewById(R.id.total2view2);
        total2view3 = findViewById(R.id.total2view3);
        resultview2 = findViewById(R.id.resultview2);

        view3_1 = findViewById(R.id.view3_1);
        view3_2 = findViewById(R.id.view3_2);
        view3_3 = findViewById(R.id.view3_3);
        total3view1 = findViewById(R.id.total3view1);
        total3view2 = findViewById(R.id.total3view2);
        total3view3 = findViewById(R.id.total3view3);
        resultview3 = findViewById(R.id.resultview3);

        view4_1 = findViewById(R.id.view4_1);
        view4_2 = findViewById(R.id.view4_2);
        view4_3 = findViewById(R.id.view4_3);
        total4view1 = findViewById(R.id.total4view1);
        total4view2 = findViewById(R.id.total4view2);
        total4view3 = findViewById(R.id.total4view3);
        resultview4 = findViewById(R.id.resultview4);

        view5_1 = findViewById(R.id.view5_1);
        view5_2 = findViewById(R.id.view5_2);
        view5_3 = findViewById(R.id.view5_3);
        total5view1 = findViewById(R.id.total5view1);
        total5view2 = findViewById(R.id.total5view2);
        total5view3 = findViewById(R.id.total5view3);
        resultview5 = findViewById(R.id.resultview5);

        view6_1 = findViewById(R.id.view6_1);
        view6_2 = findViewById(R.id.view6_2);
        view6_3 = findViewById(R.id.view6_3);
        total6view1 = findViewById(R.id.total6view1);
        total6view2 = findViewById(R.id.total6view2);
        total6view3 = findViewById(R.id.total6view3);
        resultview6 = findViewById(R.id.resultview6);

        masTiros = findViewById(R.id.masTiros);
        masPuntos = findViewById(R.id.masPuntos);


        Toast.makeText(this, "Redoble de tambores...", Toast.LENGTH_SHORT).show();

        int[] player1 = getIntent().getExtras().getIntArray("Player1");
        int[] player2 = getIntent().getExtras().getIntArray("Player2");
        int[] player3 = getIntent().getExtras().getIntArray("Player3");
        int[] player4 = getIntent().getExtras().getIntArray("Player4");
        int[] player5 = getIntent().getExtras().getIntArray("Player5");
        int[] player6 = getIntent().getExtras().getIntArray("Player6");
        int[] jugadores = getIntent().getExtras().getIntArray("jugadores");
        int[] jugadoresP = getIntent().getExtras().getIntArray("jugadoresP");


        for(int i=0; i<player1.length; i++){
            Log.d("Totalcito", "total final: " + String.valueOf(player1[i]));
        }

        // PINTAR INFO PLAYER 1
        view1_1.setText(String.valueOf(player1[0]));
        total1view1.setText(String.valueOf(player1[1]));
        view1_2.setText(String.valueOf(player1[2]));
        total1view2.setText(String.valueOf(player1[3]));
        view1_3.setText(String.valueOf(player1[4]));
        total1view3.setText(String.valueOf(player1[5]));
        resultview1.setText(String.valueOf(player1[6]));

        // PINTAR INFO PLAYER 2
        view2_1.setText(String.valueOf(player2[0]));
        total2view1.setText(String.valueOf(player2[1]));
        view2_2.setText(String.valueOf(player2[2]));
        total2view2.setText(String.valueOf(player2[3]));
        view2_3.setText(String.valueOf(player2[4]));
        total2view3.setText(String.valueOf(player2[5]));
        resultview2.setText(String.valueOf(player2[6]));

        // PINTAR INFO PLAYER 3
        view3_1.setText(String.valueOf(player3[0]));
        total3view1.setText(String.valueOf(player3[1]));
        view3_2.setText(String.valueOf(player3[2]));
        total3view2.setText(String.valueOf(player3[3]));
        view3_3.setText(String.valueOf(player3[4]));
        total3view3.setText(String.valueOf(player3[5]));
        resultview3.setText(String.valueOf(player3[6]));

        // PINTAR INFO PLAYER 4
        view4_1.setText(String.valueOf(player4[0]));
        total4view1.setText(String.valueOf(player4[1]));
        view4_2.setText(String.valueOf(player4[2]));
        total4view2.setText(String.valueOf(player4[3]));
        view4_3.setText(String.valueOf(player4[4]));
        total4view3.setText(String.valueOf(player4[5]));
        resultview4.setText(String.valueOf(player4[6]));

        // PINTAR INFO PLAYER 5
        view5_1.setText(String.valueOf(player5[0]));
        total5view1.setText(String.valueOf(player5[1]));
        view5_2.setText(String.valueOf(player5[2]));
        total5view2.setText(String.valueOf(player5[3]));
        view5_3.setText(String.valueOf(player5[4]));
        total5view3.setText(String.valueOf(player5[5]));
        resultview5.setText(String.valueOf(player5[6]));

        // PINTAR INFO PLAYER 6
        view6_1.setText(String.valueOf(player6[0]));
        total6view1.setText(String.valueOf(player6[1]));
        view6_2.setText(String.valueOf(player6[2]));
        total6view2.setText(String.valueOf(player6[3]));
        view6_3.setText(String.valueOf(player6[4]));
        total6view3.setText(String.valueOf(player6[5]));
        resultview6.setText(String.valueOf(player6[6]));


        // PINTAR INFO CON LOS MEJORES
        //  TIROS
        int indiceDelMayor = 0;
        for(int i=1; i<jugadores.length; i++){
            if(jugadores[i]>jugadores[indiceDelMayor]){
                indiceDelMayor = i;
            }
        }
        int mayor = jugadores[indiceDelMayor];
        if(mayor == jugadores[0]){
            masTiros.setText(String.valueOf("Cristobal Santis"));
        }
        if(mayor == jugadores[1]){
            masTiros.setText(String.valueOf("Vicente Rodríquez"));
        }
        if(mayor == jugadores[2]){
            masTiros.setText(String.valueOf("Nicolás Rojas"));
        }
        if(mayor == jugadores[3]){
            masTiros.setText(String.valueOf("Joaquín Escobar"));
        }
        if(mayor == jugadores[4]){
            masTiros.setText(String.valueOf("Gabriel Rojas"));
        }
        if(mayor == jugadores[5]){
            masTiros.setText(String.valueOf("Mitzio Saavedra"));
        }


        // PUNTOS
        int indiceDelMejor = 0;
        for(int i=1; i<jugadoresP.length; i++){
            if(jugadoresP[i]>jugadoresP[indiceDelMejor]){
                indiceDelMejor = i;
            }
        }
        int mayorcito = jugadoresP[indiceDelMejor];
        if(mayorcito == jugadoresP[0]){
            masPuntos.setText(String.valueOf("Cristobal Santis"));
        }
        if(mayorcito == jugadoresP[1]){
            masPuntos.setText(String.valueOf("Vicente Rodríquez"));
        }
        if(mayorcito == jugadoresP[2]){
            masPuntos.setText(String.valueOf("Nicolás Rojas"));
        }
        if(mayorcito == jugadoresP[3]){
            masPuntos.setText(String.valueOf("Joaquín Escobar"));
        }
        if(mayorcito == jugadoresP[4]){
            masPuntos.setText(String.valueOf("Gabriel Rojas"));
        }
        if(mayorcito == jugadoresP[5]){
            masPuntos.setText(String.valueOf("Mitzio Saavedra"));
        }


    }
}