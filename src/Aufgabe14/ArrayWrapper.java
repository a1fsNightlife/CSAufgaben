package Aufgabe14;

public class ArrayWrapper {
    public Integer[] integerArray;

    public ArrayWrapper(Integer[] integerArray) {
        this.integerArray = integerArray;
    }

    public Integer[] addElementToArray(Integer intToAdd) {
        Integer elementCount = getArrayElementCount();
        Integer[] tempArray;
        if(integerArray.length - elementCount < 1) {
            tempArray = new Integer[integerArray.length * 2];
            copyElementsToNewArray(elementCount, tempArray);
            tempArray[elementCount] = intToAdd;
            integerArray = tempArray;
        }
        return integerArray;
    }

    public Integer[] addElementsToArray(Integer[] integersToAdd) {
        Integer[] result;


        return null;
    }

    private void copyElementsToNewArray(Integer elementCount, Integer[] tempArray) {
        for(int element = 0; element < elementCount; element++) {
            tempArray[element] = integerArray[element];
        }
    }

    public Integer getArrayElementCount() {
        Integer elementCount = 0;
        for(int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] != null) {
                elementCount++;
            }
        }
        return elementCount;
    }

    public Integer[] getIntegerArray() {
        return integerArray;
    }

    public void setIntegerArray(Integer[] integerArray) {
        this.integerArray = integerArray;
    }


}
