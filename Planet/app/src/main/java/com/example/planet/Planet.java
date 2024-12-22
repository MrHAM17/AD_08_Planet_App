package com.example.planet;


// This class acts as a model to store data for each planet displayed in the list
public class Planet {

    // Attributes to hold the planet's name, number of moons, and an image resource ID
    private String planetName;
    private String moonCount;
    private int palnetImage;

    // Constructor to initialize the planet's data
    public Planet(String planetName, String moonCount, int palnetImage) {
        this.planetName = planetName;  // Initialize the planet name
        this.moonCount = moonCount;   // Initialize the moon count
        this.palnetImage = palnetImage; // Initialize the image resource ID
    }

    // Getter for planet name
    public String getPlanetName() {
        return planetName;
    }

    // Setter for planet name
    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    // Getter for moon count
    public String getMoonCount() {
        return moonCount;
    }

    // Setter for moon count
    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    // Getter for the planet image resource ID
    public int getPalnetImage() {
        return palnetImage;
    }

    // Setter for the planet image resource ID
    public void setPalnetImage(int palnetImage) {
        this.palnetImage = palnetImage;
    }
}
