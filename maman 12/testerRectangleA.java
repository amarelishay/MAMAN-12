
/**
 * Write a description of class testerRectangleA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testerRectangleA
{
    public static void main (String [] args)
    {
        RectangleA  r1 =new RectangleA(5,9);
        System.out.println(r1);
        Point p =new Point (7,8);
        RectangleA  r2 =new RectangleA(p,8,6);
        System.out.println(r2);
        Point p2=new Point(14,19);
        RectangleA  r3 =new RectangleA(p,p2);
        System.out.println(r3);
        RectangleA  r4 =new RectangleA(r2);
        System.out.println(r4);
        System.out.println("width:"+r1.getWidth()+","+"width:"+r2.getWidth()+","+"width:"+r3.getWidth()+","+"width:"+r4.getWidth()+",");
        System.out.println("height:"+r1.getHeight()+","+r2.getHeight()+","+r3.getHeight()+","+r4.getHeight());
        r4.setPointSW(p2);
        System.out.println(r4);
        System.out.println(r4.getPointSW());
        r4.setWidth(65);
        System.out.println(r4);
        r4.setHeight(40);
        System.out.println(r4);
        System.out.println(r1.getPerimeter());//28
        System.out.println(r1.getArea());//45
        r1.move(5,6);
        System.out.println(r1);
        Point p3 =new Point(0,0);
        RectangleA r5=new RectangleA(p3,5,9);
        System.out.println(r1.equals(r5));
        p3.move(5,6);
        r5.setPointSW(p3);
        System.out.println(r1.equals(r5));
        System.out.println(r1.getDiagonalLength());
        System.out.println(r4.isLarger(r1));
        System.out.println(r5.getPointNE());
        r5.changeSides();
        System.out.println(r5);
        Point p4 =new Point(2,6);
        r1.setPointSW(p4);
        System.out.println("r1"+r1);
        r1.setHeight(6);
        r1.setWidth(6);
        System.out.println("r1"+r1);
        Point p5 =new Point(3,9);
        r2.setPointSW(p5);
        r2.setHeight(2);
        r2.setWidth(3);
        System.out.println("r2 "+r2);
        System.out.println(r2.isIn(r1));
        p5 =new Point(8,2);
        r2.setHeight(3);
        r2.setWidth(3);
        r2.setPointSW(p5);
        System.out.println(r2.isIn(r1));
        Point p6=new Point(1,1);
        RectangleA r6 =new RectangleA(p6,1,1);
        Point p7=new Point(0,0);
        RectangleA r7 =new RectangleA(1,1);
        System.out.println(r7.overlap(r6));
       
        
    }
}
