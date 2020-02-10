package gr.codehub.points;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Declare the points of the triangle
        Point pointA = new Point(7,4); //point A
        Point pointB = new Point(2,2); //point B
        Point pointC = new Point(2,6); //point C

        // The a side
        double xSqrtPointAPointB =  Math.pow(pointB.x - pointA.x,2); // x square difference for points A, B
        double ySqrtPointAPointB =  Math.pow(pointB.y - pointA.y,2); // y square difference for points A, B
        double aSide = Math.sqrt(xSqrtPointAPointB + ySqrtPointAPointB); // distance between point A and point B

        // The b side
        double xSqrtPointAPointC =  Math.pow(pointC.x - pointA.x,2); // x square difference for points A, C
        double ySqrtPointAPointC =  Math.pow(pointC.y - pointA.y,2); // y square difference for points A, C
        double bSide = Math.sqrt(xSqrtPointAPointC + ySqrtPointAPointC); // distance between point A and point C

        // The c side
        double xSqrtPointBPointC =  Math.pow(pointC.x - pointB.x,2); // x square difference for points B, C
        double ySqrtPointBPointC =  Math.pow(pointC.y - pointB.y,2); // y square difference for points B, C
        double cSide = Math.sqrt(xSqrtPointBPointC + ySqrtPointBPointC); // distance between point B and point C

        // The perimeter
        double perimeter = aSide + bSide + cSide;

        System.out.println("The perimeter of the triangle is: " + perimeter);

    }
}
