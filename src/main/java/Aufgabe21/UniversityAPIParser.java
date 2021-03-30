package Aufgabe21;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class UniversityAPIParser {

    public StringBuilder readJsonFromUrl() {
        StringBuilder stringBuilder = null;
        URL url;
        URLConnection urlCon;
        try {
            url = new URL("https://datausa.io/api/data?drilldowns=Nation&measures=Population");
            urlCon = url.openConnection();
            BufferedReader in = null;

            in = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
            String inputLine;
            stringBuilder = new StringBuilder();

            while((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder;
    }

    public JSONObject readJsonFromUrlToJsonObj() {
        JSONObject json = null;
        URL url;
        URLConnection urlCon;
        BufferedReader in;
        try {
            url = new URL("https://datausa.io/api/data?drilldowns=Nation&measures=Population");
            urlCon = url.openConnection();
            in = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));

            json = new JSONObject(in.readLine());

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public List<UniversityData> mapRawJsonObjsToUniDataList() {
        List<UniversityData> result = new ArrayList<>();
        JSONObject json = readJsonFromUrlToJsonObj();
        JSONArray dataArray = json.getJSONArray("data");
        UniversityData parsedData;
        for(int dataIndex = 0; dataIndex < dataArray.length(); dataIndex++) {
            JSONObject data = dataArray.getJSONObject(dataIndex);
            String nation = data.getString("Nation");
            Integer year = data.getInt("Year");
            Integer population = data.getInt("Population");
            parsedData = new UniversityData(nation, year, population);
            result.add(parsedData);
        }
        return result;
    }

    public Double getAveragePopulationCount() {
        Double result = 0.0;
        List<UniversityData> uniDataList = mapRawJsonObjsToUniDataList();
        List<Integer> population = new ArrayList<>();
        for(UniversityData uniData : uniDataList) {
            population.add(uniData.getPopulation());
        }
        IntSummaryStatistics stats = population.stream().mapToInt((x) -> x).summaryStatistics();
        result = stats.getAverage();

        return result;
    }

    public UniversityData getUniversityDataWithMinPoulationCount() {
        UniversityData result;
        List<UniversityData> uniDataList = mapRawJsonObjsToUniDataList();
        List<Integer> population = new ArrayList<>();
        for(UniversityData uniData : uniDataList) {
            population.add(uniData.getPopulation());
        }
        IntSummaryStatistics stats = population.stream().mapToInt((x) -> x).summaryStatistics();
        Integer min = stats.getMin();
        Optional<UniversityData> couldBeMinPopUni = uniDataList.stream().filter(u -> u.getPopulation().equals(min)).findFirst();
        result = couldBeMinPopUni.get();
        return result;
    }

    public UniversityData getUniversityDataWithMaxPoulationCount() {
        UniversityData result;
        List<UniversityData> uniDataList = mapRawJsonObjsToUniDataList();
        List<Integer> population = new ArrayList<>();
        for(UniversityData uniData : uniDataList) {
            population.add(uniData.getPopulation());
        }
        IntSummaryStatistics stats = population.stream().mapToInt((x) -> x).summaryStatistics();
        Integer max = stats.getMax();
        Optional<UniversityData> couldBeMinPopUni = uniDataList.stream().filter(u -> u.getPopulation().equals(max)).findFirst();
        result = couldBeMinPopUni.get();
        return result;
    }
}
