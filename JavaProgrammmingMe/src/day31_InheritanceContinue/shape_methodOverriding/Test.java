package src.day31_InheritanceContinue.shape_methodOverriding;

public class Test {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.draw();
        System.out.println("--------------------------------------");
        Circle circle = new Circle(3.5);
        System.out.println(circle);
        circle.draw();
        System.out.println("--------------------------------------");


    }
}
