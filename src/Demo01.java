public class Demo01 {
    public static void main(String[] args) {
        //直接调用
        sum(13,12);
        System.out.println("=========");
        //打印调用
        System.out.println(sum(15,20));
        System.out.println("=========");
        //赋值调用
        int a = sum(2,3);
        System.out.println(a);
    }
    public static int sum(int a, int b){
        System.out.println("方法已调用");
        int total = a + b;
        return total;
    }
}
