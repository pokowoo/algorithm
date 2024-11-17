package org.example;

public class Heep {
    final int MaxElement=1000001;
    private Node node[]= new Node[MaxElement];
    private int size;
    public Heep() {
        size=0;
    }


    //node

    public Node getParent(int index) {
        return node[index/2];
    }
    public Node getLeftChild(int index) {
        return node[index*2];
    }
    public Node getRightChild(int index) {
        return node[index*2+1];
    }

    //삽입
    public void insert(int key,int value){
        if(size==MaxElement-1){
            System.out.println("full");
            return;
        }
        int index = ++size;
        while (index!=1&&key>getParent(index).getKey()){
            node[index]=getParent(index);
            index /=2;
        }
        node[index]=new Node(key,value);
    }
    public int remove() {
        if(size==0){
            System.out.println("empty");
            return 0;

        }
        Node itemNode = node[1];
        Node lastNode = node[size--];
        int index = 1;
        while (index<=size){
            if(index*2>size){
                break;
            } else if (index*2==size) {
                if(lastNode.getKey()<getLeftChild(index).getKey()){
                    node[index]=getLeftChild(index);
                    index *=2;
                }
                else {
                    break;
                }

            }
            else{
                int leftChildKey = getLeftChild(index).getKey();
                int rightChildKey = getRightChild(index).getKey();
                if(lastNode.getKey()<leftChildKey||lastNode.getKey()<rightChildKey){
                    node[index]=leftChildKey>rightChildKey?getLeftChild(index):getRightChild(index);
                    index = leftChildKey>rightChildKey?index*2:index*2+1;
                }
                else{
                    break;
                }
            }
        }
        node[index]=lastNode;
        return itemNode.getValue();

    }
    public void display() {
        int level = 1;
        for (int i = 1; i <= size; i++) {
            if (i == level) {
                System.out.println();
                level *= 2;
            }
            System.out.print(node[i].getValue() + " ");
        }
        System.out.println("\n---------------");
    }
    public static void main(String[] args) {
        Heep heep;
        heep = new Heep();

        heep.insert(1,1);
        heep.insert(5,5);
        heep.insert(2,2);
        heep.insert(10,10);
        heep.insert(-99,-99);
        heep.insert(7,7);
        heep.insert(5,5);
        heep.display();



    }


}

