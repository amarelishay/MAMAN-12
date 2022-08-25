
/**
 *
 * ex 2 RectangleA class
 * Class RectangleA. The RectangleA class represents a 2D axis aligned integral rectangles.
 * @author Elishay ID 318840394
 * @2021
 */

public class RectangleA
{ 
    private final int DEFAULT_VAL=1;
    private int _width,_height;
    private Point _pointSW;

    /**
     * A constructor that receives two integers as parameters, the first is the width of the rectangle and the second
    Is the height. The southwest point will be at the beginning of the axes (0, 0). The length and breadth must be really positive integers.
    If any of them are not, the attribute will be initialized to be 1
    @param w Represents the width of the rectangle
    @param h Represents the width of the rectangle
     */
    public RectangleA(int w,int h){
        _pointSW=new Point(0,0);
        _width=w<=0? DEFAULT_VAL:w;
        _height=h<=0? DEFAULT_VAL:h;

    }

    /**
    A constructor that receives parameters with values for the appropriate attributes: the southwest point
    Will be accepted as a parameter (as a point, which is not null),
    And the width and height will be accepted as parameters.
    The length and the width must be really positive integers. If any of them are not, the attribute will be initialized to be 1.
    @param Point Represents the southwest point of the rectangle
    @param w Represents the width of the rectangle
    @param h Represents the width of the rectangle
     */

    public RectangleA(Point p,int w,int h){
        _pointSW=new Point(p);
        _width=w<=0? DEFAULT_VAL:w;
        _height=h<=0? DEFAULT_VAL:h;

    }  

    /**
     * A constructor that receives 
     * two points as parameters to our rectangle. The first point is the southwestern 
     * point and the second point is the northeastern point 
     * @param sw Represents the southwest point of the rectangle
     * @param ne Represents the northeast point of the rectangle
     * 
     */
    public RectangleA(Point sw,Point ne){
        _pointSW=new Point(sw);
        Point pointNE=new Point(ne);
        _width=pointNE.getX()-_pointSW.getX();
        _height=pointNE.getY()-_pointSW.getY();

    }

    /**
     * A copy constructor, which receives an object from the RectangleA class and copies its values.
     * @param r Represents the rectangle that need to bee copied
     */
    public RectangleA(RectangleA r)
    {
        _width=r._width;
        _height=r._height;
        _pointSW=new Point(r._pointSW);

    }

    /**

     * gets the Point NE 
     * @return the Point NE

     */
    public Point getPointNE(){
        Point pointNE=new Point(_width+_pointSW.getX(),_height+_pointSW.getY());
        return pointNE;
    }

    /**

     * gets the width 
     * @return the width of the rectangle

     */
    public int getWidth(){
        return _width;
    }

    /**

     * gets the height 
     * @return the height of the rectangle

     */
    public int getHeight(){
        return _height;
    }

    /**

     * gets the point SW 
     * @return the SW point of the rectangle

     */
    public Point getPointSW(){
        Point p= new Point (_pointSW);
        return p; 
    }

    /** 
     * sets the width of the rectangle
     * @param w the width of the rectangle
     */
    public void setWidth(int w)
    {
        _width=w<=0? DEFAULT_VAL:w;

    }

    /** 
     * sets the height of the rectangle
     * @param h the height of the rectangle
     */
    public void setHeight(int h){
        _height=h<=0? DEFAULT_VAL:h;

    }

    /** 
     * sets the SW point of the rectangle
     * @param p the SW point of the rectangle
     */
    public void setPointSW(Point p)
    {
        _pointSW=new Point(p);

    }

    /**
     * returns a  String that represents this rectangle
    @return String that represents this rectangle
     * in the following format:
     * Width=width Height=height PointSW=(pointSW) for example: Width=7 Height=3 PointSW=(3,8)
     */
    public String toString()
    {
        return ("Width="+_width+" Height="+_height+" PointSW="+_pointSW);
    }

    /**

     * gets the perimeter of the rectangle
     * @return the perimeter of the rectangle

     */
    public int getPerimeter()
    {
        return _width*2+_height*2;

    }

    /**

     * gets the area of the rectangle
     * @return the area of the rectangle

     */
    public int getArea()
    {
        return _width*_height;

    }

    /**
     * A method that moves the rectangle to another location, 
     * the method recive two integers deltaX and deltaY
    Which represent how much to move the rectangle on the X-axis and the 
    Y-axis in coordination
    @param deltaX Represents the x value that the method add to the Current one
    @param deltaY Represents the Y value that the method add to the Current one
     */
    public void move(int deltaX,int deltaY){
        _pointSW.move(deltaX,deltaY);
    }

    /**
     * A method that receives another rectangle called "other" as a parameter
     * and returns whether the rectangle on which the method was applied and the "other" rectangle obtained as a parameter
     * are similar in values.
     *  @param other Represents the rectangle that should be comparable
     *  @return true if the rectangle on which the method was applied and the "other" rectangle obtained as a parameter
     * are similar in values.
     */

    public boolean equals(RectangleA other){
        return (_pointSW.equals(other._pointSW)&&_height==other._height&&_width==other._width);
    }

    /**
     * A method that returns the length of the diagonal in the rectangle.
     * @return the length of the diagonal in the rectangle
     */
    public double getDiagonalLength(){
        return _pointSW.distance(getPointNE());
    }

    /** A Boolean method that accepts a rectangle as a parameter and returns whether the area of the rectangle on which 
     * the method was applied is greater than the area of the rectangle obtained as a parameter. 
     *@param other the rectangle that should be comparable
     *@return true if the area of the rectangle on which 
     * the method was applied is greater than the area of the rectangle obtained as a parameter.
     */
    public boolean isLarger(RectangleA other){
        return (getArea()>other.getArea());
    }

    /**
     * A method that changes the sides of the rectangle so that what was 
     * the width becomes the height, and the
     * height becomes the width. The southwestern point does not change.
     */
    public void changeSides(){
        int temp=_height;
        _height=_width;
        _width=temp;
    }

    /**
     * A Boolean method that receives another rectangle 'r' and returns 'true' if the rectangle 
     * on which the method is run is entirely inside the rectangle 'r'. 
     * (Common ribs are also considered "inside").
     * @return true if the rectangle on which the method is run is entirely inside the rectangle 'r'
     */
    public boolean isIn(RectangleA r){
        // use the methods from Point, The method denies the existence of the 'ne' and 'sw' points around the rectangle 'r'
        boolean notabove=!(getPointNE().isAbove(r.getPointNE()));
        boolean notunder=!(_pointSW.isUnder(r._pointSW));
        boolean notright=!(getPointNE().isRight(r.getPointNE()));
        boolean notleft=!(_pointSW.isLeft(r._pointSW));
        return notabove&&notunder&&notright&&notleft;

    }

    /**
     * A Boolean method that gets another rectangle 'r' and returns 'true' if there is an overlap between the rectangles and 'false' if not.
     * @return true if there is an overlap between the rectangles
     */
    public boolean overlap(RectangleA r){
        Point nw =new Point(r._pointSW.getX(),r.getPointNE().getY());//find the point nw of r
        Point se=new Point (r.getPointNE().getX(),r._pointSW.getY());//find the point se of r
        boolean checkNw=nw.getY()<=getPointNE().getY()&&nw.getY()>=_pointSW.getY()&&nw.getX()<=getPointNE().getX()&&nw.getY()>=_pointSW.getX();//check if  the range of the point nw of r coincides with the range of the rectangle
        boolean checkSe=se.getY()<=getPointNE().getY()&&se.getY()>=_pointSW.getY()&&se.getX()<=getPointNE().getX()&&se.getY()>=_pointSW.getX();//check if  the range of the point se of r coincides with the range of the rectangle
        boolean checkSw=r._pointSW.getY()<=getPointNE().getY()&&r._pointSW.getY()>=_pointSW.getY()&&r._pointSW.getX()<=getPointNE().getX()&&r._pointSW.getX()>=_pointSW.getX();//check if  the range of the point sw of r coincides with the range of the rectangle
        boolean checkNe=r.getPointNE().getY()<=getPointNE().getY()&&r.getPointNE().getY()>=_pointSW.getY()&&r.getPointNE().getX()<=getPointNE().getX()&&r.getPointNE().getY()>=_pointSW.getX();//check if  the range of the point ne of r coincides with the range of the rectangle
        //Check if there is even just  a side in the 'r' rectangle that overlaps with the rectangle
        if (se.getX()==_pointSW.getX()){

            if (r.getPointNE().getY()>getPointNE().getY()&&se.getY()<_pointSW.getY()){
                checkNe=true;
                checkSe=true;
            }
            if (r.getPointNE().getY()>_pointSW.getY()&&se.getY()<_pointSW.getY()){
                checkNe=true;
                checkSe=true;  
            }
            if (r.getPointNE().getY()>getPointNE().getY()&&se.getY()<getPointNE().getY()){
                checkNe=true;
                checkSe=true; 
            }
            if (r.getPointNE().getY()<getPointNE().getY()&&se.getY()>_pointSW.getY()){
                checkNe=true;
                checkSe=true; 
            }            

        }
        if (r._pointSW.getX()==getPointNE().getX()){
            if (nw.getY()>getPointNE().getY()&&r._pointSW.getY()<_pointSW.getY()){
                checkNw=true;
                checkSw=true;
            }
            if (nw.getY()>_pointSW.getY()&&r._pointSW.getY()<_pointSW.getY()){
                checkNw=true;
                checkSw=true;  
            }
            if (nw.getY()>getPointNE().getY()&&r._pointSW.getY()<getPointNE().getY()){
                checkNw=true;
                checkSw=true; 
            }
            if (nw.getY()<getPointNE().getY()&&r._pointSW.getY()>_pointSW.getY()){
                checkNw=true;
                checkSw=true; 
            }            

        }
        if (se.getY()==getPointNE().getY()){
            if (se.getX()<_pointSW.getX()&&r._pointSW.getX()<_pointSW.getX()){
                checkSe=true;
                checkSw=true;
            }
            if (se.getX()>getPointNE().getX()&&r._pointSW.getX()<_pointSW.getX()){
                checkSe=true;
                checkSw=true;                  
            }
            if (se.getX()>getPointNE().getX()&&r._pointSW.getX()<getPointNE().getX()){
                checkSe=true;
                checkSw=true;                
            }
            if (se.getX()<getPointNE().getX()&&r._pointSW.getX()>_pointSW.getX()){
                checkSe=true;
                checkSw=true;                
            }

        }
        if (r.getPointNE().getY()==_pointSW.getY()){
            if (r.getPointNE().getX()<getPointNE().getX()&&r._pointSW.getX()<_pointSW.getX()){
                checkNe=true;
                checkNw=true;
            }
            if (r.getPointNE().getX()>getPointNE().getX()&&r._pointSW.getX()<_pointSW.getX()){
                checkNe=true;
                checkNw=true;                  
            }
            if (r.getPointNE().getX()>getPointNE().getX()&&r._pointSW.getX()<getPointNE().getX()){
                checkNe=true;
                checkNw=true;                
            }
            if (r.getPointNE().getX()<getPointNE().getX()&&r._pointSW.getX()>_pointSW.getX()){
                checkNe=true;
                checkNw=true;                
            }

        }

        return (checkNw||checkNe||checkSe||checkSw);
    }
}
