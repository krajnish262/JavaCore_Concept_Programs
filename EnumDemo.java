package com.example.javacore_concept_programs;

enum Animal {
    CAT("Rocky"), DOG("Lucius"), Horse("Chetak");


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    Animal(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case Horse:
               // System.out.println("Horse");
                break;
            default:
                break;


        }
        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string "+Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.Horse.getName());
        Animal animal1=Animal.valueOf("CAT");
        System.out.println(animal1);

    }
}
