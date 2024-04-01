import java.util.*;
public class Stringbuilder {
    public static void main(String[]args)
    {
        StringBuilder sb = new StringBuilder("RitikChaurasia");
//        System.out.print(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(4)); // .charAt(index)

        sb.setCharAt(0,'u'); // .setCharAt()
        System.out.println(sb);

        sb.insert(0,'s');    // .insert(index,'char')
        System.out.println(sb);

        sb.delete(1,2);               // .delete(start,end)
        System.out.println(sb);

        sb.append('b');
        System.out.print(sb);
    }

}
