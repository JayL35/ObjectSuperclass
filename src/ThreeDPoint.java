public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint (String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object point)
    {
        if (point instanceof ThreeDPoint)
        {
            return super.equals(point) && (this.z == ((ThreeDPoint) point).z);
        }
        return false;
    }
}
