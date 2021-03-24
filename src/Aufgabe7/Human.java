package Aufgabe7;

// Klasse
public class Human {

	// Felder
	private int iq;
	private String name;
	private int ageInYears;

	// Konstruktor
	public Human(int iq, String name, int ageInYears) {
		this.iq = iq;
		this.name = name;
		this.ageInYears = ageInYears;
	}

	// Methode (Getter)
	public int getIq() {
		return iq;
	}

	// Methode (Setter)
	public void setIq(int iq) {
		this.iq = iq;
	}

	// Methode (Getter)
	public String getName() {
		return name;
	}

	// Methode (Setter)
	public void setName(String name) {
		this.name = name;
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
