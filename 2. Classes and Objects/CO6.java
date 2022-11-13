class BankAcct 
{
    int principal = 500, rate = 10, time = 3;
    void test() 
    {
        Interest inner_obj = new Interest();
        inner_obj.display();
    }
    class Interest 
    {
        void display() 
        {
            int si = (principal * rate * time) / 100;
            System.out.println("Interest : " + si + " Rs");
        }
    }
}
public class CO6

{
    public static void main(String args[]) 
    {
        BankAcct outer_obj = new BankAcct();
        outer_obj.test();
    }
}
/*
Interest : 150 Rs
*/