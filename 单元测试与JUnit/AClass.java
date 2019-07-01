/**
 * 一个待单元测试的类
 * 
 * @author 车亮召
 */

public class AClass {

    private String str;

    public AClass(String str) {
        this.str = str;
    }

    public boolean put(String str) {
        return this.str.equals(str) ? true : false;
    }
}