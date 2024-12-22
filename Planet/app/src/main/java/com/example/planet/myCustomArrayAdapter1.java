package com.example.planet;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class myCustomArrayAdapter1 extends AppCompatActivity {


    // Declaring UI elements and data structures
    TextView textView;
    ListView myListViewForCustomArrayAdapter; // Custom ListView to display planet data
    ArrayList<Planet> planetArrayList; // Data source: List of planets
    private static myCustomArrayAdapter2 adapter; // Custom adapter to bind data to ListView


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_custom_array_adapter1);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        //  Step 1: AdapterView: here it is Custom ListView
        //          Initialize the ListView (AdapterView) from the layout
        myListViewForCustomArrayAdapter = findViewById(R.id.myListViewForCustomArrayAdapter);

        //  step 2: Prepare Data Source: here it is ArrayList<Planet>
        //          Populate the planet list with planet objects (for to store multiple entites w.r.t. every 1 data-point)
        planetArrayList = new ArrayList<>();

        Planet planetObject1 = new Planet("Earth","1 Moon",R.drawable.earth);
        Planet planetObject2 = new Planet("Mercury","0 Moons",R.drawable.mercury);
        Planet planetObject3 = new Planet("Venus", "0 Moons", R.drawable.venus);
        Planet planetObject4 = new Planet("Mars", "2 Moons", R.drawable.mars);
        Planet planetObject5 = new Planet("Jupiter", "79 Moons", R.drawable.jupiter);
        Planet planetObject6 = new Planet("Saturn", "83 Moons", R.drawable.saturn);
        Planet planetObject7 = new Planet("Uranus", "27 Moons", R.drawable.uranus);
        Planet planetObject8 = new Planet("Neptune", "14 Moons", R.drawable.neptune);

        planetArrayList.add(planetObject1);
        planetArrayList.add(planetObject2);
        planetArrayList.add(planetObject3);
        planetArrayList.add(planetObject4);
        planetArrayList.add(planetObject5);
        planetArrayList.add(planetObject6);
        planetArrayList.add(planetObject7);
        planetArrayList.add(planetObject8);

        // step 3: Adapter
        //         Create an instance of the custom adapter
        adapter = new myCustomArrayAdapter2(planetArrayList, getApplicationContext());

        // Step 4: Set the adapter to the ListView
        myListViewForCustomArrayAdapter.setAdapter(adapter);

        // Step 5: Handle item click events for the ListView
        myListViewForCustomArrayAdapter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(myCustomArrayAdapter1.this,
                        "Planet Name: "+adapter.getItem(position).getPlanetName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}