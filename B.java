// constructor 

class A{
    int a ;
    String b;
    A()
    {
      a = 10;
      b = "Ritik Rahul";
    }
    void show()
    {
        System.out.print(a+" "+b);
    }
}
class B{
    public static void main(String[]args)
    {
        A r = new A();
        r.show();

    }
}