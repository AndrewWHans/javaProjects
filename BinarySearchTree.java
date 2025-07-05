package treetest;

public class BinarySearchTree {

    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int n, String m, double b) {
        root = insert_to_subtree(n, m, b, root);
    }

    public void remove(int n) {
        root = remove_from_subtree(n, root);
    }

    public boolean search(int n) {
        return search_subtree(root, n);
    }

    public void list_all() {
        list_subtree(root);
    }

    private BinaryNode insert_to_subtree(int n, String m, double b, BinaryNode t) {
        if (t == null) {
            t = new BinaryNode(n, m, b);
        }

        if (n < t.account_number) {
            t.left = insert_to_subtree(n, m, b, t.left);
        } 
        else if (n > t.account_number) {
            t.right = insert_to_subtree(n, m, b, t.right);
        }

        return t;
    }

    public BinaryNode remove_from_subtree(int n, BinaryNode t) {
        if (t == null) {
            return null;
        }
        else if (n < t.account_number) {
            t.left = remove_from_subtree(n, t.left);
            return t;
        } 
        else if (n > t.account_number) {
            t.right = remove_from_subtree(n, t.right);
            return t;
        } 
        else 
        { // Found the node with account_number equals n
            if (t.left != null && t.right != null) { // Node has two children
                t.account_number = findMin(t.right).account_number; // Replace node's value with min value from right subtree
                t.right = remove_from_subtree(t.account_number, t.right); // Remove the node with min value from right subtree
                return t;
            } 
            else if (t.left != null) {
                return t.left;
            }
            else if (t.right != null) {
                return t.right;
            }
            else return null;
        }
    }

    private BinaryNode findMin(BinaryNode t) {
        if (t == null) {
            return null;
        }
        else {
            if (t.left == null) return t;
            else return findMin(t.left);
            
        }
    }

    private boolean search_subtree(BinaryNode t, int n) {
        if (t == null) {
            return false;
        } 
        else if (n < t.account_number) {
            return search_subtree(t.left, n);
        } 
        else if (n > t.account_number) {
            return search_subtree(t.right, n);
        }
        else {
            return true;
        }
    }

    public void list_subtree(BinaryNode t) {
        if (t == null) {
            return;
        }
        list_subtree(t.left);
        System.out.println(t.account_number);
        list_subtree(t.right);
    }
}