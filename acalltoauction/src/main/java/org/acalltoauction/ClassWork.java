package org.acalltoauction;

import java.util.ArrayList;

public class ClassWork {
    public int sumMissingStringNumbers(String message) {
        message = message.replaceAll("\\s+", "");
        int total = 0;
        String[] value = splitStringValues(message);
        int[] intValue = splitIntValues(value);
        int highestNumber = highestNumber(intValue);
        int lowestNumber = lowestNumber(intValue);

        for(int count = lowestNumber ; count < highestNumber; count++){
            int numberOfTimes = 0;
            for(int counter = 0 ; counter < value.length ; counter++  ){
                if (count == intValue[counter]){
                    numberOfTimes += 1;
                }
            }
            if(numberOfTimes == 0){
                total += count;
            }
        }

        return total;
    }

    public String[] splitStringValues(String message) {
        String[] value = message.split(",");
        return value;
    }
    public int[] splitIntValues(String[] message) {
        int[] value = new int[message.length];
        for (int i = 0; i < message.length; i++) {
            value[i] = Integer.parseInt(message[i]);
        }
        return value;
    }
    public int highestNumber(int[] message) {
        int highest = 0;
        for (int i = 0; i < message.length; i++) {
            if (message[i] > highest) {
                highest = message[i];
            }
        }
        return highest;
    }
    public int lowestNumber(int[] message) {
        int lowest = 0;
        for (int i = 0; i < message.length; i++) {
            if (message[i] < lowest) {
                lowest = message[i];
            }
        }
        return lowest;
    }

    public static void main(String[] args){
        String name = "4 t m";
        System.out.println(name.replaceAll("\\s+", ""));
    }

}


