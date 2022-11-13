class Outer 
{
    int out= 100;
    void test() 
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner 
    {
        int y = 10; 
        void display() 
        {
            System.out.println("Outer Variable value = " + out);
        }
    }
    void showy() 
    {
        int y = 0;
		System.out.println(y); 
    }
}
class CO3 
{
    public static void main(String args[]) 
    {
        Outer outer = new Outer();
        outer.test();
    }
}
/*
Outer Variable value = 100
*/