import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BJ28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque deque = new Deque(N + 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch (a){
                case 1:
                    int b = Integer.parseInt(st.nextToken());
                    deque.addFirst(b);
                    break;
                    case 2:
                        int c = Integer.parseInt(st.nextToken());
                        deque.addLast(c);
                        break;
                        case 3:
                            int d = deque.removeFirst();
                            sb.append(d);
                            sb.append("\n");
                            break;
                            case 4:
                                int e = deque.removeLast();
                                sb.append(e);
                                sb.append("\n");
                                break;
                                case 5:
                                    int f = deque.getSize();
                                    sb.append(f);
                                    sb.append("\n");
                                    break;
                                    case 6:
                                        int g = deque.isEmpty();
                                        sb.append(g);
                                        sb.append("\n");
                                        break;
                                        case 7:
                                            int h = deque.getHead();
                                            sb.append(h);
                                            sb.append("\n");
                                            break;
                                            case 8:
                                                int j = deque.getTail();
                                                sb.append(j);
                                                sb.append("\n");
                                                break;
            }
        }
        System.out.println(sb);

    }
}
class Deque {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int size;
    private int maxSize;
    private int head;
    private int tail;
    public Deque (int maxSize){
        elements = new int[maxSize];
        size = 0;
        this.maxSize = maxSize;
        head = 0;
        tail = 0;
    }
    public void addFirst(int element) {
        if (size == maxSize) {
            System.out.println("Overflow");
            return;
        }
        head = (head - 1 + maxSize) % maxSize; // head가 0에서 -1로 이동하지 않도록 처리
        elements[head] = element;
        size++;
    }

    public void addLast(int element) {
        if (size == maxSize) {
            System.out.println("Overflow");
            return;
        }
        elements[tail] = element;
        tail = (tail + 1) % maxSize; // tail이 maxSize를 초과하지 않도록 처리
        size++;
    }

    public int removeFirst() {
        if (size == 0) return -1; // 비어있으면 -1 반환
        int element = elements[head];
        head = (head + 1) % maxSize; // head가 maxSize를 초과하지 않도록 처리
        size--;
        return element;
    }

    public int removeLast() {
        if (size == 0) return -1; // 비어있으면 -1 반환
        tail = (tail - 1 + maxSize) % maxSize; // tail이 음수가 되지 않도록 처리
        int element = elements[tail];
        size--;
        return element;
    }

    public int isEmpty(){
        return size == 0 ? 1 : 0;
    }
    public int getSize(){
        return size;
    }
    public int getHead(){
        if (size == 0) return -1;
        return elements[head];
    }
    public int getTail(){
        if (size == 0) return -1;
        return elements[(tail - 1 + maxSize) % maxSize];
    }
    public int[] getElements(){
        return elements;
    }

}
