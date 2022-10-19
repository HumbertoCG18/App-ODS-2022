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
                Intent Tela2 = new Intent( getApplicationContext(), Tela2.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela2);
            }
        });

        btntela2 = findViewById(R.id.btntela2);
        //configurando o botao com a opção de click
        btntela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela3 = new Intent( getApplicationContext(), Tela3.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela3);
            }
        });

        btntela3 = findViewById(R.id.btntela3);
        //configurando o botao com a opção de click
        btntela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela4 = new Intent( getApplicationContext(), Tela4.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela4);
            }
        });

        btntela4 = findViewById(R.id.btntela4);
        //configurando o botao com a opção de click
        btntela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela5 = new Intent( getApplicationContext(), Tela5.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela5);
            }
        });

        btntela5 = findViewById(R.id.btntela5);
        //configurando o botao com a opção de click
        btntela5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela6 = new Intent( getApplicationContext(), Tela6.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela6);
            }
        });

        btntela6 = findViewById(R.id.btntela6);
        //configurando o botao com a opção de click
        btntela6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela7 = new Intent( getApplicationContext(), Tela7.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela7);
            }
        });

        btntela7 = findViewById(R.id.btntela7);
        //configurando o botao com a opção de click
        btntela7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela8 = new Intent( getApplicationContext(), Tela8.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela8);
            }
        });

        btntela8 = findViewById(R.id.btntela8);
        //configurando o botao com a opção de click
        btntela8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela9 = new Intent( getApplicationContext(), Tela9.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela9);
            }
        });

        btntela9 = findViewById(R.id.btntela9);
        //configurando o botao com a opção de click
        btntela9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela10 = new Intent( getApplicationContext(), Tela10.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela10);
            }
        });

        btntela10 = findViewById(R.id.btntela10);
        //configurando o botao com a opção de click
        btntela10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela11 = new Intent( getApplicationContext(), Tela11.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela11);
            }
        });

        btntela11 = findViewById(R.id.btntela11);
        //configurando o botao com a opção de click
        btntela11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela12 = new Intent( getApplicationContext(), Tela12.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela12);
            }
        });

        btntela12 = findViewById(R.id.btntela12);
        //configurando o botao com a opção de click
        btntela12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela13 = new Intent( getApplicationContext(), Tela13.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela13);
            }
        });

        btntela13 = findViewById(R.id.btntela13);
        //configurando o botao com a opção de click
        btntela13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela14 = new Intent( getApplicationContext(), Tela14.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela14);
            }
        });

        btntela14 = findViewById(R.id.btntela14);
        //configurando o botao com a opção de click
        btntela14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela15 = new Intent( getApplicationContext(), Tela15.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela15);
            }
        });

        btntela15 = findViewById(R.id.btntela15);
        //configurando o botao com a opção de click
        btntela15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela16 = new Intent( getApplicationContext(), Tela16.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela16);
            }
        });

        btntela16 = findViewById(R.id.btntela16);
        //configurando o botao com a opção de click
        btntela16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela17 = new Intent( getApplicationContext(), Tela17.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela17);
            }
        });

        btntela17 = findViewById(R.id.btntela17);
        //configurando o botao com a opção de click
        btntela17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
                Intent Tela18 = new Intent( getApplicationContext(), Tela18.class);
                //inicia a intent = tela2 = Activity
                startActivity(Tela18);
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
