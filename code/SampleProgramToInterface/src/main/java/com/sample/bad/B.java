package com.sample.bad;

class B {

    private final C c;

    B(C c) {
        this.c = c;
    }

    int doXWork() {
        return c.doXWork();
    }

    int doYWork() {
        return c.doYWork();
    }

    int doZWork() {
        return c.doZWork();
    }
}
