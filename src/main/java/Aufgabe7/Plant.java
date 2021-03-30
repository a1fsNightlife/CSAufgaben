package Aufgabe7;

//Klasse
public class Plant {

    //Felder
    private boolean isAbleToMove;
    private String nutritionType;

    //Konstruktor
    public Plant(boolean isAbleToMove, String nutritionType) {
        this.isAbleToMove = isAbleToMove;
        this.nutritionType = nutritionType;
    }

    //Methoden
    public boolean isAbleToMove() {
        return isAbleToMove;
    }

    public void setAbleToMove(boolean ableToMove) {
        isAbleToMove = ableToMove;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public void setNutritionType(String nutritionType) {
        this.nutritionType = nutritionType;
    }
}
