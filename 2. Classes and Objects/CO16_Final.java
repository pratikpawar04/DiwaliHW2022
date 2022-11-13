class Figure
{
	final int length = 5;
    final int bredth = 4;
    final void area()
    {
        int a = length * bredth;
        System.out.println("Area:"+a);
    }
}
class CO16_Rectangle extends Figure
{
    final void rect()
    {
        System.out.println("This is rectangle");
    }
}
final class CO16_Final extends CO16_Rectangle
{
    public static void main(String[] args) 
    {
        CO16_Final obj = new CO16_Final();
        obj.rect();
        obj.area();
    }
}

/*

This is rectangle
Area:20

*/

