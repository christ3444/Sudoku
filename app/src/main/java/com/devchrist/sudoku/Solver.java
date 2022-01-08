package com.devchrist.sudoku;

public class Solver {

    private static int selected_row;
    private static int selected_column;


    public Solver(){
        selected_row = -1;
        selected_column = -1 ;
    }
    public  int getSelected_row(){

        return  selected_row;
    }
    public  int getSelected_column(){
        return  selected_column;
    }

    public static void setSelected_row(int r) {
        selected_row = r;
    }

    public static void setSelected_column(int c) {
        selected_column = c;
    }
}
