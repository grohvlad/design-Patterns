package com.grohvlad;

public class Main {
    public static void main(String[] args) {
        ICafe cafe = new Cafe();
        cafe.workFor_n_Days(30);
        cafe.getStatistics();
    }
}