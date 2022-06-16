package AJ_QAP2_MyCircle_GeraldBartlett;

public class MyPoint {
    // instance x & y variable set to 0
    private int x = 0;
    private int y = 0;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    // constructors
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Returns a 2-element int array containing x and y
    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    // Sets both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Return the distance at (x,y)p1.distance(1,2)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Returns the distance p1.distance(p2) 
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Returns the distance from here to (0,0) p1.distance() 
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
