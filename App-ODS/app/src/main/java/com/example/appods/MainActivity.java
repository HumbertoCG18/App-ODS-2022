package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btntela,btntela2,btntela3,btntela4,btntela5,btntela6,btntela7,btntela8,btntela9,btntela10,btntela11,btntela12,btntela13,btntela14,btntela15,btntela16,btntela17, btnsair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Troca de tela
        // localizar o elemento pelo ID e atribuir os valores ao atributo
        btntela = findViewById(R.id.btntela);
        //configurando o botao com a opção de click
        btntela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent tela2 = new Intent( getApplicationContext(), Tela2Activity.class);
                //inicia a intent = tela2 = Activity
                startActivity(tela2);
            }
        });
        btntela2 = findViewById(R.id.btntela2);
        btntela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent tela3 = new Intent( getApplicationContext(), Tela3Activity.class);
            startActivity(tela3);
        }
        });
        btntela3 = findViewById(R.id.btntela3);
        btntela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela4 = new Intent( getApplicationContext(), Tela4Activity.class);
                startActivity(tela4);
            }
        });
        btntela4 = findViewById(R.id.btntela4);
        btntela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela5 = new Intent( getApplicationContext(), Tela5Activity.class);
                startActivity(tela5);
            }
        });
        btntela5 = findViewById(R.id.btntela5);
        btntela5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela6 = new Intent( getApplicationContext(), Tela6Activity.class);
                startActivity(tela6);
            }
        });
        btntela6 = findViewById(R.id.btntela6);
        btntela6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela7 = new Intent( getApplicationContext(), Tela7Activity.class);
                startActivity(tela7);
            }
        });
        btntela7 = findViewById(R.id.btntela7);
        btntela7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela8 = new Intent( getApplicationContext(), Tela8Activity.class);
                startActivity(tela8);
            }
        });
        btntela8 = findViewById(R.id.btntela8);
        btntela8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela9 = new Intent( getApplicationContext(), Tela9Activity.class);
                startActivity(tela9);
            }
        });
        btntela9 = findViewById(R.id.btntela9);
        btntela9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela10 = new Intent( getApplicationContext(), Tela10Activity.class);
                startActivity(tela10);
            }
        });
        btntela10 = findViewById(R.id.btntela10);
        btntela10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela11 = new Intent( getApplicationContext(), Tela11Activity.class);
                startActivity(tela11);
            }
        });
        btntela11 = findViewById(R.id.btntela11);
        btntela11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela12 = new Intent( getApplicationContext(), Tela12Activity.class);
                startActivity(tela12);
            }
        });
        btntela12 = findViewById(R.id.btntela12);
        btntela12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela13 = new Intent( getApplicationContext(), Tela13Activity.class);
                startActivity(tela13);
            }
        });
        btntela13 = findViewById(R.id.btntela13);
        btntela13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela14 = new Intent( getApplicationContext(), Tela14Activity.class);
                startActivity(tela14);
            }
        });
        btntela14 = findViewById(R.id.btntela14);
        btntela14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela15 = new Intent( getApplicationContext(), Tela15Activity.class);
                startActivity(tela15);
            }
        });
        btntela15 = findViewById(R.id.btntela15);
        btntela15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela16 = new Intent( getApplicationContext(), Tela16Activity.class);
                startActivity(tela16);
            }
        });
        btntela16 = findViewById(R.id.btntela16);
        btntela16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela17 = new Intent( getApplicationContext(), Tela17Activity.class);
                startActivity(tela17);
            }
        });
        btntela17 = findViewById(R.id.btntela17);
        btntela17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela18 = new Intent( getApplicationContext(), Tela18Activity.class);
                startActivity(tela18);
            }
        });

        btnsair = findViewById(R.id.btnsair);
        btnsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });
    }
}
