package com.company;

public class SkyView {
    private double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned) {
        this.view = new double[numRows][numCols];
        if (numRows > 0 && numCols > 0 && scanned.length == numRows * numCols) {
            for (int r = 0; r < view.length; r++) {
                for (int c = 0; c < view[r].length; c++) {
                    view[r][c] = scanned[r];
                }
            }
        }
    }
}
