package com.kulikowski.playground.utils.doggos;

import static com.kulikowski.playground.utils.doggos.DogType.MONGREL;

/**
 * Created by Kasper on 15.07.2017.
 */
public class Dog {
    private boolean isGoodBoy;
    private String name = "Rex";
    private DogType type = MONGREL;
    private String owner;

    public Dog(boolean isGoodBoy) {
        this.isGoodBoy = isGoodBoy;
    }

    public Dog(boolean isGoodBoy, String name) {
        this.isGoodBoy = isGoodBoy;
        this.name = name;
    }

    public Dog(String owner, boolean isGoodBoy){
        this.owner = owner;
        this.isGoodBoy = isGoodBoy;
    }

    public Dog(boolean isGoodBoy, String name, DogType type) {
        this.isGoodBoy = isGoodBoy;
        this.name = name;
        this.type = type;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(DogType type) {
        this.type = type;
    }

    public boolean isGoodBoy() {
        return isGoodBoy;
    }

    public String getName() {
        return name;
    }

    public DogType getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isGoodBoy=" + isGoodBoy +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
