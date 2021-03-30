package Aufgabe20;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.*;

public class CSVParser <T extends Object> {

    private final Class<T> clazz;

    public CSVParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Boolean checkIfParsable(T obj) {
        Boolean result = false;
        if(obj != null) {
            //Check if CSV-Entity annotation is set
            if(obj.getClass().isAnnotationPresent(CSVEntity.class)) {
                result = true;
            }
            //Check if CSVField-Annotation is set
            //TODO Check fields of element
            if(obj.getClass().isAnnotationPresent(CSVField.class)) {
                result = true;
            }
        }
        return result;
    }

    public String parseToCSV(T[] parsableObjects) {
        StringBuilder result = new StringBuilder();
        result.append(parseToCSVHeader());
        result.append(parseToCSVBody(parsableObjects));
        return result.toString();
    }

    public String parseToCSVHeader() {
        StringBuilder csvHeaderString = new StringBuilder();
        Field[] fields = this.clazz.getDeclaredFields();
        for (int fieldIndex = 0; fieldIndex < fields.length; fieldIndex++) {
            Field field = fields[fieldIndex];
            if(field.isAnnotationPresent(CSVField.class)) {
                csvHeaderString.append(field.getName());
                if(fieldIndex < fields.length -1) {
                    csvHeaderString.append(',');
                } else {
                    csvHeaderString.append("\n");
                }
            }
        }
        return csvHeaderString.toString();
    }

    public String parseToCSVBody(T[] objs) {
        StringBuilder csvBodyString = new StringBuilder();
        Field[] fields = this.clazz.getDeclaredFields();
        for (T obj : objs) {
            for(int fieldIndex = 0; fieldIndex < fields.length; fieldIndex++) {
                Field field = fields[fieldIndex];
                try {
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), this.clazz);
                    if(field.isAnnotationPresent(CSVField.class)) {
                            csvBodyString.append(propertyDescriptor.getReadMethod().invoke(obj));
                        }
                        if(fieldIndex < fields.length -1) {
                            csvBodyString.append(',');
                        } else {
                            csvBodyString.append("\n");
                        }
                    }
                catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    System.out.println("Exception while trying to parseCSVBody: " + e.getMessage());
                }
            }
        }
        return csvBodyString.toString();
    }


}
