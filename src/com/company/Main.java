package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] scan = {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.2,1.6,0.6,0.9};
        double[] scan2 = {0.3,0.7,0.8,0.4,1.4,1.1};

        SkyView sv1 = new SkyView(4, 2, scan);
        SkyView sv2 = new SkyView(3, 2, scan2);
        //for(int r = 0; r<sv1.getView().length; r++){
            //for(int c = 0; c<sv1.getView()[r].length; c++){
                //System.out.print(sv1.getView()[r][c]+" ");
            //}
            //System.out.println();
        //}
        //System.out.println(sv1);
        System.out.println("Average1: " +sv1.getAverage(1, 3, 0, 2));
        System.out.println("Average2: "+sv2.getAverage(0, 1, 0, 1));

        
    }
}
