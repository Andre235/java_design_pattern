package 七大原则.Test;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : Jeffersonnn
 * @date : 2020/3/15
 * @description : 用位移运算符求两个数中较大的那个数
 */
public class Test {
    public static void main(String[] args) {
        // System.out.println(getMaxNum(11, 20));
        int[] arr = new int[]{1,2,3};
        System.out.println(arr.length);
        Hashtable<String, String> stringStringHashtable = new Hashtable<>();
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
    }

    /**
     * @param num
     * @return num的最低位进行异或运算
     */
    private static int xor(int num){
        return num ^ 1;
    }

    /**
     * int数据类型 >> 31位计算出符号位（二进制中符号位0表示正数，符号位1表示负数）
     * @param num
     * @return 正数或者0返回1，负数返回0
     */
    private static int flip(int num){
        return xor((num >>31) & 1);
    }

    /**
     * @param a
     * @param b
     * @return 求两个数的最大值
     */
    private static int getMaxNum(int a,int b){
        int c = a - b;
        // 计算c的符号位；
        int sgA = flip(c);
        // 计算与c相反的符号位
        int sgB = xor(sgA);
        return a * sgA + b * sgB;
    }

}
