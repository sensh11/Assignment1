package models;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dist_to (Point next) {
         double delX = next.x - this.x;

         double delY = next.y - this.y;

         return Math.sqrt (delX * delX + delY * delY);
    }
}