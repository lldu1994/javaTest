package swapinteger;

import java.lang.reflect.Field;

/**
 * 两个integer类型的数据交换值
 */
public class SwapInteger {

    public static void swap(Integer i, Integer j) {
       /* Integer temp = i;
        i = j;
        j = temp;*/
       /* System.out.println("a:" + j + " b: " + i);
        System.exit(0);*/
        /*try {
            int a =i;
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set(i,j);
            value.set(j,new Integer(a));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }*/

    }

    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 2000;

        System.out.println("a:" + a + " b: " + b);
        swap(a, b);
        System.out.println("a:" + a + " b: " + b);

        Integer a1 = 1;
        Integer b1 = 1;
        System.out.println(a1==b1);
        System.out.println(Math.round(16.5));
        System.out.println(Math.round(-16.5));
    }
}
