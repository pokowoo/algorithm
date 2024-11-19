package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ3190 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N= Integer.parseInt(br.readLine());
        int K= Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[y-1][x-1] = 1;
        }
        Snake snake = new Snake(N,board);
        int L = Integer.parseInt(br.readLine());
        for(int i = 0; i < L; i++){
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            String turn = st.nextToken();
            snake.ctr(X,turn);
        }
        if(!snake.end){
            snake.move2();
        }

    }


}



class Snake{
    boolean end=false;
    Queue<XY> snake_path=new LinkedList<XY>();
    int head_x=0;
    int head_y=0;
    int maxSize;
    int[][] board;
    int sec=0;
    String direction="R";
    public Snake(int size,int[][] board){
        this.board=board;
        maxSize=size;
    }
    public boolean move(){
        snake_path.add(new XY(head_x,head_y));
        switch (direction){
            case "R":
                head_x=head_x+1;
                break;
            case "L":
                head_x=head_x-1;
                break;
            case "U":
                head_y=head_y-1;
                break;
            case "D":
                head_y=head_y+1;
                break;
        }
        if(head_x==-1||head_y==-1){
            return false;
        } else if (head_x==maxSize||head_y==maxSize) {
            return false;
        } else if (snake_path.contains(new XY(head_x,head_y))) {
            return false;
        }
        if(board[head_x][head_y]==1){
            board[head_x][head_y]=0;
        }
        else {
            snake_path.remove();
        }
        return true;
    }

    public void turn(String turn){
        if(turn.equals("L")){
            switch (direction){
                case "R":
                    direction="U";
                    break;
                case "L":
                    direction="D";
                    break;
                case "U":
                    direction="L";
                    break;
                case "D":
                    direction="R";
                    break;
            }
        } else if (turn.equals("D")) {
            switch (direction){
                case "R":
                    direction="D";
                    break;
                case "L":
                    direction="U";
                    break;
                case "U":
                    direction="R";
                    break;
                case "D":
                    direction="L";
                    break;
            }
            
        }
    }
    public void ctr(int N,String turn){
        if(!end) {
            for (int i = sec; i < N; i++) {
                sec++;

                if (!move()) {
                    end = true;
                    System.out.println(sec);
                    break;
                }
            }
            turn(turn);
        }
    }
    public void move2(){
        while (!end){
            sec++;
            snake_path.add(new XY(head_x,head_y));
            switch (direction){
                case "R":
                    head_x=head_x+1;
                    break;
                case "L":
                    head_x=head_x-1;
                    break;
                case "U":
                    head_y=head_y-1;
                    break;
                case "D":
                    head_y=head_y+1;
                    break;
            }
            if(head_x==-1||head_y==-1){
                end=true;
                System.out.println(sec);
                return;
            } else if (head_x==maxSize||head_y==maxSize) {
                end=true;
                System.out.println(sec);
                return;
            } else if (snake_path.contains(new XY(head_x,head_y))) {
                end=true;

                System.out.println(sec);
                return;
            }
            if(board[head_x][head_y]==1){
                board[head_x][head_y]=0;
            }
            else {
                snake_path.remove();
            }

        }
    }
    public void print(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[j][i]+" ");
            }
            System.out.println();
        }
    }
}
class XY{
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        XY xy = (XY) obj;
        return x == xy.x && y == xy.y;
    }
    public int hashCode() {
        return Objects.hash(x, y);
    }


    int x;
    int y;
    public XY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}