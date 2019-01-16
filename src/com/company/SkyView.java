package com.company;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {

        view = new double[numRows][numCols];
        //c is the variable to keep track of the index in Scanned array
        int c=0;
        for (int r = 0; r < numRows; r++) {
            //of row is even we move left to right
            if (r % 2 == 0) {
                for (int j = 0; j < numCols; j++) {
                    view[r][c] = scanned[c];
                    c++;
                }
            }
            //if the row is the not even then move right to left
            else {
                for (int j = numCols - 1; j >= 0; j--) {
                    view[r][j] = scanned[c];
                    c++;
                }
            }
        }

    }
    public double[][] getView(){
        return view;
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double sum=0;
        int num=0;
        for(int r=startRow; r<endRow+1; r++){
            for(int c = startCol; c<endCol+1; c++){
                sum = sum+view[r][c];
                num++;
            }
        }
        return (sum)/num;

    }
}
