public class Homework {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        System.out.println(appleBox.getWeight());

        appleBox.add(new Apple(2));
        appleBox.add(new Apple(4));
        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(8));
        System.out.println(orangeBox.getWeight());

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(20));

        goldenAppleBox.move(appleBox);

        System.out.println(goldenAppleBox.getWeight());
        System.out.println(appleBox.getWeight());
    }
}
