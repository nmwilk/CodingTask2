package com.sageone.codingtask2;

/**
 * Created by neil.wilkinson on 25/01/16.
 */
public class MyState {
    private static MyState state;

    private String name;

    private MyState() {
    }

    public static MyState getInstance() {
        if (state == null) {
            state = new MyState();
        }

        return state;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
