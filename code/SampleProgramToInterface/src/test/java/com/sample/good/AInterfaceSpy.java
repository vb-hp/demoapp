package com.sample.good;

public class AInterfaceSpy implements AInterface {

    @Override
    public int doXWork() {
        return 100;
    }

    @Override
    public int doYWork() {
        return 200;
    }

    @Override
    public int doZWork() {
        return 300;
    }
}
