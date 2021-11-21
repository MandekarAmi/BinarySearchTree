/**
 * Node.java
 *
 * Version:
 *     $Java 16.0.2$
 *
 * Revisions:
 *     $Log$
 */

/**
 * This class is a node which contains a value a left node and a right
 * node. it also contains a counter.
 * @author      Viraj Vora
 * @author      Ami Mandekar
 *
 */

 public class Node <E> implements Comparable<E>{

    Node<E> left ;
    Node<E> right ;
    E val ;

    Node(E x){
        val = x;
    }

    @Override
    public int compareTo(E o) {
        if(this.val instanceof Human){
            if(((Human) this.val).compareTo((Human) o) < 0 ){
                return -1;
            }
            else if(((Human) this.val).compareTo((Human) o) > 0 ){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(this.val instanceof MusicLP){
            if(((MusicLP) this.val).compareTo((MusicLP) o) < 0 ){
                return -1;
            }
            else if(((MusicLP) this.val).compareTo((MusicLP) o) > 0 ){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(this.val instanceof Address) {
            if(((Address) this.val).compareTo((Address) o) < 0 ){
                return -1;
            }
            else if(((Address) this.val).compareTo((Address) o) > 0 ){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(this.val instanceof String){
            if(((String) this.val).compareTo((String) o) < 0 ){
                return -1;
            }
            else if(((String) this.val).compareTo((String) o) > 0 ){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(this.val instanceof Integer){
            if(((Integer) this.val).compareTo((Integer) o) < 0 ){
                return -1;
            }
            else if(((Integer) this.val).compareTo((Integer) o) > 0 ){
                return 1;
            }
            else {
                return 0;
            }
        }
        return 0;
    }
}