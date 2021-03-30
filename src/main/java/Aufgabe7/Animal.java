package Aufgabe7;

// Klasse
public class Animal {

	// Felder
	private boolean isAlive;
	private int ageInYears;

	// Konstruktor
	public Animal(boolean isAlive, int ageInYears) {
		this.isAlive = isAlive;
		this.ageInYears = ageInYears;
	}

	// Methode (Getter)
	public boolean isAlive() {
		return isAlive;
	}

	// Methode (Setter)
	public void setAlive(boolean alive) {
		isAlive = alive;
	}

	// Methode (Getter)
	public int getAgeInYears() {
		return ageInYears;
	}

	// Methode (Setter)
	public void setAgeInYears(int ageInYears) {
		this.ageInYears = ageInYears;
	}

}
