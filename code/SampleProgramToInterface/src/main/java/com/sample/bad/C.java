package com.sample.bad;

class C {

    private final D d;

    C(D d) {
        this.d = d;
    }

    int doXWork() {
        return d.doXWork();
    }

    int doYWork() {
        return d.doYWork();
    }

    int doZWork() {
        return d.doZWork();
    }

}
