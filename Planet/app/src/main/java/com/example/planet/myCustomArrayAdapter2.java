package com.example.planet;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;

// Custom ArrayAdapter to handle displaying Planet objects in a ListView
public class myCustomArrayAdapter2 extends ArrayAdapter<Planet> {

    // Using Custom Layouts --> myCustomArrayAdapter2
    // Usint Custom Objects --> extends ArrayAdapter<Planet>

    // Attributes to hold the data source and context
    private ArrayList<Planet> planetArrayList; // Data source: List of planets
    Context context;


    // Constructor
    // Constructor to initialize the custom adapter

    public myCustomArrayAdapter2(ArrayList<Planet> planetArrayList, Context context) {
        super(context, R.layout.my_custom_multiple_data_view_for_list_data_for_custom_array_adapter, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    // View Holder Class: Used to cache references to the views within an item layout,
    //                    so that they don't need to be repeatedly looked up during scrolling
    // ViewHolder class to optimize view handling within the adapter

    public static class ViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImage;
    }


    // Override getView():used to create and return a custom view for each list item
    //                    (used to  create and return a view for a specific item in the list.)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Step 1: Get/Retrieve the planet object for the current position
        Planet planet = getItem(position);

        // step 2: Inflate Layout
        //         (Declare a ViewHolder for caching views)
        ViewHolder holder;
        final View result;

        // Step 3: Check if the view can be reused or needs to be inflated
        if(convertView==null){
            // Initialize the ViewHolder
            holder = new ViewHolder() ;

            // Inflate the custom layout for the list item

//            convertView = LayoutInflater.from(context).inflate(R.layout.my_custom_multiple_data_view_for_list_data_for_custom_array_adapter, parent,false);
            //   Note: Above line is also works same instead of below 5 lines.
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.my_custom_multiple_data_view_for_list_data_for_custom_array_adapter,
                    parent,false
            );

            // Finding Views:                     --> Told in course
            // (Bind the views to the ViewHolder) --> Given by GPT

            holder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            holder.moonCount = (TextView) convertView.findViewById(R.id.moon_count);
            holder.planetImage = (ImageView) convertView.findViewById(R.id.planet_image);

            result = convertView;

            // Cache the ViewHolder in the convertView's tag
            convertView.setTag(holder);
        } else{
            // Reuse the ViewHolder if it already exists
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        // Getting the data from model class (Planet)                          --> Told in course
        // Step 4: Set the data from the planet object to the respective views --> By GPT
        holder.planetName.setText(planet.getPlanetName());
        holder.moonCount.setText(planet.getMoonCount());
        holder.planetImage.setImageResource(planet.getPalnetImage());

        // Step 5: Return the populated view
        return result;
    }
}
