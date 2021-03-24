package Aufgabe7;

//Klasse
public class Plant {

    //Felder
    private boolean isAbleToMove;
    private String nutrition;

    //Konstruktor
    public Plant(boolean isAbleToMove, String nutrition) {
        this.isAbleToMove = isAbleToMove;
        this.nutrition = nutrition;
    }

    //Methoden
    public boolean isAbleToMove() {
        return isAbleToMove;
    }

    public void setAbleToMove(boolean ableToMove) {
        isAbleToMove = ableToMove;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }
}
