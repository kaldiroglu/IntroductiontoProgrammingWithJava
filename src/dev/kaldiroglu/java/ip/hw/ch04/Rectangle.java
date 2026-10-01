package dev.kaldiroglu.java.ip.hw.ch04;

public class Rectangle {
    public double length;
    public double width;

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void printInfo(){
        String info = "Rectangle{" +
            "length=" + length +
                    ", width=" + width +
                    "}";
        System.out.println(info);
    }
}