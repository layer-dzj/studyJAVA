public class Demo05 {
    public static void main(String[] args) {
        System.out.println("结果是：" + getSum());
    }
    public static int getSum(){
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            a += i;
        }
        return a;
    }

}
