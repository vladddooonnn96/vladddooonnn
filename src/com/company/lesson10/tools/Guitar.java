package com.company.lesson10.tools;

import java.util.Objects;

public class Guitar implements Tool{
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return strings == guitar.strings;
    }

    public int hashCode() {

        return Objects.hash(strings);
    }

    public String toString() {
        return "Guitar{" +
                "strings=" + strings +
                '}';
    }
    public void play(){
        System.out.println("Играет гитара с такими характеристиками: " + strings);
    }
}
