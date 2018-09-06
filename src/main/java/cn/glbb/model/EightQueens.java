package cn.glbb.model;

import java.util.ArrayList;

public class EightQueens {
    Integer[] queens = new Integer[8];
    ArrayList<Integer[]> list = new ArrayList<>();

    public void search(){
        for (int i = 0; i < queens.length; i++){
            queens[i] = -1;
        }

        int row = 0;
        while (row>=0 && row<queens.length) {
            int col = findPosition(row);
            queens[row] = col;
            if (row == queens.length-1 && col != -1){
                Integer[] copy = new Integer[queens.length];
                for (int i = 0; i< queens.length; i++){
                    copy[i] = queens[i];
                }
                list.add(copy);
                continue;
            }

            if (col == -1) {
                 row--;
             }else {
                 row++;
             }
        }

    }

    /**
     *
     * @param row
     * @return -1 代表没有合适的位置
     */
    private int findPosition(int row){
        for (int col = queens[row] + 1; col<queens.length; col++){
            if (isValid(row,col)){
                return col;
            }
        }
        return -1;
    }

    private boolean isValid(int row, int col){
        for (int i = 1; i<=row; i++) {
            if (queens[row-i] == col || queens[row-i] == col-i || queens[row-i] == col+i){
                return false;
            }
        }
        return true;
    }

}
