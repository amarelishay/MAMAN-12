
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String [] args)
    {
        Point p1=new Point (6,5);
        Point p2=new Point(p1);
        System.out.println("p1:"+p1+", p2:"+p2);
        System.out.println("p1-x:"+p1.getX()+",p1-y:"+p1.getY()+",p2-x:"+p2.getX()+",p2-y:"+p2.getY());
        p1.setX(7);
        p1.setY(12);
        System.out.println("p1:"+p1.toString()+" ,p2:"+p2);
        System.out.println(p1.equals(p2));
        p1.setX(6);
        p1.setY(5);        
        System.out.println(p1.equals(p2));
        p1.setX(7);
        p1.setY(12); 
        System.out.println(p1.isAbove(p2));
        System.out.println(p1.isUnder(p2));
        System.out.println(p1.isLeft(p2));
        System.out.println(p1.isRight(p2));
        p1.move(1,1);
        p2.move(1,1);
        System.out.println("p1:"+p1.toString()+" ,p2:"+p2);
        System.out.println(p1.distance(p2));
        
        
        
        
        
        
    }
    
}
