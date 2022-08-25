
/**
 * ex 1 Point class
 * This class Represents a point on the cartesian axis system
 * @author Elishay Amar
 * @2021
 */
public class Point
{
    private int _x,_y;
    /**
     * A constructor that receives two 
     * parameters that constitute the attribute values that a point will have.
     * @param x  Represents the position of the point on the X-axis
     * @param y  Represents the position of the point on the Y-axis
     */
    public Point(int x, int y)
    {
        _x=x;
        _y=y;
    }   

    /**
     * A copy constructor that gets another point, and copies its values
     * @param other Represents the point that need to bee copied 
     */              
    public Point (Point other)
    {
        _x=other._x;
        _y=other._y;
    }

    /** 
     * gets the x value 
     * @return the x value
     */
    public int getX()
    {
        return _x;
    }

    /** 
     * gets the y value 
     * @return the y value
     */
    public int getY()
    {
        return _y;
    }

    /** 
     * sets x value
     * @param x the x value
     */
    public void setX(int x)
    {
        _x=x;
    }

    /** 
     * sets y value
     * @param y the y value
     */
    public void setY(int y)
    {
        _y=y;
    }

    /**
     * returns a  String that represents this point
     *
     * @return String that represents this point
     * in the following format:
     * x,y for example: 9,-3
     */
    public String toString()
    {
        return "("+ _x+","+_y+")";

    }

    /**
     * A method that receives another point called "other" as a parameter
     * and returns whether the point on which the method was applied and the "other" point obtained as a parameter
     * are similar in value.
     *  @param other Represents the point that should be comparable
     */

    public boolean equals(Point other)
    {
        return(_x==other._x&&_y==other._y);
    }

    /**
     * A method that receives another point called "other" as a parameter
     * and returns whether the point on which the method was applied and the "other" point obtained as a parameter
     * have smaller hieght value (thats mean that 'our' point is higher).
     *  @param other Represents the point that should be under
     */
    public boolean isAbove(Point other)
    {
        return (this._y>other._y);
    }

    /**
     * A method that receives another point called "other" as a parameter
     * and returns whether the point on which the method was applied and the "other" point obtained as a parameter
     * is above ours (thats mean that 'our' point is lower).
     *  @param other Represents the point that should be above
     */
    public boolean isUnder(Point other)
    {
        return other.isAbove(this);

    }

    /**
     * A method that receives another point called "other" as a parameter
     * and returns whether the point on which the method was applied and the "other" point obtained as a parameter
     * have bigger 'X' value (thats mean that 'our' point is more left).
     *  @param other Represents the point that should be in the right
     */
    public boolean isLeft(Point other){
        return(_x<other._x);
    }

    /**
     * A method that receives another point called "other" as a parameter
     * and returns whether the point on which the method was applied and the "other" point obtained as a parameter
     * is left from ours (thats mean that 'our' point is more right).
     *  @param other Represents the point that should be in the left
     */
    public boolean isRight(Point other){
        return other.isLeft(this);
    } 

    /**
     * A method that moves the point to another location, 
     * the method recive two integers deltaX and deltaY
    Which represent how much to move the point on the X-axis and the 
    Y-axis in coordination
    @param deltaX Represents the x value that the method add to the Current one
    @param deltaY Represents the Y value that the method add to the Current one
     */
    public void move (int deltaX,int deltaY){
        _x+=deltaX;
        _y+=deltaY;
    }

    /**
     * A method that receives a point as a parameter and returns the distance
     * between the point on which the method was applied and the 
     * point received as a parameter
     * @param p Represents the point that the method calculates the distance from it to our point
     */
    public double distance(Point p)
    {
        int x=p._x;
        int y=p._y;
        return Math.sqrt((Math.pow(_x-x,2))+(Math.pow(_y-y,2)));
    }

}

