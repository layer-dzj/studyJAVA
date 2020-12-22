package Demo01;

import java.util.Objects;

public class Demo01 {
    public static void main(String[] args) {
        Person p1 = new Person("可莉", 6);
        Person p2 = new Person("七七", 7);

        boolean b = p1.equals(p2);
        System.out.println(b);

        String str1 = "abc";
        String str2 = null;
        boolean c = Objects.equals(str1, str2);
        System.out.println(c);

    }

}
