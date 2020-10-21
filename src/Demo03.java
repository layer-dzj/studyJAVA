public class Demo03 {
    public static void main(String[] args) {
        canShu1();
        canShu2(4,5);
    }
    public static void canShu1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("方法" + i);
        }
    }
    public static void canShu2(int a,int b){
        int result = a + b;
        System.out.println(result);
    }
}
