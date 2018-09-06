package cn.glbb;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {
    @Test
    public void test1(){
        Integer[] q = {1,2,3,4};
        var list = new ArrayList<Integer[]>();
        list.add(q);
        q[0] = 11;
        list.add(q);
        System.out.println();
    }
}
