package com.sample.bad;

class A {

    private final B b;

    A(B b) {
        this.b = b;
    }

    int fetchResultFromServerOne() {
        return b.doXWork();
    }

    int fetchResultFromServerTwo() {
        return b.doYWork();
    }

    int fetchResultFromServerThree() {
        return b.doZWork();
    }
}
