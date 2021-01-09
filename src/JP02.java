// Program to find Area of Rectangular
class Area {
    private int lenth, breadth, area;
    public void SetDimension ( int l, int b ) {
        lenth = l; breadth = b;
        area = lenth*breadth;
    }
    public void ShowData () {
        System.out.println ( "Lenth = "+lenth );
        System.out.println ( "Breadth = "+breadth );
        System.out.println ( "Area = "+area );
    }
}
public class JP02 {
    public static void main( String [] args ) {
        Area a = new Area ();
        a.SetDimension( 5, 7 );
        a.ShowData();
        a = new Area ();
        a.ShowData();
    }
}
