package Test.Aufgabe20;

import Aufgabe20.CSVParser;
import org.junit.Test;
import static org.junit.Assert.*;

public class CSVParserTest {

    @Test
    public void shouldCheckIfCSVEntityIsSet() {
        CSVParser csvParser = new CSVParser(NotParsableObject.class);
        NotParsableObject frank = new NotParsableObject(5, "Frank", 40);
        Boolean result = csvParser.checkIfParsable(frank);

        assertFalse(result);
    }

    @Test
    public void shouldCheckIfCSVFieldIsSet() {
        CSVParser csvParser = new CSVParser(NotParsableObject.class);
        NotParsableObject jens = new NotParsableObject(6, "Jens", 38);
        Boolean result = csvParser.checkIfParsable(jens);

        assertFalse(result);
    }

    @Test
    public void shouldCheckIfParsable() {
        CSVParser csvParser = new CSVParser(ParsableObject.class);
        ParsableObject hans = new ParsableObject(4, "Hans", 25);
        Boolean result = csvParser.checkIfParsable(hans);

        assertTrue(result);
    }

    @Test
    public void shouldParseCSVHeader() {
        CSVParser csvParser = new CSVParser(ParsableObject.class);
        String expected = "id,name,age";
        String result = csvParser.parseToCSVHeader();

        assertEquals(expected, result);
    }

    @Test
    public void shouldParseCSVBody() {
        CSVParser csvParser = new CSVParser(ParsableObject.class);
        ParsableObject max = new ParsableObject(1, "Max", 25);
        ParsableObject hans = new ParsableObject(2, "Hans", 23);
        ParsableObject jakob = new ParsableObject(3, "Jakob", 20);
        ParsableObject[] parsableObjects = new ParsableObject[] {max, hans, jakob};
        String expected = """
                1,Max,25
                2,Hans,23
                3,Jakob,20
                """;
        String result = csvParser.parseToCSVBody(parsableObjects);

        assertEquals(expected, result);
    }

    @Test
    public void shouldParseToCSV() {
        CSVParser<ParsableObject> csvParser = new CSVParser(ParsableObject.class);
        ParsableObject max = new ParsableObject(1, "Max", 25);
        ParsableObject hans = new ParsableObject(2, "Hans", 23);
        ParsableObject jakob = new ParsableObject(3, "Jakob", 20);
        ParsableObject[] parsableObjects = new ParsableObject[] {max, hans, jakob};
        String expected = """
                id,name,age
                1,Max,25
                2,Hans,23
                3,Jakob,20
                """;
        String result = csvParser.parseToCSV(parsableObjects);

        assertEquals(expected, result);
    }
}
