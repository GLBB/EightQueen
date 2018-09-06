package cn.glbb.model;

import cn.glbb.model.EightQueens;
import org.junit.Test;

public class EightQueensTest {
    @Test
    public void test1(){
        EightQueens eightQueens = new EightQueens();
        eightQueens.search();
        var list = eightQueens.list;
        System.out.println();
    }

}
