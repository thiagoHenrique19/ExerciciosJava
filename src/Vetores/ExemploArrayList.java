package Vetores;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        //cria uma lista de string para guardar os nomes
        List<String> names = new ArrayList<>();
        //o método size retorna a quantidade de elementos da lista
        //inicialmente quando crio uma lista ela deve estar vazia (Zero elementos)
        System.out.println(names.size());

        //o método add adiciona um elemento na lista (por padrão adiciona no final da lista)
        names.add("Thiago");
        System.out.println(names);
        names.add("Gabriel");
        System.out.println(names);
        System.out.println(names.size());
        //Adiciona um elemento na primeira posição da lista
        names.addFirst("Maria");
        System.out.println(names);
        //adiciona um elemento na posição informada
        names.add(2,"Mariana");
        System.out.println(names);
        //o método get retorna um elemento da lista de acordo com a posição passada
        System.out.println(names.get(3));
        System.out.println(names.get(2));
        System.out.println(names.get(1));
        System.out.println(names.get(0));

        //o método remove remove um elemento da lista de acordo com a posição passada
        names.remove(3);
        System.out.println(names);
        //remove o primeiro elemento da lista
        names.removeFirst();
        System.out.println(names);
        //remove o último elemento da lista
        names.removeLast();
        System.out.println(names);
        //remove um elemento passando a referência do objeto
        names.remove("Thiago");
        System.out.println("A lista está vazia "+names);

        names.add("Thiago");
        System.out.println(names);
        //o método set atualiza o elemento na posição informada
        names.set(0,"Thiago Henrique de Oliveira");
        System.out.println(names);

        List<Double> notes = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<Person> people = new ArrayList<>();

        people.add(new Person("Thiago",16));
        System.out.println(people);

        //o método clear limpa a lista todo
        people.clear();
        System.out.println(people);

    }

    static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
