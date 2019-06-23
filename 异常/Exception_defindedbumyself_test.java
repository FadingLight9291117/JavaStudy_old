/**
 * Exception_defindedbumyself_test
 */
public class Exception_defindedbumyself_test extends Exception {
    public Exception_defindedbumyself_test() {
        super();
    }

    public Exception_defindedbumyself_test(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        try {
            throw new Exception_defindedbumyself_test("这是一个自定义异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}