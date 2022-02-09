package peaksoft.animals;

import peaksoft.dao.Animal;


public class Horse  implements Animal {

    private String name;
    private String parody;
    private  String color;

    public Horse() {
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
        System.out.println("This is a good horse!");

    }

    @Override
    public void animalMinus() {
        System.out.println("This is a bad horse!");

    }

    @Override
    public String toString() {
        return "Horse" +
                "\nanimalName='" + name + '\'' +
                "\nanimalParody='" + parody + '\'' +
                "\nanimalColor='" + color + '\'';
    }
}
