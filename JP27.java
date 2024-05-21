/* Down Casting and Up Casting - Type Casting */
class A
{
    public void showA() {
        System.out.println("in class A");
    }
}
class B extends A
{
    public void showB() {
        System.out.println("in class B");
    }
}

public class JP27 {
    public static void main(String[] args) 
    {
        /* Down Casting and Up Casting - Type Casting */
        // A obj = new A();
        // obj.showA();

        // Up-Typecasting
        A objA = (A) new B();
        objA.showA();

        // Down-Typecasting
        B objB = (B) objA;
        objB.showB();
    }
}
