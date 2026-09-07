package Stack;

import java.util.Arrays;

public class MyStack {

    int[] arr;
    int top;
    int capacity;
    MyStack(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        top=top+1;
        arr[top]=x;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int val=arr[top];
        top--;
        return val;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int val=arr[top];
        return val;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(6);
        myStack.push(5);
        myStack.push(4);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }

}
