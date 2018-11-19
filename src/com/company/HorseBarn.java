package com.company;

public class HorseBarn{

    private Horse[] spaces;


    public int findHorseSpace(String name){
        int index = -1;
        for (int i = 0 ; i < spaces.length(); i++){
            if (spaces[i].equals(name)){
                index = i;
            }
        }
        return index;
    }

    public void consolitdate() {
        
    }
}
