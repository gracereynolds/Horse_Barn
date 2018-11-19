package com.company;

public class HorseBarn {

    private Horse[] spaces;


    public int findHorseSpace(String name) {
        int index = -1;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].equals(name)) {
                index = i;
            }
        }
        return index;
    }

    public void consolidate() {
        for (int i = 0; i < this.spaces.length - 1; i++) {
            if (this.spaces[i] == null) {
                int a = i + 1;
                while (a < this.spaces.length) {
                    if (this.spaces[a] != null) {
                        this.spaces[i] = this.spaces[a];
                    } else {
                        a++;
                    }
                }
            }

        }
    }
}
