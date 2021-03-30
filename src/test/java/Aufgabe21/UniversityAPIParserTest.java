package Aufgabe21;


import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UniversityAPIParserTest {

    @Test
    public void shouldReadJsonFromURL() {
        UniversityAPIParser uniAPIParser = new UniversityAPIParser();
        String expected = "{\"data\":[{\"ID Nation\":\"01000US\",\"Nation\":\"United States\",\"ID Year\":2018,\"Year\":\"2018\",\"Population\":327167439,\"Slug Nation\":\"united-states\"},{\"ID Nation\":\"01000US\",\"Nation\":\"United States\",\"ID Year\":2017,\"Year\":\"2017\",\"Population\":325719178,\"Slug Nation\":\"united-states\"},{\"ID Nation\":\"01000US\",\"Nation\":\"United States\",\"ID Year\":2016,\"Year\":\"2016\",\"Population\":323127515,\"Slug Nation\":\"united-states\"},{\"ID Nation\":\"01000US\",\"Nation\":\"United States\",\"ID Year\":2015,\"Year\":\"2015\",\"Population\":321418821,\"Slug Nation\":\"united-states\"},{\"ID Nation\":\"01000US\",\"Nation\":\"United States\",\"ID Year\":2014,\"Year\":\"2014\",\"Population\":318857056,\"Slug Nation\":\"united-states\"},{\"ID Nation\":\"01000US\",\"Nation\":\"United States\",\"ID Year\":2013,\"Year\":\"2013\",\"Population\":316128839,\"Slug Nation\":\"united-states\"}],\"source\":[{\"measures\":[\"Population\"],\"annotations\":{\"source_name\":\"Census Bureau\",\"source_description\":\"The American Community Survey (ACS) is conducted by the US Census and sent to a portion of the population every year.\",\"dataset_name\":\"ACS 1-year Estimate\",\"dataset_link\":\"http://www.census.gov/programs-surveys/acs/\",\"table_id\":\"B01003\",\"topic\":\"Diversity\",\"subtopic\":\"Demographics\"},\"name\":\"acs_yg_total_population_1\",\"substitutions\":[]}]}";
        String result = uniAPIParser.readJsonFromUrl().toString();


        assertEquals(expected, result);
    }

    @Test
    public void shouldMapRawJsonObjsToUniDataList() {
        UniversityAPIParser uniAPIParser = new UniversityAPIParser();
        UniversityData uniData2018 = new UniversityData("United States", 2018, 327167439);
        UniversityData uniData2017 = new UniversityData("United States", 2017, 325719178);
        UniversityData uniData2016 = new UniversityData("United States", 2016, 323127515);
        UniversityData uniData2015 = new UniversityData("United States", 2015, 321418821);
        UniversityData uniData2014 = new UniversityData("United States", 2014, 318857056);
        UniversityData uniData2013 = new UniversityData("United States", 2013, 316128839);
        List<UniversityData> expected = new ArrayList<>();
        expected.add(uniData2018);
        expected.add(uniData2017);
        expected.add(uniData2016);
        expected.add(uniData2015);
        expected.add(uniData2014);
        expected.add(uniData2013);
        List<UniversityData> result = uniAPIParser.mapRawJsonObjsToUniDataList();

        if(expected.size() == result.size()) {
            for(int index = 0; index < expected.size(); index++) {
                assertEquals(expected.get(index).getNation(), result.get(index).getNation());
                assertEquals(expected.get(index).getYear(), result.get(index).getYear());
                assertEquals(expected.get(index).getPopulation(), result.get(index).getPopulation());
            }
        }
    }

    @Test
    public void shouldGetAveragePopulationCount() {
        UniversityAPIParser uniAPIParser = new UniversityAPIParser();
        Double expected = 322069808.0;
        Double result = uniAPIParser.getAveragePopulationCount();

        assertEquals(expected, result, 0.001);
    }

    @Test
    public void shouldGetUniversityDataWithMinPopulationCount() {
        UniversityAPIParser uniAPIParser = new UniversityAPIParser();
        UniversityData expected = new UniversityData("United States", 2013, 316128839);
        UniversityData result = uniAPIParser.getUniversityDataWithMinPoulationCount();

        assertEquals(expected.getNation(), result.getNation());
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getPopulation(), result.getPopulation());
    }

    @Test
    public void shouldGetUniversityDataWithMaxPopulationCount() {
        UniversityAPIParser uniAPIParser = new UniversityAPIParser();
        UniversityData expected = new UniversityData("United States", 2018, 327167439);
        UniversityData result = uniAPIParser.getUniversityDataWithMaxPoulationCount();

        assertEquals(expected.getNation(), result.getNation());
        assertEquals(expected.getYear(), result.getYear());
        assertEquals(expected.getPopulation(), result.getPopulation());
    }
}
