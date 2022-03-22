package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Собака", "Мясо", "Будка");
        Cat cat = new Cat("Кот", "Кошачий корм", "Дом");
        Horse horse = new Horse("Лошадь", "Сено", "Конюшня");
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(dog);
        veterinarian.treatAnimal(cat);
        veterinarian.treatAnimal(horse);
    }
}
class Animal{
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное шумит");
    }
    public void eat(){
        System.out.println("Животное ест");
    }
    public void sleep(){
        System.out.println("Животное спит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
class Dog extends Animal{

    public String bark = "гавкает";

    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise(){
        System.out.println("Собака " + bark);
    }
    public void eat(){
        System.out.println("Собака ест");
    }
    @Override
    public void sleep(){
        System.out.println("Собака спит");
    }
}
class Cat extends Animal{

    public String meow = "мяукает";

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise(){
        System.out.println("Кот " + meow);
    }
    public void eat(){
        System.out.println("Кот ест");
    }
    @Override
    public void sleep(){
        System.out.println("Кот спит");
    }
}
class Horse extends Animal{

    public String snort = "ржет";

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise(){
        System.out.println("Лошадь " + snort);
    }
    public void eat(){
        System.out.println("Лошадь ест");
    }
    @Override
    public void sleep(){
        System.out.println("Лошадь спит");
    }
}
class Veterinarian{
    public void treatAnimal(Animal animal){
        System.out.println("Прием у ветеринара");
        System.out.println("Животное: " + animal.getName() + "\tЕда: " + animal.getFood() + "\tМестоположение: " + animal.getLocation());
    }
}