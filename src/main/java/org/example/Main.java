package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList= List.of(
                new Person("Joao", Gender.FEMININO),
                new Person("Arnaldo", Gender.MASCULINO),
                new Person("Julio", Gender.MASCULINO),
                new Person("Carla", Gender.FEMININO),
                new Person("Joao", Gender.FEMININO),
                new Person("Beto", Gender.MASCULINO)
        );

        personList.stream().filter(person -> person.genero.equals(Gender.FEMININO))
                .forEach(System.out::println);
    }

        static class Person {
            private final String nome;
            private final Gender genero;

            public Person(String nome, Gender genero) {
                this.nome = nome;
                this.genero = genero;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "nome='" + nome + '\'' +
                        ", genero=" + genero +
                        '}';
            }
        }
        enum Gender {
            FEMININO,
            MASCULINO
        }
    }
