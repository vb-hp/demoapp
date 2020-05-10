package com.sample.good;

class A {

    private final AInterface aInterface;

    A(AInterface lowLevelClass) {
        this.aInterface = lowLevelClass;
    }

    int fetchResultFromServerOne() {
        return aInterface.doXWork();
    }

    int fetchResultFromServerTwo() {
        return aInterface.doYWork();
    }

    int fetchResultFromServerThree() {
        return aInterface.doZWork();
    }
}