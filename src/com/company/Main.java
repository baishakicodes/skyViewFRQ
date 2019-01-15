package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] scanned ={0.3,0.7,0.8,.4,1.4,1.1};
        SkyView obj = new SkyView(3,2,scanned);
        obj.getView();
        
    }
}
