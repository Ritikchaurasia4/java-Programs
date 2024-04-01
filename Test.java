// object and class
class Demo{
    int a = 10;
    String b = "Ritik";
    void show()
    {
        System.out.print(a+" "+b);
    }
}
class Test{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.show();
    }
}