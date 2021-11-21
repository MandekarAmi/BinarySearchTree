/**
 * SortedStorage.java
 *
 * Version:
 *     $Java 16.0.2$
 *
 * Revisions:
 *     $Log$
 */

/**
 * This code is used to implement Binary Search. The code also consist the
 * functionality of adding node to tree, deleting a node from tree and
 * checking if null is present, the binary search tree will be sorted at
 * all the times.
 * @author      Viraj Vora
 * @author      Ami Mandekar
 *
 */

public class SortedStorage<E> implements StorageInterface<E> {

    public Node <E> root = null;
    public int findVal=0;
    public int delete=0;
    public String output="";


    public String toString() {//overriding the toString() method
        output = "";
        output = orderPrint(root);
        return output;
    }

    /**
     * This method is used to add a node in sorted tree
     * @param	root	This is the current binary search tree
     * @param	x	This is the value of node that is to be added
     * @return  		The updated tree with new value is returned
     */
    public Node<E> addRoot(Node<E> root, E x){
        if(root ==null){		//for adding first value in tree
            root=new Node<>(x);
            return root;
        }
        //adding the new node in right or left of tree based on the value
        if(root.compareTo(x) < 0){
            root.right=addRoot(root.right,x);
        }
        else {
            if(root.compareTo(x) > 0){
                root.left=addRoot(root.left,x);
            }
            else {
                root.right=addRoot(root.right,x);
            }
        }
        return root;
    }

    /**
     * This method is used to delete a node in tree
     * @param	root	This is the current binary search tree
     * @param	x	This is the value of node that is to be deleted
     * @return  		The updated tree is returned
     */
    public Node<E> deleteRoot(Node<E> root, E x){

        if (root == null)
            return root;

        if (root.compareTo(x) > 0)
            root.left = deleteRoot(root.left, x);
        else if (root.compareTo(x) < 0)
            root.right = deleteRoot(root.right, x);
        else {
            if (root.left == null){
                delete=1;
                return root.right;
            }
            else if (root.right == null){
                delete=1;
                return root.left;
            }
        }
        return root;
    }

    /**
     * This method is used to find a node in tree
     * @param	root	This is the current binary search tree
     * @param	x	This is the value of node that is to be searched
     * @return  		The current tree is returned
     */
    public Node<E> findRoot(Node<E> root, E x){
        if(root ==null){
            findVal=0;
            return null;
        }
        else {
            if(root.compareTo(x) == 0){
                findVal=1;
            }
            else if(root.compareTo(x) > 0){
                root.left=findRoot(root.left,x);
            }
            else {
                root.right=findRoot(root.right,x);
            }
        }
        return root;
    }

    /**
     * This method prints the binary tree
     * @param	root	This is the current binary search tree
     *
     */
    public String orderPrint(Node<E> root){
        //traversing through the tree
        if(root!=null){
            output=output+"( L: ";
            orderPrint(root.left);
            output=output+") ";
            output=output+root.val;
            output=output+" R: (";
            orderPrint(root.right);
            output=output+")";
        }
        else {
            output=output+"null";
        }
        return output;
    }

    @Override
    public boolean add(E x) {
        boolean result = false;
        //logic to add value if no duplicate exists
        if (x == null) {
            result = false;
        }
        else {
            if (root == null) {
                result = true;
            } else {
                //check instance of object
                if(root.val instanceof Human){
                    if(x instanceof Human)
                        result =true;
                }
                else if(root.val instanceof MusicLP){
                    if(x instanceof MusicLP)
                        result = true;
                }
                else if(root.val instanceof Address) {
                    if (x instanceof Address)
                        result = true;
                }
                else if(root.val instanceof String){
                    if(x instanceof String)
                        result = true;
                }
                else if(root.val instanceof Integer){
                    if(x instanceof Integer)
                        result = true;
                }
            }
        }

        if(result){
            root = addRoot(root, x);
        }
        return result;
    }

    @Override
    public boolean find(E x) {
        Boolean result;
        findVal = 0;
        //logic to find string
        if (x == null) {
            return false;
        } else {
            if (root == null) {
                return false;
            } else {
                if (root == null) {
                    result = true;
                } else {
                    //check instance of object
                    if(root.val instanceof Human){
                        if(x instanceof Human)
                            root = findRoot(root, x);
                    }
                    else if(root.val instanceof MusicLP){
                        if(x instanceof MusicLP)
                            root = findRoot(root, x);
                    }
                    else if(root.val instanceof Address) {
                        if (x instanceof Address)
                            root = findRoot(root, x);
                    }
                    else if(root.val instanceof String){
                        if(x instanceof String)
                            root = findRoot(root, x);
                    }
                    else if(root.val instanceof Integer){
                        if(x instanceof Integer)
                            root = findRoot(root, x);
                    }
                }

            }
            if (findVal == 1) {
                result = true;
            } else {
                result = false;
            }
            return result;
        }
    }

    @Override
    public boolean delete(E x) {
        boolean result = false;
        delete = 0;
        findVal = 0;
        //logic to delete if value exists
        if (x == null) {
            result = false;
        } else {
            if(root == null){
                result = false;
            }
            //check instance of object
            else{
                //check instance of object
                if(root.val instanceof Human){
                    if(x instanceof Human)
                        find(x);
                }
                else if(root.val instanceof MusicLP){
                    if(x instanceof MusicLP)
                        find(x);
                }
                else if(root.val instanceof Address) {
                    if (x instanceof Address)
                        find(x);
                }
                else if(root.val instanceof String){
                    if(x instanceof String)
                        find(x);
                }
                else if(root.val instanceof Integer){
                    if(x instanceof Integer)
                        find(x);
                }
            }
            if (findVal == 1) {
                delete = 0;
                root = deleteRoot(root, x);
            }
            if (delete == 1) {
                result = true;
            }
            return result;
        }
        return result;

    }

    @Override
    public boolean IncludesNulls() {
        return false;
    }
}