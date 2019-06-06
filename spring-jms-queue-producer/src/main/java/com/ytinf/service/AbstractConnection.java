package com.ytinf.service;

public abstract class AbstractConnection {
    public abstract boolean build() ;
    public static AbstractConnection create() {
        return new AbstractConnection() {
            @Override
            public boolean build() {
                return true;
            }
        } ;
    }
}
