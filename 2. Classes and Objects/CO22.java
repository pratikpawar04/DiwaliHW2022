public class CO22 
{
    static int a = 42;
    int b = 99;
    public static void main (String args[])
    {
		CO22 obj=new CO22();
        System.out.println("static variable:" + a);
        System.out.println("non static variable:" +obj.b);
    }
}
/*
static variable:42
non static variable:99
*/