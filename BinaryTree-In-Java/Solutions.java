



public class Solutions {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public static boolean univalued(Node root) {
            
            if(root == null) {
                return true;
            }

            if(root.left != null && root.data != root.left.data) {
                return false;
            }

            if(root.right != null && root.data != root.right.data) {
                return false;
            }

            return univalued(root.left) && univalued(root.right);
        } 

        public static void inorder(Node root) {
            if(root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static Node invertBT(Node root) {
            if(root == null) {
                return null;
            }

            //Swaping of two nodes
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertBT(root.left);
            invertBT(root.right);

            return root;
        }

        public static Node delLeafNode(Node root, int x) {
            if(root == null) {
                return null;
            }

            root.left = delLeafNode(root.left, x);
            root.right = delLeafNode(root.right, x);

            if(root.data == x && root.left == null && root.right == null) {
                return null;
            } 

            return root;
        }
        public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        System.out.println("Inorder of input root :");
        inorder(root);
        delLeafNode(root, 3);
        System.out.println();
        System.out.println("Inorder of output root :");
        inorder(root);

        // System.out.println("Inorder of root 1 :");
        // inorder(root);
        // invertBT(root);
        // System.out.println("Inoder of root 2 :");
        // inorder(root);


        
        // if(univalued(root)) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }
        }
}