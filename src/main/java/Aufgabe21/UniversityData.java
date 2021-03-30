package Aufgabe21;

import org.json.JSONObject;

public class UniversityData {

    private String nation;
    private Integer year;
    private Integer population;

    public UniversityData(String nation, Integer year, Integer population) {
        this.nation = nation;
        this.year = year;
        this.population = population;
    }

    public UniversityData(JSONObject jsonObject) {
        
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
