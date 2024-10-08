import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the radius of the circle: ");
    double radius = sc.nextDouble();
    Circle circle = new Circle(radius);
    System.out.println("A circle with a radius of " + radius + " has a circumferance of " +  circle.getCircumference() + " and an area of " + circle.getArea());

    System.out.println("Enter number of sides");
    int sides = sc.nextInt();
    System.out.println("Enter the side length ");
    double sideLength = sc.nextDouble();

    RegularPolygon polygon = new RegularPolygon(sides, sideLength);
    System.out.println("Area with " + sides + " sides: " + polygon.getArea());
    System.out.println("Incrementing the number of sides by two");
    RegularPolygon porygon = new RegularPolygon(2 + sides, sideLength);
    System.out.println("Area with " + (sides + 2) + " sides: " + porygon.getArea());
  }
}
