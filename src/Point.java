public class Point {
    private int x;
    private int y;
    private String label;

    public Point (String label, int x, int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object point)
    {
        if (point instanceof Point)
        {
            return (this.x == ((Point) point).x && this.y == ((Point) point).y);
        }
        return false;
    }
}
