import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner (System.in);
        double length; double width; double radiusSphere; double a; double b; double c; double radius;
        System.out.println("Enter length of rectangle (positive integer) :");
        System.out.println("Enter width of rectangle (positive integer) :");
        width = scnr.nextDouble();
        System.out.println("Now enter the radius of the circle (positive integer) :");
        radius = scnr.nextDouble();
        System.out.println("Enter side A of triangle (positive integer) :");
        a = scnr.nextDouble();
        System.out.println("Enter side B of triangle (positive integer) :");
        b = scnr.nextDouble();
        System.out.println("Enter side C of triangle (positive integer) :");
        c = scnr.nextDouble();
        length = scnr.nextDouble();
        System.out.println("Area of rectangle: " + (width*radius));
        System.out.println("Area of circle: " + 3.14 * Math.pow(a, 2.0));
        System.out.println("Perimeter of rectangle: " + (2*(radius+width)));
        System.out.println("Circumference of circle: " +  2 * 3.14 * a);
        System.out.println("Area of triangle: " + Math.sqrt(((length+b+c)/2)*(((length+b+c)/2)-b)*(((length+b+c)/2)-length)*(((length+b+c)/2)-c)));
        System.out.println("Perimeter of triangle: " + (b + length + c));
        radiusSphere = scnr.nextDouble();
        double radiusCyl; double height; double diameter; double widthprism; double heightCyl;
        System.out.println("Enter the radius of the sphere: " );
        diameter = scnr.nextDouble();
        System.out.println("Enter the diameter of the rectangular prism: ");
        System.out.println("Enter the height of the rectangular prism: ");
        widthprism = scnr.nextDouble();
        System.out.println("Enter the width of the rectangular prism: ");
        heightCyl = scnr.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        radiusCyl = scnr.nextDouble();
        System.out.println("Enter the radius of the cylinder: ");
        System.out.println("The surface area of the sphere is: " + 4 * 3.14 * Math.pow(radiusSphere, 2.0));
        System.out.println("The volume of the sphere is: " + 4 * 3.14 * (Math.pow(radiusSphere, 3.0) / 3) );
        height = scnr.nextDouble();
        System.out.println("The surface area of the rectangular prism is: " + (2*((diameter * widthprism)+(heightCyl * diameter)+(widthprism * heightCyl))));
        System.out.println("The volume of the rectangular prism is: " + (width * radius * heightCyl));
        System.out.println("The surface area of the cylinder is: " + ((2 * 3.14 * radius * radiusCyl)+(2 * 3.14 * Math.pow(radius, 2.0))));
        System.out.println("The volume of the cylinder is: " + 3.14 * Math.pow(radius, 2.0) * radiusCyl);
        System.exit(1);












































































    }
}
