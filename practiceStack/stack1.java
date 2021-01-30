import java.util.*;
public class stack1
{
    // stack using array
    static final int MAX = 1000;
    static int [] stack = new int[MAX];
    static int top = -1;
    public stack1(){};


    public void push(int data)
    {
        if(top != (MAX-1))
        {
            top++;
            stack[top] = data;
        }
        else
        {
            System.out.println("Stack is full. OverFlow condition");
        }
    }
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty. Underflow condition");
        }
        else{
            top--;
        }
    }
    public int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty. Underflow condition");
            return -1;
        }
        else
        {
            return stack[top];
        }
    }
    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        return false;
    }
    public void printStack()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        stack1 st = new stack1();
        st.push(12);
        st.push(13);
        st.printStack();
        st.pop();
        st.printStack();
        st.push(11);
        st.push(1232);
        st.push(22);
        st.printStack();
        st.pop();
        // st.peek();
        System.out.println("The peek element is : "+st.peek());
        st.printStack();
        
    }
    
}