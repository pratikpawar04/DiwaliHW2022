class CO18
{
        public CO18()
        {
            System.out.println("In default constructor");
        }
        public CO18(int i)
        {
            this();
            System.out.println("In single parameter constructor");
        }
        public CO18(int i,int j)
        {
            this(j);
            System.out.println("In double parameter constructor");
        }
        public static void main(String a[])
		{
           CO18 obj = new CO18(11,12);
        }
}

/*
In default constructor
In single parameter constructor
In double parameter constructor
*/