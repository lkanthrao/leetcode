import java.util.ArrayList;
import java.util.List;

public class BFSTrails {

    public static void main(String[] args){ // why string because it's immutable and it cannot be updated from command prompt after it's passed to main,
        // similarly in every situation of java execution we use string, because it's safe and cannot be altered using it's reference.

        TreeNode<Integer> root = new TreeNode<>();


        TreeNode<Integer> adjacentNode1 = new TreeNode<>();
        TreeNode<Integer> adjacentNode2 = new TreeNode<>();

        TreeNode<Integer> adjacentNodeOf20 = new TreeNode<>();

        root.setValue(50);
            adjacentNode1.setValue(20);
                adjacentNodeOf20.setValue(10);
            adjacentNode2.setValue(70);


        adjacentNode1.addAnAdjacentNode(adjacentNodeOf20);


//        TreeNodeBuilder treeNodeBuilder = TreeNodeBuilder.


        root.addAnAdjacentNode(adjacentNode1);
        root.addAnAdjacentNode(adjacentNode2);

        System.out.println("--------BFS---------");
        traverseBFS(List.of(root));

        System.out.println("--------DFS---------");
//        traverseDFS(List.of(root));
        traverseDFS(root);

    }

    public static void traverseBFS(List<TreeNode> nodes){

        if(nodes == null || nodes.isEmpty()) return;

        List<TreeNode> adjacentList = new ArrayList();

        for(TreeNode eachAdjacent:nodes){ // 20, adja = null

//            if(eachAdjacent != null){

//            ABove code due to NPE, I changed to as below without abalysing it and the whole logic failed,
//            if(eachAdjacent != null && eachAdjacent.getAdjacentNodes() != null){

            if(eachAdjacent != null)
                System.out.println(eachAdjacent.getValue());

            if(eachAdjacent.getAdjacentNodes() != null)
                adjacentList.addAll(eachAdjacent.getAdjacentNodes());

        }

        traverseBFS(adjacentList);


    }

    public static void traverseDFS(TreeNode node){

        int leftNode = 0;
        int rightNode = 1;

        if(node == null) return;

        System.out.println(node.getValue());

//        if(node.getAdjacentNodes() != null && node.getAdjacentNodes().length == leftNode)
//        if(node.getAdjacentNodes() != null && node.getAdjacentNodes().size() >= leftNode)
        if(node.getAdjacentNodes() != null && node.getAdjacentNodes().size() >= 1)
//            traverseDFS(node.getAdjacentNodes()[0]);
//            traverseDFS(node.getAdjacentNodes().get(leftNode));
            traverseDFS((TreeNode) node.getAdjacentNodes().get(leftNode));

//        if(node.getAdjacentNodes() != null && node.getAdjacentNodes().length == rightNode)
//        if(node.getAdjacentNodes() != null && node.getAdjacentNodes().size() >= rightNode)
        if(node.getAdjacentNodes() != null && node.getAdjacentNodes().size() >= 2)
//            traverseDFS(node.getAdjacentNodes()[1]);
//            traverseDFS(node.getAdjacentNodes().get(rightNode));
            traverseDFS((TreeNode) node.getAdjacentNodes().get(rightNode));

    }






}
