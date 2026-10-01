import dev.kaldiroglu.java.ip.hw.ch04.Rectangle;

void main() {

    Rectangle rectangle1 = new Rectangle();
    rectangle1.length = 10;
    rectangle1.width = 5;
    rectangle1.printInfo();
    double area = rectangle1.getArea();
    double perimeter = rectangle1.getPerimeter();
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);

    // Down here
}
