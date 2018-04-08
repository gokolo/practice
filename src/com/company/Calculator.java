package com.company;

public class Calculator implements AdvancedArithmetic {
    int power(int n,int p) throws Exception {
        int a=0;
        if(n<0&&p<0){
            throw new Exception("n and p should be non-negative");
        } else{
            double c=0;
            c=Math.pow(n,p);
            a=Integer.valueOf((int)c);
        }
        return a;
    }

    @Override
    public int divisorSum(int n) {
        int div = 0;
        for(int i=1; i<=1000;i++) {
            if(n%i==0) {
                div = i + div;
            }
        }
        return div;
    }
}