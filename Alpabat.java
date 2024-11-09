package org.example;

public class Alpabat {
    public String str= "";
    int [] alpabats = new int [32];
    String[] strArr ={};

    Alpabat(String str){
        this.str = str;
        strArr = str.split("");


    };
    public void setAlpabats() {
        int ascii=97;
        for(int i=0; i<26; i++){

            int count = 0;
            for(int j=0; j< strArr.length; j++)
            {
                if(ascii==strArr[j].charAt(0))
                {
                    count++;
                }
            }
            alpabats[i]=count;
            ascii++;
        }

    }
    public void getAlpabats() {
        for (int i = 0; i < 26; i++) {

            System.out.print(alpabats[i]+" ");
        }
    };
}
