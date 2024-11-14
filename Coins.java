package org.example;

public class Coins {
    Coin[] coins;
    int howMany = 0;
    int index = 0;
    int count = 0;
    public Coins(int n,int howMany) {
        coins = new Coin[n];
        this.howMany = howMany;

    }

    public void setCoin(Coin coin) {
        coins[index] = coin;
        index++;
    }
    public int getCount(){
        while (howMany>0){
            howMany-=getMax();
            count++;

        }
        return count;
    }
    public void printCoins() {
        for(int i = 0; i < coins.length; i++) {
            System.out.print(coins[i].value + " ");

        }
    }
    public int getMax(){
        int max=0;
        for (int i=0;i<coins.length;i++){
            if(howMany>=coins[i].value){
                max = coins[i].value;
            }
            else {
                return max;
            }

        }
        return max;
    }

}
class Coin{
    int value;
    public Coin(int value){
        this.value = value;
    }
}
