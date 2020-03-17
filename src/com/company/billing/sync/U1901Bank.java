package com.company.billing.sync;

public class U1901Bank {

    private int intTo, intFrom = 220;

    synchronized void calc(int intTransaction, long lngTimeout) {
        System.out.println("BEFORE intTo: " + intTo + ", intFrom: " + intFrom + ", thread: " + Thread.currentThread().getName());
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        intTo += intTransaction;
        System.out.println("AFTER intTo: " + intTo + ", intFrom: " + intFrom + ", thread: " + Thread.currentThread().getName());
    }

}
