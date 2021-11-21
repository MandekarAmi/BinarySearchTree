public class SortedStorageSet<E> extends SortedStorage<E>{

    /**
     * This method is used to add a node in sorted tree
     *
     * @param   x     This is the string entered by user for it to
     * @return        True or false if the value is added or not
     */
    public boolean add(E x) {
        boolean result = false;
        if(x == null) {
            return false;
        }
        else{
            if(!find(x)){
                result = super.add(x);
                return result;
            }
        }
        return result;
    }

    /**
     * This method is used to delete a node in tree
     * @param	x		This is the string entered by user for it to
     *                  be deleted from tree
     * @return  				True or false if the value is added or not
     */
    public boolean delete(E x) {
        return super.delete(x);
    }

    /**
     * This method is used to find a node in tree
     * @param	x		This is the string entered by user for it
     *                  to be searched to tree
     * @return  				True or false if the value is added or not
     */
    public boolean find(E x) {
        boolean result;
        if(x == null){
            return false;
        }
        else {
            result = super.find(x);
            return result;
        }
    }

    public boolean IncludesNulls() {
        return false;
    }

    public static void main(String[] args){

    }

}
