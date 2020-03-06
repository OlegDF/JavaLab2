package com.company;

public class U0901WorkArray<T extends Number> {

    T[] arrNums;

    public U0901WorkArray(T[] numP) {
        this.arrNums = numP;
    }

    double sum() {
        double doubleWork = 0;
        for(T num: arrNums) {
            doubleWork += num.doubleValue();
        }
        return doubleWork;
    }

}
