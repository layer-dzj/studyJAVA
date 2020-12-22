import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);   //将Thu Jan 01 08:00:00 CST 1970到现在的时间转换成毫秒
    }

    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);   //将参数的毫秒值转换成Thu Jan 01 08:00:00 CST 1970至毫秒后的时间
    }

    private static void demo01() {
        Date date = new Date();
        System.out.println(date);   //获取当前时间:Mon Dec 21 23:03:58 CST 2020
    }


}
