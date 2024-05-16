
// {
//     int count = 7;
//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }
//     /* Method Overloading */
//     public int add(int n1, int n2, int n3) {
//         return n1 + n2 + n3;
//     }
//     public int multiply(int n1, int n2) {
//         return n1 * n2;
//     }
// }

// class Student
// {
//     String name;
//     int age;
// }

// class Mobile {
//     String brandName;
//     int price;
//     static String typeOfMobile;

//     public Mobile() {
//         brandName = "";
//         price = 200000;
//         System.out.println("It is a Constructor");
//     }

//     static {
//         typeOfMobile = "Android";
//         System.out.println("It is Static Block");
//     }

//     public void show(){
//         System.out.println("Brand : " + brandName + "\n" + "Price : " + price + "\n" + "Type : " + typeOfMobile);
//     }

//     public static void showStaticData(Mobile obj){
//         System.out.println("Brand : " + obj.brandName + "\n" + "Price : " + obj.price + "\n" + "Type : " + typeOfMobile);
//     }
// }

/* Encapsulation by using class */
// class Human {
//     private String name;
//     private int age;

//     public String getName() {
//         return name;
//     }
//     // public void setName(String n) {
//     //     name = n;
//     // }
//     // public void setName(String name, Human obj) {
//     //     obj.name = name;
//     // }
//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }
//     // public void setAge(int a) {
//     //     age = a;
//     // }
//     // public void setAge(int age, Human obj) {
//     //     obj.age = age;
//     // }
//     public void setAge(int age) {
//         this.age = age;
//     }
// }

/* Constructor */
// class Human {
//     private String name;
//     private int age;

//     public Human() // Default constructor
//     {
//         name = "Himanshu Singh";
//         age = 23;
//     }
//     public Human(String name, int age) // Parameterized constructor
//     {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
// }

class A
{
    public A() {
        System.out.println("Constructor is created.");
    }

    public void show(){
        System.out.println("Hello world!");
    }
}

public class JP24
{
    public static void main(String[] args) 
    {
        // int a = 7;
        // int b = 8;
        // int sum = a + b;
        // System.out.println(sum);

        // int salary = 4_50_000;
        // int bonus = 150000;
        // int total = salary + bonus;
        // System.out.println(total);

        // int a = 15;
        // byte b = (byte)a;
        // float c = 5.7f;
        // int d = (int)c;

        // int a = 9;
        // a += 3;

        // int a = 10;
        // int b = 15;
        // float x = 7.5f;
        // float y = 9.5f;

        // boolean result = a <= b && x >= y;

        // int num = 21;
        // if(num%2 == 0) System.out.println(num + " is a even number");
        // else System.out.println(num + " is a odd number");

        // int a = 11, b = 14, c = 7;
        // if(a > b && a > c) System.out.println(a + " is the largest number");
        // else if(a < b && b > c) System.out.println(b + " is the largest number");
        // else if(c > a && c > b) System.out.println(c + " is the largest number");

        // int num = 7;
        // boolean flag = num%2 == 0? true: false;
        // if(flag) System.out.println(num + " is a even number");
        // else System.out.println(num + " is a odd number");

        // int day = 7;
        // switch(day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        // }

        // String day = "Tuesday";
        // switch(day){
        //     case "Saturday", "Sunday":
        //         System.out.println("You can walk up till 10:00 AM");
        //         break;
        //     case "Monday":
        //         System.out.println("You can walk up till 8:00 AM");
        //         break;
        //     default:
        //         System.out.println("You must walk up at 6:00 AM");
        // }

        // String day = "Saturday";
        // switch(day){
        //     case "Saturday", "Sunday"->
        //         System.out.println("You can walk up till 10:00 AM");
        //     case "Monday"->
        //         System.out.println("You can walk up till 8:00 AM");
        //     default->
        //         System.out.println("You must walk up at 6:00 AM");
        // }

        // String day = "Monday";
        // String time = "";
        // switch(day){
        //     case "Saturday", "Sunday"-> time = "10:00 AM";
        //     case "Monday"-> time = "8:00 AM";
        //     default-> time = "6:00 AM";
        // }
        // System.out.println("Today, you walked up at " + time);

        // String day = "Sunday";
        // String time = "";
        // time = switch(day){
        //     case "Saturday", "Sunday"-> "9:00 AM";
        //     case "Monday"-> "8:00 AM";
        //     default-> "6:00 AM";
        // };
        // System.out.println("Today, you walked up at " + time);

        // String day = "Friday";
        // String time = "";
        // time = switch(day){
        //     case "Saturday", "Sunday": yield "9:00 AM";
        //     case "Monday": yield "8:00 AM";
        //     default: yield "6:00 AM";
        // };
        // System.out.println("Today, you walked up at " + time);

        // int num = 1;
        // while(num <= 100){
        //     System.out.print(num+" ");
        //     num++;
        // }

        // int num = 1;
        // do {
        //     System.out.print(num+" ");
        //     num++;
        // } while(num <= 100);

        // for(int i = 1; i <= 100; i++) {
        //     if(i%2 == 0) continue;
        //     System.out.print(i + " ");
        // }

        /* Class */
        // int num1 = 7, num2 = 8, num3 = 9;

        /* Creating a Object */
        // Calculator obj = new Calculator();
        // int a = obj.add(num1, num2, num3);
        // int b = obj.add(num1, num2);
        // int c = obj.multiply(num1, num3);
        // System.out.println("Sum of " + num1 + " and " + num2 + " is " + b);
        // System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + " is " + a);
        // System.out.println("Multiply of " + num1 + " and " + num3 + " is " + c);
        // System.out.println(obj.count);
        // obj.count = 21;
        // System.out.println(obj.count);
        
        /* Array */

        // int num[] = {1,2,3,4,5,6,7,8};
        // for(int i = 0; i < num.length; i++) {
        //     System.out.print(num[i] + " ");
        // }

        // int num[] = new int[5];
        // for(int i = 0; i < num.length; i++) {
        //     num[i] = i+1;
        // }
        // for(int n: num) {
        //     System.out.print(n + " ");
        // }

        /* Multi-Dimensional Array */
        // int matrix[][] = new int[4][5];
        // for (int i = 0; i < 4; i++) {
        //     for(int j = 0; j < 5; j++) {
        //         matrix[i][j] = (int)(Math.random()*10);
        //     }
        // }

        // for(int i = 0; i < 4; i++) {
        //     for(int j = 0; j < 5; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Another to print multi-dimensional array
        // for(int n[]: matrix) {
        //     for(int m: n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        /* Jagged Array */

        // int jaggedArray[][] = new int[4][];
        // jaggedArray[0] = new int[2];
        // jaggedArray[1] = new int[3];
        // jaggedArray[2] = new int[4];
        // jaggedArray[3] = new int[5];

        // for(int i = 0; i < jaggedArray.length; i++) {
        //     for(int j = 0; j < jaggedArray[i].length; j++) {
        //         jaggedArray[i][j] = (int)(Math.random()*10);
        //     }
        // }

        // for(int n[] : jaggedArray) {
        //     for(int m: n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        /* 3D Array */

        // int arr[][][] = new int[2][2][2];
        // for(int i = 0; i < 2; i++) {
        //     for(int j = 0; j < 2; j++) {
        //         for(int k = 0; k < 2; k++) {
        //             arr[i][j][k] = (int)(Math.random()*10);
        //         }
        //     }
        // }
        // for(int n[][] : arr) {
        //     for(int m[] : n) {
        //         for(int p: m) {
        //             System.out.print(p + " ");
        //         }
        //     }
        // }

        /* Create new array by using object */
        // Student s1 = new Student();
        // Student s2 = new Student();
        // Student s3 = new Student();
        // Student s4 = new Student();

        // s1.name = "Himanshu";
        // s1.age = 23;

        // s2.name = "Sakshi";
        // s2.age = 22;

        // s3.name = "Haneenah";
        // s3.age = 23;

        // s4.name = "Sanya Malhotra";
        // s4.age = 31;

        // Student arr[] = new Student[4];
        // arr[0] = s1;
        // arr[1] = s2;
        // arr[2] = s3;
        // arr[3] = s4;

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i].name + " : " + arr[i].age);
        // }

        // for(Student s: arr) {
        //     System.out.println(s.name + " : " + s.age);
        // }

        // String name = "Himanshu";
        // String name = new String("Himanshu");
        // System.out.println(name);
        // System.out.println(name.charAt(3));
        // System.out.println(name.concat(" Singh"));

        // StringBuffer name = new StringBuffer("Himanshu");
        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name.capacity());
        // name.deleteCharAt(3);
        // name.insert(7, " Singh");
        // System.out.println(name);
        // name.ensureCapacity(100);
        // System.out.println(name.capacity());

        /* Use of static Keyword */

        // Class.forName("Mobile"); // throws ClassNotFoundException - Use it after the main function to execute this line.

        // Mobile obj1 = new Mobile();
        // obj1.brandName = "Samsung Fold Z5";
        // obj1.price = 175000;

        // Mobile obj2 = new Mobile();
        // obj2.brandName = "Apple iPhone 15 Ultra Pro";
        // obj2.price = 300000;

        // Mobile.typeOfMobile = "Touchscreen";

        // obj1.show();
        // obj2.show();

        // Mobile.showStaticData(obj2);

        /* Encapsulation in OOPs */
        // Human obj = new Human();
        // obj.setName("Himanshu");
        // obj.setAge(23);
        // obj.setName("Himanshu", obj);
        // obj.setAge(23, obj);
        // obj.setName("Himanshu");
        // obj.setAge(23);
        // System.out.println(obj.getName() + " : " + obj.getAge());

        /* Constructor */
        // Human obj = new Human();
        // Human obj1 = new Human("Sakshi", 22);
        // System.out.println(obj.getName() + " : " + obj.getAge());
        // System.out.println(obj1.getName() + " : " + obj1.getAge());

        /* Anonomous Object */
        new A();
        new A().show();

    }
}