package stack;

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> gs = new GenericStack<>();
        gs.push(123);
        gs.push(456);
        gs.push(789);
        gs.pop();
        gs.pop();
        gs.pop();
        gs.push(3000);
        System.out.println(gs.peek());

        GenericStack<String> gs1 = new GenericStack<>();
            gs1.push("Hello");
            gs1.push("JAVA");
            gs1.push("Programming");
        System.out.println(gs1.peek());
            gs1.pop();
            gs1.pop();
        System.out.println(gs1.peek());
    }


}