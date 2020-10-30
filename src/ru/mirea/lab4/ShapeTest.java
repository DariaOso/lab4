package ru.mirea.lab4;

public class ShapeTest {
    public static void main(String[] args) {
      Shape one = new Shape();
      one.setName("Круг.");
      System.out.print(one.toString()+" и это - "+ one.getName() );
    }
}
