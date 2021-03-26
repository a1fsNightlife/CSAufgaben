package Aufgabe16;

import java.lang.reflect.Array;

public class GenericArrayWrapper<T> {

    public T[] genericArray;
    public Class<T> c;

    public GenericArrayWrapper(T[] genericArray, Class<T> c) {
        this.genericArray = genericArray;
        this.c = c;
    }

    public T[] addElementToArray(T intToAdd) {
        Integer elementCount = getArrayElementCount();
        T[] tempArray;
        if(getGenericArray().length - elementCount < 1) {
            tempArray = getNewClassObj(c, genericArray.length * 2);
            copyElementsToNewArray(elementCount, tempArray);
            tempArray[elementCount] = intToAdd;
            genericArray = tempArray;
        }
        return genericArray;
    }

    public T[] addElementsToArray(T[] integersToAdd) {
        T[] result;


        return null;
    }

    private void copyElementsToNewArray(Integer elementCount, T[] tempArray) {
        for(int element = 0; element < elementCount; element++) {
            tempArray[element] = genericArray[element];
        }
    }

    public Integer getArrayElementCount() {
        Integer elementCount = 0;
        for(int i = 0; i < genericArray.length; i++) {
            if(genericArray[i] != null) {
                elementCount++;
            }
        }
        return elementCount;
    }

    public T[] getNewClassObj(Class<T> c, Integer length) {
        T[] t = (T[]) Array.newInstance(c, length);
        return t;
    }

    public T[] getGenericArray() {
        return genericArray;
    }

    public void setGenericArray(T[] genericArray) {
        this.genericArray = genericArray;
    }
}
