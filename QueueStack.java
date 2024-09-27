/*
Sample Input

    racecar

Sample Output

    The word, racecar, is a palindrome.

 */

import java.util.*;

public class QueueStack {
    // Write your code here.

    Stack<Character> stack = new Stack<>();//Stack<object> is a interface  and Stack<> is aabstract method 
    Queue<Character> queue = new LinkedList<>();//Queue<object> is a interface and LinkedList<> is abstaract methid,

    public char popCharacter() {
        char val = stack.pop();
        return val;
    }

    public char dequeueCharacter() {
        char num = queue.remove();
        return num;
    }

    public void enqueueCharacter(char val) {
        queue.add(val);
    }

    public void pushCharacter(char val) {
        stack.push(val);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a QueueStack object:
        QueueStack p = new QueueStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
