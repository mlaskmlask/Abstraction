public class Main {
    public static void main(String[] args) {
        SimpleInterface sp = new Dog();
        sp.bark();

        Snake snake = new Snake();
        snake.go();
        snake.eat();

        Fish fish = new Fish();
        fish.go();
        fish.eat();
    }

}
