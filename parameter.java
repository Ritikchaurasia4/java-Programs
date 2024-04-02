// parameterized constructor

class A{
    int x , y;
    A(int a , int b)
    {
      x = a;
      y = b;
    }
    void show()
    {
        System.out.print(x+" "+y);
    }
}
class parameter{
    public static void main(String[] args)
    {
      A ref = new A(100,200);
      ref.show();
    }
}
