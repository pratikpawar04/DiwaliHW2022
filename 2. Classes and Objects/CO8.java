public class CO8
{
    static int count=0;
     CO8()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        CO8 obj1 = new CO8();
        CO8 obj2 = new CO8();
        CO8 obj3 = new CO8();
        CO8 obj4 = new CO8();
        System.out.println("Number of objects created:"+count);
    }
}

/*
Number of objects created:4
*/