package org.example;

class ContingSort {
    int[] num= new int[10001];

    int count = 0;


    public void setNum(int a){
        num[a]++;
    }
    public void sort(){

        var sb = new StringBuilder();
        for (int i = 0; i < num.length; i++){

            for(int j=0;j<num[i];j++){
                sb.append(i).append("\n");
            }

        }
        System.out.println(sb);
    }

}

