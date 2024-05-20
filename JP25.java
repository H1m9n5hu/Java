// class Calc 
// {
//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }
//     public int sub(int n1, int n2) {
//         return n1 - n2;
//     }
// }

// class AdvanceCalc extends Calc
// {
//     public int mult(int n1, int n2) {
//         return n1 * n2;
//     }
//     public int div(int n1, int n2) {
//         return n1 / n2;
//     }
// }

// class VeryAdvCalc extends AdvanceCalc
// {
//     public int power(int n1, int n2) {
//         return (int)Math.pow(n1, n2);
//     }
// }

// class  A
// {
//     public A()
//     {
//         System.out.println("in class A");
//     }
//     public A(int n)
//     {
//         System.out.println("in class A with int");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         super(10);
//         System.out.println("in class B");
//     }
//     public B(int n)
//     {
//         // super(10);
//         this();
//         System.out.println("in class C with int");
//     }
// }

/* Method Overriding */
class A
{
    public void show() {
        System.out.println("In class A");
    }
    public void name() {
        System.out.println("My name is Himanshu.");
    }
}

class B extends A
{
    public void show() {
        System.out.println("In class B");
    }
}

public class JP25 {
    public static void main(String[] args) {
        // Calc obj = new Calc();
        // int totalSum = obj.add(10, 20);
        // int totalSub = obj.sub(30, 15);
        // System.out.println("Sum is " + totalSum + "\nSub is " + totalSub);

        /* Single Level Inheritance */
        // AdvanceCalc obj = new AdvanceCalc();
        // int totalSum = obj.add(7, 5);
        // int totalSub = obj.sub(7, 5);
        // int totalMult = obj.mult(7, 5);
        // int totalDiv = obj.div(34, 5);
        // System.out.println("Sum is " + totalSum + "\nSub is " + totalSub + "\nMultiply is " + totalMult + "\nDivide is " + totalDiv);

        /* Multi Level Inheritance */
        // VeryAdvCalc obj = new VeryAdvCalc();
        // int totalSum = obj.add(7, 5);
        // int totalSub = obj.sub(7, 5);
        // int totalMult = obj.mult(7, 5);
        // int totalDiv = obj.div(34, 5);
        // int power = obj.power(4, 2);
        // System.out.println("Sum is " + totalSum + "\nSub is " + totalSub + "\nMultiply is " + totalMult + "\nDivide is " + totalDiv + "\nPower is " + power);

        /* Use of super and this keyword */
        // B obj = new B();
        // B obj = new B(7);

        /* Method Overriding */
        B obj = new B();
        obj.show();
        obj.name();

    }
}
