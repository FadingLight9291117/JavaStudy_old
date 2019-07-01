/**
 * 数组的两种遍历方式
 * for循环和for——each循环
 * @author 车亮召
 */
/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        String[] str = new String[] { "abcd", "efghi", "jklmn" };
        // 普通for循环
        System.out.println("============普通for循环================");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        // for-each循环
        System.out.println("============for-each循环=============");
        for (String item : str) {
            System.out.println(item);
        }
    }
}