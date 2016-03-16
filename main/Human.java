package main;

import java.util.Map;
import java.util.TreeMap;

class Human {

    public static int id;

    private String surname;
    private String name;
    private String patronymic;
    private byte age;
    private String position;
    Map<Human, Integer> map = new TreeMap<Human, Integer>();

    public Human(String surname, String name, String patronymic, byte age, String position) {
        this.surname    = surname;
        this.name       = name;
        this.patronymic = patronymic;
        this.age        = age;
        this.position   = position;
        id++;
        getHuman(this);
    }

    public void getHuman(Human human) {
        System.out.println("id: " + id);
        System.out.println("Имя нового сотрудника: " + human.surname + " " + human.name + " " + human.patronymic);
        System.out.println("Возраст: " + human.age);
        System.out.println("Должность: " + human.position);
        System.out.println();
        //map.put(human, id);
    }

}