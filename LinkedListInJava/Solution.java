
public class Solution {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public Node push(Node head_ref, int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = (head_ref);
        (head_ref) = newNode;
        return head_ref;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    public void skipMdeleteN(Node head, int M, int N) { //O(n)
        Node curr = head, t;
        int count;

        while (curr != null) {
            for (count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }

            if (curr == null) {
                return;
            }
            t = curr.next;

            for (count = 1; count <= N && t != null; count++) {
                t = t.next;
            }

            curr.next = t;
            curr = t;

        }
    }

    public void swapNodes(int X, int Y) {
        if (X == Y) {
            return;
        }

        Node prevX = null, currX = head;
        while (currX != null && currX.data != X) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != Y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void segregateEvenOdd() {

        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null) {
            end = end.next;
        }

        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else {
            prev = curr;
        }
        
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    public static void main(String[] args) {
        Solution ll = new Solution();

        // int X = 2, Y = 1;
        // head = ll.push(head, 10);
        // head = ll.push(head, 9);
        // head = ll.push(head, 8);
        // head = ll.push(head, 6);
        // head = ll.push(head, 1);
        // head = ll.push(head, 4);
        head = ll.push(head, 7);
        head = ll.push(head, 5);
        head = ll.push(head, 2);
        head = ll.push(head, 1);

        ll.printList(head);

        ll.segregateEvenOdd();

        // ll.swapNodes(X, Y);

        ll.printList(head);

        // first list: 10 -> 15 -> 30
        // Node head1 = new Node(10);
        // head1.next = new Node(15);
        // head1.next.next = new Node(30);
        // second list: 3 -> 6 -> 9 -> 15 -> 30
        // Node head2 = new Node(3);
        // head2.next = new Node(6);
        // head2.next.next = new Node(9);
        // intersection at node with value 15
        // head2.next.next.next = head1.next;
        // Node interPt = ll.getIntersectionNode(head1, head2);
        // if(interPt == null) {
        //     System.out.println("-1");
        // } else {
        //     System.out.println(interPt.data);
        // }
    }
}
