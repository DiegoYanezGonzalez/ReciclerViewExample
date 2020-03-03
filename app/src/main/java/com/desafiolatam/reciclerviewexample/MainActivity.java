package com.desafiolatam.reciclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import com.desafiolatam.reciclerviewexample.model.AnimalPojo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    //DECLARAR UNA VARIABLE (PARA MAS ADELANTE INSTANCIAR PARA PODER UTILIZAR)
    private RecyclerView recyclerView;
    private AnimalAdapters mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asignando un espacio en memoria con el layoaut
        recyclerView = findViewById(R.id.recyclerView);
        //creando variable
//darle vida al adaptador con el metodo (initialiteAnimals) donde reciben los datos
        mAdapter = new AnimalAdapters(initializeAnimals(),this);
//setiarle al recycler view el adaptador
        recyclerView.setAdapter(mAdapter);
        //
        recyclerView.setHasFixedSize(true);
        //
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

    private List<AnimalPojo> initializeAnimals(){
        AnimalPojo animal1 = new AnimalPojo ("https://images.unsplash.com/photo-1521651201144-634f700b36ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80", "Elefante");
        AnimalPojo animal2 = new AnimalPojo ("https://images.unsplash.com/photo-1444464666168-49d633b86797?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1049&q=80", "Pajaro");
        AnimalPojo animal3 = new AnimalPojo ("https://images.unsplash.com/photo-1456926631375-92c8ce872def?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","Leopardo");
        AnimalPojo animal4 = new AnimalPojo("https://images.unsplash.com/photo-1500479694472-551d1fb6258d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","Zorro");
        AnimalPojo animal5 = new AnimalPojo("https://images.unsplash.com/photo-1460999158988-6f0380f81f4d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60","Caballos");
        AnimalPojo animal6 = new AnimalPojo("https://images.unsplash.com/photo-1504208434309-cb69f4fe52b0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","Lobo");
        AnimalPojo animal7 = new AnimalPojo("https://images.unsplash.com/photo-1493916665398-143bdeabe500?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80","Perro");
        AnimalPojo animal8 = new AnimalPojo("https://images.unsplash.com/photo-1484406566174-9da000fda645?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=635&q=80","Branufels");
        AnimalPojo animal9 = new AnimalPojo("https://images.unsplash.com/photo-1463852247062-1bbca38f7805?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1055&q=80", "Gorila");
        List<AnimalPojo> animalPojoList = new ArrayList<AnimalPojo>();
        animalPojoList.add(animal1);
        animalPojoList.add(animal2);
        animalPojoList.add(animal3);
        animalPojoList.add(animal4);
        animalPojoList.add(animal5);
        animalPojoList.add(animal6);
        animalPojoList.add(animal7);
        animalPojoList.add(animal8);
        animalPojoList.add(animal9);
        return animalPojoList;
    }
}
