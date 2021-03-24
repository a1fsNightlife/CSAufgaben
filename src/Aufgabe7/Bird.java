package Aufgabe7;

import java.util.ArrayList;
import java.util.List;

// Klasse
public class Bird {

	// Felder
	private boolean isAlive;
	private boolean canFly;
	private final List<Egg> eggs;

	// Konstruktor
	public Bird(boolean isAlive, boolean canFly) {
		this.isAlive = isAlive;
		this.canFly = canFly;
		this.eggs = new ArrayList<>();
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
	public boolean canFly() {
		return canFly;
	}

	// Methode (Setter)
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	// Methode (Getter)
	public List<Egg> getEggs() {
		return eggs;
	}

}
