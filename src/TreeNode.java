import java.util.ArrayList;
import java.util.List;

public class TreeNode <T>{

        private T value;

        private List<TreeNode> adjacentsLists;

        public void addAnAdjacentNode(TreeNode adjacentNode){ // why a TreeNode not T or int or float because if the
            // caller needs to add adjacentList to this adjacentNode, then he must pass a int/T to this funcation and
            // we here create a new object and pass it's reference. Hence it's better to acces TreeNode than T.

            if(adjacentsLists == null || adjacentsLists.isEmpty())
                adjacentsLists = new ArrayList<>();

            adjacentsLists.add(adjacentNode);
        }

        public List<TreeNode> getAdjacentNodes(){
            return this.adjacentsLists;
        }


        public void setValue(T value){
            this.value = value;
        }

        public T getValue(){
            return this.value;
        }





}

    class TreeNodeBuilder{




    }