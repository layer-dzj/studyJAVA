public class Demo02 {
    public static void main(String[] args) {
        sum1(6 ,7);//没有返回值
        System.out.println("=========");
        //有返回值
        sum2(9,9);
        System.out.println("=========");
        int num = sum2(9,10);
        System.out.println("返回值的值为：" + num);
        System.out.println("=========");
        System.out.println(sum2(9,11));

    }
    public static void sum1(int a,int b){
        int result = a + b;
        System.out.println("方法已调用。");
    }
    public static int sum2(int a,int b){
        int result = a +b;
        System.out.println("方法已调用。。");
        return result;
    }
}
