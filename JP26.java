class Mobile
{
    String name;
    int price;

    /* AI way written by IDE */
    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     result = prime * result + price;
    //     return result;
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Mobile other = (Mobile) obj;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }

    /* Custom way written by user */
    public String toString() 
    {
        return name + ": " + price;
    }

    public boolean equals(Mobile that) {
        return this.name.equals(that.name) && this.price == that.price;
    }    
}

public class JP26 {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.name = "Samsung";
        obj.price  = 300000;
        Mobile obj1 = new Mobile();
        obj1.name = "Samsung";
        obj1.price  = 3010000;
        boolean result = obj.equals(obj1);
        System.out.println(obj1);
        System.out.println(result);
    }
}
