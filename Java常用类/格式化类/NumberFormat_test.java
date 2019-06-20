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

        System.out.println("=================");

        double pi = 3.1415926;
        // 取一位整数
        System.out.println(new DecimalFormat("0").format(pi));
        // 取一位整数和两位小数
        System.out.println(new DecimalFormat("0.00").format(pi));
        // 取两位整数和三位小数,整数不足一0填补
        System.out.println(new DecimalFormat("00.000").format(pi));
        // 取所有整数部分
        System.out.println(new DecimalFormat("#").format(pi));
        // 以百分比方式计数，并取两位小数
        System.out.println(new DecimalFormat("0.##%").format(pi / 100));

        long c = 299792458;
        // 显示为科学计数法，并取五位小数
        System.out.println(new DecimalFormat("0.00000E0").format(c));
        // 显示为两位整数的科学计数法，并取四位小数
        System.out.println(new DecimalFormat("00.0000E0").format(c));
        // 每三位以逗号进行分隔
        System.out.println(new DecimalFormat(",###").format(c));
        // 将格式化数字嵌入文本
        System.out.println(new DecimalFormat("光速的大小为,###m/s").format(c));
    }
}