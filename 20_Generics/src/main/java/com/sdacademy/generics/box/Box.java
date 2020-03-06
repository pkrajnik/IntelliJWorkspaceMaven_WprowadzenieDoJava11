package com.sdacademy.generics.box;

public class Box<T, S, U> {

    private T objectT;
    private S objectS;
    private U objectU;

    public void putInBoxT(T obj) {
        this.objectT = obj;
    }

    public void putInBoxS(S obj) {
        this.objectS = obj;
    }

    public void putIInBoxU(U obj) {
        this.objectU = obj;
    }

    public T getFromBoxT() {
        return objectT;
    }

    public S getFromBoxS() {
        return objectS;
    }

    public U getFromBoxU() {
        return objectU;
    }

}

