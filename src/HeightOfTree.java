public class HeightOfTree {

    class TreeNode {

        int data;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int value) {
            data = value;
        }

        public void addLeftNode(TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public void addRightNode(TreeNode rightNode) {
            this.rightNode = rightNode;
        }
    }


    public static void main(String[] args) {

        HeightOfTree heightOfTree = new HeightOfTree();
        TreeNode rootNode = heightOfTree.createATree();
        System.out.println(checkHeight(rootNode));
    }


    private static int checkHeight(TreeNode currentNode) {

        if (currentNode == null) return -1;


        int leftHeight = checkHeight(currentNode.leftNode);

        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(currentNode.rightNode);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightDiff = leftHeight - rightHeight;

        if (Math.abs(heightDiff) > 1) return Integer.MIN_VALUE;
        else return Math.max(leftHeight, rightHeight) + 1;
    }


    private TreeNode createATree() {

        TreeNode root = new TreeNode(50);
        TreeNode leftChild = new TreeNode(30);
        TreeNode rightChild = new TreeNode(70);

        root.addLeftNode(leftChild);
        root.addRightNode(rightChild);

        leftChild.addLeftNode(new TreeNode(20));
        leftChild.addRightNode(new TreeNode(40));

        return root;
    }
}
