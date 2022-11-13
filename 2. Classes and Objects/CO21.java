 class Parent
 {
     Parent(int a, int b)
     {
         System.out.println(" the super class constructor");
          int z = a + b;
         System.out.println("the super class method ");
         System.out.println("the sum is "+z);
     }
 }
class CO21 extends Parent
{
    CO21(int x)
    {
        super(12, 20);
        System.out.println("the sub class constructor ");
        System.out.println(x);
    }
    public static void main(String ... a)
     {
        CO21 obj = new CO21(10);
     }
}
/*
 the super class constructor
the super class method
the sum is 32
the sub class constructor
10
*/