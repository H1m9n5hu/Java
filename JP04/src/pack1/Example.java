package pack1;
import pack2.Area;

public class Example {
    public static void main ( String [] args ) {
        Area a = new Area();
        a.setValues ( 7.0f );
        System.out.println( "Area of circle is "+a.area() );
    }
}
