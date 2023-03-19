package com.driver;

public class Main {
    class Product{
        public int product(int x,int y){ return x*y; }
        public int product(int x,int y,int z){ return x*y*z; }
        public double product(double x,double y){ return x*y; }
    }
    public static void main(String args[]){
        Product p = new Main().new Product();
        int ans1 = p.product(2,3);
        int ans2 = p.product(2,3,4);
        double ans3 = p.product(2.5,3.0);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
}