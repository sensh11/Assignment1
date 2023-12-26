package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        this.points = points;
    }

    public double Perimeter() {
        double perim = 0.0;

        for(int i = 0; i < this.points.size(); ++i) {
            Point current_point = (Point)this.points.get(i);
            Point nextPoint = (Point)this.points.get((i + 1) % this.points.size());
            perim += current_point.dist_to(nextPoint);
        }

        return perim;
    }

    public double longSide() {
        double longSide = 0.0;

        for(int i = 0; i < this.points.size(); ++i) {

            Point currentPoint = (Point) this.points.get(i);

            Point nextPoint = (Point) this.points.get ((i + 1) % this.points.size());
                double currentDistance = currentPoint.dist_to (nextPoint);

                if (currentDistance > longSide) {
                longSide = currentDistance;
            }
        }

        return longSide;
    }

    public double AverageSide() {
        double totl_Length = 0.0;
        int countSides = this.points.size ();

        for (int i = 0; i < countSides; ++i) {
             Point currentPoint = (Point) this.points.get(i);

             Point nextPoint = (Point) this.points.get ((i + 1) % countSides);

                totl_Length += currentPoint.dist_to(nextPoint);
        }

        return totl_Length / (double) countSides;
    }
}
