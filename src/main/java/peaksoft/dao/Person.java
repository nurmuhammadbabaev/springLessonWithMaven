package peaksoft.dao;

import java.util.Scanner;

public class Person {
   static Scanner scanner=new Scanner(System.in);

private String name;
    private int age;
    private Animal animal;

    public Person() {
    }
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callAnimal(){

        System.out.println("This is a your animal! 1-good animal! 2-bad animal!");
            int numberAnimal=scanner.nextInt();
            if (numberAnimal==1) {
                animal.animalPlus();
            }else if(numberAnimal==2) {
                animal.animalMinus();
            }else {
                System.out.println("Not the animal!");
        }
    }

    @Override
    public String toString() {
        return "Person:" +
                "\npersonName='" + name + '\'' +
                "\npersonAge='" + age +'\'' +
                "\npersonAnimal:" + animal+"";
    }
}
