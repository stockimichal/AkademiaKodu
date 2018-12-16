import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point point = new Point(3, 5);
        Point secondPoint = new Point(31, 35);
        Point thirdPoint = new Point(13, 55);
        Point fourthPoint = new Point(34, 25);
        System.out.println(point.equals(secondPoint));

        Set<Point> pointSet = new HashSet<>();
        pointSet.add(point);
        pointSet.add(secondPoint);
        pointSet.add(thirdPoint);
        pointSet.add(fourthPoint);

    }


}
