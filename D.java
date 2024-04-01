// 1. default constructor
class C {
    int a;
    String b;
    Boolean c;
    C()
    {
      a = 10;
      b = "Bansal Institute of engineering and technology";
    }
    void show()
    {
        System.out.println(a + " " + b + " " + c);
    }
}
class D{
    public static void main(String[] args)
    {
        C r = new C();
        r.show();
        // System.out.print(r.c);
    }
}