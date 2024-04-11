class A{
    int a; String b;
    A()
    {
     a = 10;
     b = "Ritik";
     System.out.print(a+" "+b);
    }
    A(A ref)    // Here we pass the object reference to the constructor
    {
        a = ref.a;
        b = ref.b;
        System.out.print(a+" "+b);
    }
}
class copy{
    public static void main(String[] args)
    {
        A r = new A();
        A r1 = new A(r);
    }
}