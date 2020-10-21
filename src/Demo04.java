public class Demo04 {
    public static void main(String[] args) {
        System.out.println(biJiao(4,6));
        System.out.println(biJiao(4,4));
    }
    public static boolean biJiao(int a,int b){
        //方法1：
        /**     boolean a;
         *      if(a==b){
         *          a=true;
         *      }else{
         *          a=false;
         *      }
         */
        //方法2：
        /**     boolean a;
         *      a = a == b ? true :false;
         */
        //方法3：
        /**     boolean a = a == b;
         *
         */
        return a ==b;
    }
}
