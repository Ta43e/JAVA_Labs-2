package basejava;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Boolean.valueOf;
import static java.lang.Math.log;
import static java.lang.Math.*;
/**
 * @autor Oleg Kozak
 * @version 1.0
 */
public class JavaTest {
    /** Поле константа */
    public final int CONSTANTA1 = 12;

    /** Поле статическая константа */
    public static final int CONSTANTA2 = 31;
    /** Поле статическая переменная */
    public static int sint;
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        //b
        char Char = 'A';
        int Int = 12;
        short Short = 15;
        byte Byte = 10;
        long Long = 21;
        boolean Boolean = false;
        System.out.println("Char = " + Char);
        System.out.println("Int = " + Int);
        System.out.println("Short = " + Short);
        System.out.println("Byte = " + Byte);
        System.out.println("Long = " + Long);
        System.out.println("Boolean = " + Boolean);
        String str = "Kozak Oleg";
        Double dd = 12.2;
        System.out.println(str + Int);
        System.out.println(str + Char);
        System.out.println(str + dd);
        Byte += Int;
        Int = (int) (dd + Long);
        Long =  Int + 2147483647L;
        System.out.println("Byte = " + Byte);
        System.out.println("Int = " + Int);
        System.out.println("Long = " + Long);
        System.out.println("Sint = " + sint);
        Boolean = Boolean && Boolean;
        Boolean = Boolean ^ Boolean;
        //Boolean = Boolean + Boolean; нельзя
        long BigNum = 9_223_372_036_854_775_807L;
        long BigNum2 = 0x7fff_ffff_fffL;
        System.out.println("BigNum: "  + BigNum);
        System.out.println("BigNum2: " + BigNum2);
        char Char1 = 'a';
        char Char2 = '\u0061';
        char Char3 = 97;
        Char1 = (char) (Char1 + Char2 + Char3);
        System.out.println(Char1);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        //c
        System.out.println(CONSTANTA2);
        //d
        System.out.println(PI);
        System.out.println(E);
        System.out.println(round(PI));
        System.out.println(round(E));
        System.out.println(round(min(PI, E)));
        System.out.println(random());
        //e
        Boolean bol = true;
        Character character = 'F';
        Integer integer = 102;
        Byte byteObj = 32;
        Short shortObj = 54;
        Long longObj = 1221L;
        Double doubleObj = 14.1;
        integer = integer >>> 1;
        System.out.println(integer);
        integer = integer >> 1;
        System.out.println(integer);
        integer = integer + 12;
        System.out.println(integer);
        if (integer > byteObj && longObj > shortObj) {
            System.out.println("ffff");
        }
        Long max = java.lang.Long.MAX_VALUE;
        Long min = java.lang.Long.MIN_VALUE;
        Double maxD = Double.MAX_VALUE;
        Double minD = Double.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        System.out.println(maxD);
        System.out.println(maxD);
        Int = integer;
        System.out.println(Int);
        System.out.println(Integer.toHexString(23));
        System.out.println(Integer.compare(23,34));
        System.out.println(Integer.toString(1234));
        System.out.println(Integer.bitCount(12));
        System.out.println(Integer.rotateRight(11,123));
        System.out.println(Integer.hashCode(12));
        //f
        String s34 = "2345";
        int a = Integer.valueOf(s34);
        System.out.println(a);
        int b = Integer.parseInt(s34);
        System.out.println(b);
        String strMas = "abcde";
        byte[] bytes = strMas.getBytes();
        System.out.println("Mass bytes : " + Arrays.toString(bytes));
        String string = new String(bytes);
        System.out.println("String bytes : " + string);
        Boolean TestBool = parseBoolean(strMas);
        Boolean TestBool2 = valueOf(strMas);
        if (TestBool == TestBool2) {
            System.out.println("OK");
        }
        else  {
            System.out.println("NO");
        }
        String str1 = "123";
        String str2 = "123";
        if (str1 == str2) {
            System.out.println("OK!!!");
        }
        if (str1.equals(str2)) {
            System.out.println("equels OK!");
        }
        if (str1.compareTo(str2) == 0) {
            System.out.println("compareTo OK!!!");
        }
        else {
            System.out.println("Ne Ok");
        }
        str1 = null;
        if (str1 == str2) {
            System.out.println("OK!!!");
        }
        /*if (str1.equals(str2)) {
            System.out.println("equels OK!");
        }*/
        /*if (str1.compareTo(str2) == 0) {
            System.out.println("compareTo OK!!!");
        }*/
        else {
            System.out.println("Ne Ok");
        }
        String bestString = "Oleg Kozak 123";
        System.out.println(Arrays.toString(bestString.split(" ")));
        if (bestString.contains("Oleg")) {
            System.out.println("Top4ik");
        }
        else  {
            System.out.println("Netu");
        }
        System.out.println(bestString.hashCode());
        int i = bestString.indexOf("123");
        System.out.println(i);
        System.out.println(bestString.length());
        System.out.println(bestString.replace("123", "Dmitrievich"));
        //g
        char[][] c1 = new char[3][0];
        c1[0] = new char[]{'1'};
        c1[1] = new char[]{'2', '3'};
        c1[2] = new char[]{'4','5','6'};
        System.out.println(c1.length);
        System.out.println(c1[0].length);
        System.out.println(c1[1].length);
        System.out.println(c1[2].length);
        char[] c2[] = new  char[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        char c3[][] = new  char[][] {{3, 1, 2}, {5, 6, 4}, {9, 7, 8}};
        boolean comRez = c2==c3;
        c2 = c3;
        System.out.println(comRez);
        comRez = c2 == c3;
        System.out.println(comRez);
        for (var item: c1
             ) {
            System.out.println(item);
        }
        //System.out.println(c1[1][3]); Index 3 out of bounds for length 2
        // h
        WrapperString wrapperString =  new WrapperString();
        wrapperString.setStr("Hello World!");
        wrapperString.replace('H', 'E');
        System.out.println(wrapperString.getStr());
        var wrapperString1 = new WrapperString()
        {
            @Override
            public void replace(char oldChar, char newchar) {
                System.out.println("Ssssss");
                setStr(getStr().replace(oldChar, newchar));
            }

            public void delete(char newchar) {
                setStr(getStr().replace(newchar, ' '));
            }
        };
        wrapperString1.setStr("Hello World!!");
        wrapperString1.replace('l', 'L');
        System.out.println(wrapperString1.getStr());
        wrapperString1.delete('e');
        System.out.println(wrapperString1.getStr());

    }



}
class WrapperString
{
    /** Поле строки */
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public  void replace(char oldChar, char newchar) {
        setStr(str.replace(oldChar, newchar));
    }
}