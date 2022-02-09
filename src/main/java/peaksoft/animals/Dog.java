package peaksoft.animals;

import peaksoft.dao.Animal;


public class Dog  implements Animal  {
    private String name;
    private String parody;
    private String color;

    public Dog() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParody() {
        return parody;
    }

    public void setParody(String parody) {
        this.parody = parody;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void animalPlus() {

        System.out.println("This is a good Dog!");


    }

    @Override
    public void animalMinus() {
        System.out.println("This is a bad Dog!");

    }

    @Override
    public String toString() {
        return "Dog" +
                "\nanimalName='" + name + '\'' +
                "\nanimalParody='" + parody + '\'' +
                "\nanimalColor='" + color + '\'';
    }
}
