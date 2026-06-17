import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        // Kiểm thử phần Động vật (Animal)
        System.out.println("--- Animals ---");
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            // Nếu animal là thực thể của Chicken thì ép kiểu sang Edible để gọi cách ăn
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        // Kiểm thử phần Trái cây (Fruit)
        System.out.println("\n--- Fruits ---");
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}