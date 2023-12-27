package org.springframework;

public class Rock implements Music{
    @Override
    public String getSong() {
        return " Lithium ";
    }
}
