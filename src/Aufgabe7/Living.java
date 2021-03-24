package Aufgabe7;

//Klasse
public class Living {

    //Felder
    private boolean isLiving;
    private Double weightInKg;
    private Double heightInM;
    private Double widthInM;
    private Integer ageInY;
    private String locationInCountry;
    private String designation;

    //Konstruktor
    public Living(boolean isLiving, Double weightInKg, Double heightInM, Double widthInM, Integer ageInY, String locationInCountry, String designation) {
        this.isLiving = isLiving;
        this.weightInKg = weightInKg;
        this.heightInM = heightInM;
        this.widthInM = widthInM;
        this.ageInY = ageInY;
        this.locationInCountry = locationInCountry;
        this.designation = designation;
    }

    //Methoden
    public boolean isLiving() {
        return isLiving;
    }

    public void setLiving(boolean living) {
        isLiving = living;
    }

    public Double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(Double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public Double getHeightInM() {
        return heightInM;
    }

    public void setHeightInM(Double heightInM) {
        this.heightInM = heightInM;
    }

    public Double getWidthInM() {
        return widthInM;
    }

    public void setWidthInM(Double widthInM) {
        this.widthInM = widthInM;
    }

    public Integer getAgeInY() {
        return ageInY;
    }

    public void setAgeInY(Integer ageInY) {
        this.ageInY = ageInY;
    }

    public String getLocationInCountry() {
        return locationInCountry;
    }

    public void setLocationInCountry(String locationInCountry) {
        this.locationInCountry = locationInCountry;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
