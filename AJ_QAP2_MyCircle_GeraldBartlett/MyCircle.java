package AJ_QAP2_MyCircle_GeraldBartlett;

// MyCircle class defined 
public class MyCircle {
    // instance center, radius variable
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    // constructors
    public MyCircle()
    {
        this.center =  new MyPoint(0, 0);
        this.radius = 1;
    }
    
    public MyCircle(int x, int y, int radius) 
    {
        // construct an instance of MyPoint 
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) 
    {
        //instance of MyPoint already constructed
        this.center = center;
        this.radius = radius;    
    }            
    
        //get center - getters and setters
    public MyPoint getCenter() 
    {
        return center;
	}
        // set Center
	public void setCenter(MyPoint newCenter) 
    {
		this.center = newCenter;
	}
        // set Radius
    public int getRadius() 
    {
		return radius;
	}

	public void setRadius(int newRadius) 
    {
		this.radius = newRadius;
	}

    public int getCenterX()
    {
        return center.getX();
    }

    public void setCenterX(int newX)
    {
        this.center.setX(newX);
    }

    public int getCenterY()
    {
        return center.getY();
    }

    public void setCenterY(int newY)
    {
        this.center.setY(newY);
    }

    public void setCenterXY(int x, int y)
    {
        this.center.setXY(x, y);
    }
        // to string
    public String toString() 
    {
        return "(" + this.getCenterX() + ", " + this.getCenterY() + ") Radius : " + this.radius;
    }
        // get Area of the circle
    public long getArea() 
    {
        return Math.round(3.1416 * this.radius * this.radius);
    }
        // get the circumference of the circle
    public double getCircumference()
    {
        return (this.radius * 3.14 * 2);
    }
        // distance of the points
    public double distance(MyCircle another)
    {
        return center.distance(another.center);    
    }
    }
    
    

