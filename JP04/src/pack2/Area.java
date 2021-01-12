package pack2;

public class Area {
    private float r, A;
    public void setValues ( float R ) {
        r = R;
    }
    public float area () {
        A = 3.14f*r*r;
        return ( A );
    }
}
