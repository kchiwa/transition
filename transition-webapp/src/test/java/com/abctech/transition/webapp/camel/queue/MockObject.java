package com.abctech.transition.webapp.camel.queue;

import java.io.Serializable;


class MockObject implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}