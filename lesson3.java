import java.util.Scanner;

public class Node {
    int value;
    Node next;

    public static Node reverse(Node head) {
        Node prev = null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    private static void prtList(Node head) {
        Node cur = head;

        while (cur != null) {
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Количество элементов в списке: ");
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        Node head = null;
        for (int i = 0; i < N; i++) {
            System.out.printf("%d элемент списка = ", i + 1);
            Scanner v = new Scanner(System.in);
            Node node = new Node();
            node.value = v.nextInt();
            if (head == null) {
                head = node;
            } else {
                Node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = node;
            }
        }
        System.out.println("Исходный:");
        prtList(head);
        System.out.println("Развёрнутый:");
        prtList(reverse(head));
    }
}