abstract class Calculation
{
    float a = 12, b = 6, c;
    abstract void add();
    void subtract()
    {
        c = a - b;
        System.out.println("substract:"+c);
    }
    abstract void multiply();
    void divide()
    {
        c = a / b;
        System.out.println("divide:"+c);
    }
}
public class CO2 extends Calculation
{
    void add()
    {
        c = a + b;
        System.out.println("add:"+c);
    }
    void multiply()
    {
        c = a * b;
        System.out.println("multiply:"+c);
    }
    public static void main(String[] args)
    {
        CO2 obj = new CO2();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}
/*
add:18.0
substract:6.0
multiply:72.0
divide:2.0

*/