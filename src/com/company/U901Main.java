package com.company;

public class U901Main {

    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[20];
        for(int i = 0; i < 20; i++) {
            floatArr[i] = (float) Math.random();
        }
        U0901WorkArray insWorkArrayInt = new U0901WorkArray<>(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray<>(floatArr);
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
    }

}
