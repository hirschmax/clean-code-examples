package com.github.hirschm.solid.lsp.bad;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new RuntimeException("Penguins can't fly!");
    }
}
