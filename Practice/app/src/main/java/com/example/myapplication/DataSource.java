package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
        List<String> getCars() {
            List<String> cars = new ArrayList<>();
            cars.add("BMW");
            cars.add("Porsche");
            cars.add("Dacia");
            cars.add("VW");
            cars.add("Audi");
            cars.add("Tesla");
            cars.add("Toyota");
            cars.add("Mini");
            cars.add("Lada");
            cars.add("Citroen");
            cars.add("Renault");
            cars.add("Ferarri");
            cars.add("Maseratti");
            cars.add("Alfa romeo");
            cars.add("Lambo");
            cars.add("Ford");
            cars.add("Dacia");

            return cars;
        }

        List<Integer> getNumbers() {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            numbers.add(6);
            return numbers;
        }

        List<Person> getPersons() {
            List<Person> numbers = new ArrayList<>();
            Person person = new Person();
            person.name = "Caius";
            person.age = "21";

            Person personTwo = new Person();
            personTwo.name = "Darius";
            personTwo.age = "23";

            return numbers;
        }
}
