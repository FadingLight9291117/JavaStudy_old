import java.text.DecimalFormat;

/**
 * 数字格式化类
 */
public class NumberFormat_test {

    public static void main(String[] args) {
        DecimalFormat df1, df2;

        System.out.println("整数部分为0的情况，0/#的区别");
        // 整数部分为0，#认为整数不存在，可不写；0认为没有，但至少写一位，写0
        df1 = new DecimalFormat("#.00");
        df2 = new DecimalFormat("0.00");

        System.out.println(df1.format(0.1));
        System.out.println(df2.format(0.1));

        System.out.println("小数部分0/#的区别");
        // #代表最多有几位，0代表必须有且只有几位
        df1 = new DecimalFormat("0.00");
        df2 = new DecimalFormat("0.##");

        System.out.println(df1.format(0.1));
        System.out.println(df2.format(0.1));

        System.out.println(df1.format(0.006));
        System.out.println(df2.format(0.006));

        // 1,232,132格式
        double f = 1232132;
        DecimalFormat df3 = new DecimalFormat(",###");
        System.out.println(df3.format(f));
    }
}