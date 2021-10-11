package Day1.Puzzle5;

public class Main {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(29);
        stack.push(31);
        stack.push(101);

        stack.printStack();
        System.out.println(stack.getMax());
        stack.pop();
        stack.printStack();
        System.out.println(stack.getMax());

    }
}
