class Demo
{

    int a;
     int b;
    static c;
 // static block
      static
      {
        c=5;
        System.out.println("inside the static block");
      }
   //non static block
      {
   
        a=1;
        b=2;
        System.out.println("Inside non static");
	  }
        Demo();
        {
          System.out.println("Inside demo construre");
        }
        static void myFun()
        {
   
         System.out.println("Inside myFun method");
        }
   
         public static void main(String args[])
        {
          myFun();
        }
		
}