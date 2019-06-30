/**
 * 这个类测试函数定义时Throws的用法
 * Throws
 * 
 * @author 车亮召
 * 
 * 
 */
public class Throws_test {

    public static void fun() throws ArithmeticException {
        int a = 1;
        a /= 0;
        System.out.println(a);
    }

    public static void main(String[] args) {
        try {
            Throws_test.fun();
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("异常是：" + e.getMessage());
            System.out.println(e.toString());
        }
    }
}