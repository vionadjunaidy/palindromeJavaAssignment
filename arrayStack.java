public class arrayStack {
    private char[] array;
    private int top;
    public arrayStack(int maxSize){
        array = new char[maxSize];
        top = 0;
    }

    public void push(char x) {
        if(top>array.length) {
            return;
        } else {
            array[top] = x;
            top++;
        }
    }

    public char pop() {
        char returning = '\0';
        if(top>0){
            top--;
            returning = array[top];
        }
        return returning;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
