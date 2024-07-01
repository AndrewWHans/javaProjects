package treetest;

public class TreeTest {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1, "Henry Smith", 99.99);
        bst.insert(22, "Mudge Doug", 55.05);
        bst.insert(3, "Biscuit Nancy", 100);
        bst.insert(11, "Louise Buick", 33);
        bst.insert(32, "Merlinda Shuez", 9999);
        bst.insert(13, "Unknown Unknown", 2000);
        bst.remove(1);
        bst.insert(2, "Joe Mess", 20);
        bst.remove(11);
        bst.list_all();
    }
}
/*
If your program is implemented correctly, it should display:
2
3
13
22
32
 */
