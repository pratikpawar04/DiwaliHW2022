import java.util.*;
public class CO9 
{
    int length, breadth, area;
    CO9 area1(CO9 object1)
    {
        object1 = new CO9();
        object1.length = this.length;
        object1.breadth = this.breadth;
        object1.area = object1.length * object1.breadth;
        return object1;
    }
    CO9 area2(CO9 object2)
    {
        object2 = new CO9();
        object2.length = this.length + 5;
        object2.breadth = this.breadth + 6;
        object2.area = object2.length * object2.breadth;
        return object2;
    }
    public static void main(String[] args) 
    {
         CO9 obj = new CO9();
         Scanner s = new Scanner(System.in);
         System.out.print("Enter length:");
         obj.length = s.nextInt();
         System.out.print("Enter breadth:");
         obj.breadth = s.nextInt(); 
         CO9 a = obj.area1(obj);
         CO9 b = obj.area2(obj);
         System.out.println("Area:"+a.area);
         System.out.println("Area:"+b.area);
    }
}

/*
Enter length:20
Enter breadth:30
Area:600
Area:900
*/