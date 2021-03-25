package Aufgabe7;

// Klasse
public class Human {

	// Felder
	private Integer iq;
	private String name;
	private Integer ageInYears;

	// Konstruktor
	public Human(Integer iq, String name, Integer ageInYears) {
		this.iq = iq;
		this.name = name;
		this.ageInYears = ageInYears;
	}

	// Methode (Getter)
	public Integer getIq() {
		return iq;
	}

	// Methode (Setter)
	public void setIq(Integer iq) {
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
	public Integer getAgeInYears() {
		return ageInYears;
	}

	// Methode (Setter)
	public void setAgeInYears(Integer ageInYears) {
		this.ageInYears = ageInYears;
	}

}
