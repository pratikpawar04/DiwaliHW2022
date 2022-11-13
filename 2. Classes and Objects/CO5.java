public class CO5
{
    static CO5.InnerClass obj;
    void test1()
    {
        System.out.println("Success");
    }
    static public class InnerClass
    {
    	private String name = "Peakit";
        public void test2()
        {
            CO5 outer = new CO5();
            outer.test1();
        }
    }
    public static void main(String[] args)
    {
        obj = new CO5.InnerClass();
        obj.test2();
    }
}

/*
Success
*/