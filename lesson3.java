import java.util.Scanner;

public class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    private static void prtList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
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
            Scanner m = new Scanner(System.in);
            Node node = new Node(m.nextInt());
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