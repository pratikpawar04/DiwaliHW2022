abstract class Operations
{
    float a = 12, b = 6, c;
    abstract void add();
    void subtract()
    {
        c = a - b;
        System.out.println("Result:"+c);
    }
    abstract void multiply();
    void divide()
    {
        c = a / b;
        System.out.println("Result:"+c);
    }
}
public class CO1 extends Operations
{
    
    void add()
    {
        c = a + b;
        System.out.println("Result:"+c);
    }
    
    void multiply()
    {
        c = a * b;
        System.out.println("Result:"+c);
    }
    public static void main(String[] args)
    {
        CO1 obj = new CO1();
		System.out.print("Addition : ");
        obj.add();
		System.out.println();
		System.out.print("Substraction : ");
        obj.subtract();
		System.out.println();
		System.out.print("Multiplication : ");
        obj.multiply();
		System.out.println();
		System.out.print("Division : ");
        obj.divide();
		System.out.println();
    }
}


/*
Addition : Result:18.0

Substraction : Result:6.0

Multiplication : Result:72.0

Division : Result:2.0

*/