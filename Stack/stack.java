class stack{
    int size = 5;
    int myStack[] = new int[size];
    int top = -1;

    public void push(int elt){
        if(!isFull()){
            top++;
            myStack[top] = elt;
            System.out.println(elt + " insert");
        } else {
            System.out.println("cant push!!!");
        }
    }

    public void pop(){
        if(!isEmpty()){
            int popped = myStack[top];
            top--;
            System.out.println("Popped: " + popped);
        } else {
            System.out.println("No data to pop!!!");
        }
    }

    public void peak(){
        System.out.println("Top Element is: " + myStack[top]);
    }

    public boolean isEmpty() {
        if(top == -1){
            System.out.println("Stack is empty!!!");
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(top == (size - 1)){
            System.out.println("Stack is full!!!");
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        System.out.print("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(myStack[i] + " ");
        }
        System.out.println();
    }
}