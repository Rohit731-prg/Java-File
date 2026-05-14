class Stack {
    int arr[];
    int top = -1;
    int size;
    Stack(int size) {
        this.arr = new int[size];    
        this.size = size;    
    }

    boolean is_empty() {
        return this.top == -1;
    }
    boolean is_full() {
        return this.top == this.size - 1;
    }

    int peek() {
        return this.arr[this.top];
    }

    void push(int num) {
        if (is_full()) {
            System.out.println("Stack is overflow");
            return;
        }
        this.arr[++this.top] = num;
    }

    int pop() {
        if (is_empty()) {
            System.out.println("Stack is underflow");
            return -1;
        }
        int value = peek();
        this.arr[this.top] = 0;
        this.top -= 1;
        return value;
    }

    void display() {
        System.out.println("Stack : \n");
        for (int num: this.arr) {
            System.err.print(" " + num + " ");
        }
    }
}


public class Stack_Insert {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);

        st.display();
        System.out.println("\n\t-------------------------------");
        
        System.out.println("Element Removed : " + st.pop());
        System.out.println("Element Removed : " + st.pop());
        st.display();
        System.out.println("\n\t-------------------------------");
    }
}
