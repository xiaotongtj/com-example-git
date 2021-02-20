package binary;

/**
 * 进制转换
 *  二进制 ： 逢二进一
 *  十进制 ： 逢十进一
 *  八进制 ： 逢八进一 0开头
 *  十六进制：逢十六进一 0X或0x开头
 *
 * 二进制转换为十进制
 *       -----------------------------------------------
 *      | 2^7 | 2^6 | 2^5 | 2^4 | 2^3 | 2^2 | 2^1 | 2^0 |
 *       -128---64----32----16-----8-----4-----2-----1---
 *
 *   20 -> 00010100
 *   37 -> 00100101
 *   568-> 10 0011 1000
 *
 *   111_0010
 *
 * 十进制转换为八进制
 *      ------------------------------------------------------
 *      |   2^7  | 2^6   | 2^5  | 8^4 | 8^3 | 8^2 | 8^1 | 8^0 |
 *      -16777216--209715--32768--4096--512----64----8-----1--
 *
 * 十进制转换为十六进制
 *      ----------------------------------------------------------------------
 *      |   16^7    |   16^6  |   16^5   | 16^4  | 16^3  | 16^2 | 16^1 | 16^0 |
 *      --268435456---16777216---1048576---65536---4096----256----16------1---
 *
 * 二进制转换为八进制 （三个一位）
 *  10_010_110     --> 0226 （八进制转换为二进制，就把每一位拆成3位）
 *
 * 二进制转换为十六进制 （四个一位）
 *  1_0101_1010    -->  0X15A （十六进制转换为二进制，就把每一位拆成4位）
 *
 *
 * 符号位：将最高为作为符号位用来代表正数和负数
 *      0：正数
 *      1：负数
 *
 * 二进制的整数有如下三种形式：
 *  原码：直接将一个数值换成二进制数。最高位是符号位
 *  负数的反码：是对原码按位取反，只是最高位(符号位)确定为1
 *  负数的补码：其反码加1
 *
 * 计算机以二进制补码的形式保存所有的整数
 *  正数的原码、反码、补码都相同
 *  负数的补码是反码+1
 * 计算机底层都是按照补码的方式进行存储数据的
 *
 *  ---------------------------------
 *  | 0 | 0 | 1 | 1 | 0 | 0 | 0 | 1 |    --> 正49
 *  ---------------------------------
 *  | 1 | 0 | 1 | 1 | 0 | 0 | 0 | 1 |    --> 原码 -49    （自己计算都是按照原码运算）
 *  --------------------------------- ^
 *  | 1 | 1 | 0 | 0 | 1 | 1 | 1 | 0 | |  --> 反码（除最高为外，其它位取反）
 *  --------------------------------- |
 *  | 1 | 1 | 0 | 0 | 1 | 1 | 1 | 1 | |  --> 补码（反码 + 1） (计算机存储的是补码)前面都是1
 *  ---------------------------------
 *
 *
 * 位运算符
 *
 *  &       与运算         6 & 3 = 2                       有一个为0就是0
 *  |       或运算         6 | 3 = 7                       有一个为1就是1
 *  ^       异或运算       6 ^ 3 = 5                        相同为0不同为1
 *  ~       取反运算       ~ 6 = -7
 *  <<      左移          3<<2 = 12 (3 * 2 * 2 = 12)
 *  >>      右移          3>>1 = 1 (3/2 = 1)
 *  >>>     无符号右移     3>>1 = 1 (3/2 = 1)
 *
 *
 *
 *
 * 总结：5，3点
 *
 *
 */
public class BinaryDemo {

    public static void main(String[] args) {
        System.out.println("==========binary to ten================");
        System.out.println(Integer.toBinaryString(49)); //00010100
        System.out.println(Integer.toBinaryString(-49)); //00010100
        System.out.println("==========ten to binary================");
        System.out.println(Integer.parseInt("1110010", 2)); //114


        System.out.println("=======================================");

        System.out.println(3<<2); // 3 * 2^2
        System.out.println(3<<3); // 3 * 2^3
        System.out.println(3<<4); // 3 * 2^4

        System.out.println(16>>2); // 16 / 2^2
        System.out.println(16>>3); // 16 / 2^3
        System.out.println(16>>4); // 16 / 2^4

        System.out.println(16>>>2); // 16 / 2^2
        System.out.println(16>>>3); // 16 / 2^3
        System.out.println(16>>>4); // 16 / 2^4

        int a = 10, b=20;

        a = (a^b)^a;
        b = (a^b)^b;
        System.out.println(a+"--"+b);

        System.out.println(8&1);   //判断奇偶，1 表示奇数 0 表示偶数

    }

}
