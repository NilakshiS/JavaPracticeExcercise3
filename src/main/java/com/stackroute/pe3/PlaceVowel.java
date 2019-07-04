package com.stackroute.pe3;

public class PlaceVowel {
    public String[] replaceVowels(String[] places) {
        String[] changedPlaces = new String[places.length];
        for (int i = 0; i < places.length;i++) {
            changedPlaces[i] = places[i].replaceAll("[AEIOUaeiou]","");
            //changedPlaces[i] = places[i].replace("a","").replace("e","").replace("a","").replace("o","").replace("u","");
        }
        return changedPlaces;
    }
}
