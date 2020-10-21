public class Demo06 {
    public static void main(String[] args) {
        daYin(6);
    }
    //打印指定次数的hello，world!
    public static void daYin(int a){
        for (int i = 1;i <= a;i++){
            System.out.println("hello,world!" + i);
        }
    }
}
