package pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Petty { //главный класс
    private final String name;

    public String getName() {
        return name;
    }

    public Petty(String name) {
        this.name = name;
    }
}

class Cat extends Petty { //наследуемый класс
    public Cat(String name) {
        super(name);
    }
}

class Dog extends Petty {  //наследуемый класс
    public Dog(String name) {
        super(name);
    }
}

class Owl extends Petty {  //наследуемый класс
    public Owl(String name) {
        super(name);
    }
}

class Pet {
    public static void main(String[] args) {

        Map<String, Petty> hashMap = new HashMap<>(); // инициализация объекта класса HaspMap

        hashMap.put("Cat", new Cat("Kisa"));
        hashMap.put("Dog", new Dog("Pes"));
        hashMap.put("Owl", new Owl("Filin"));

        for (Map.Entry temp : hashMap.entrySet()) { //из поля Map возврат методом пар ключ-значение
            System.out.println(temp.getKey() + " -> " + ((Petty)temp.getValue()).getName());
        }

        System.out.println("\"Dog\" exists -> " + hashMap.containsKey("Dog")); // проверка наличия ключа в HaspMaр
        System.out.println("\"Fish\" exists -> " + hashMap.containsKey("Fish"));

        Petty cat = hashMap.get("Cat"); // вывод значения по ключу
        System.out.println("\"Cat\" value is " + cat.getName());

        System.out.println(hashMap); // отображение

        Random random = new Random(); // объект класса Random

        Map<Integer, Integer> randomHashMap = new HashMap<>(); // объект класса HaspMap

        for (int i = 0; i < 40; i++){
            int temp = random.nextInt(100);
            randomHashMap.merge(temp, 1, Integer::sum); //добавление числа в HaspMaр (с перемещением индекса на 1, т.к. все ключи уникальны) и количество повторов
        }
        System.out.println(randomHashMap); // отображение.
    }
}