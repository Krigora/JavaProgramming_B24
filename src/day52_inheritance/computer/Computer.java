package day52_inheritance.computer;

public class Computer {

    String os;
    int memory;

    public Computer (String os, int memory){
        this.os = os;
        this.memory = memory;

    }

    @Override
    public String toString() {
        return "os: " + os + " Memory=" + memory;
    }
}
