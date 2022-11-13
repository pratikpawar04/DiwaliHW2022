public class CO23
{
    int x = 17;
    public static void main(String...a)
    {
        //System.out.println(x);  Error 
        // non static variable can be called only after making objects
        CO23 ob = new CO23();
        System.out.println(ob.x);
    }
}
/*
17
*/