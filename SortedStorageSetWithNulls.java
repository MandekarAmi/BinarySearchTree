public class SortedStorageSetWithNulls<E> extends SortedStorageSet<E> {

    int countNull =0;
    /**
     * This method is used to add a node in sorted tree
     *
     * @param   x    This is the string entered by user for it to
     * @return            true or false if value can be added or not
     */
    public boolean add (E x) {
        boolean result = false;
        if (x == null) {
            countNull = countNull + 1;
            result = true;
        } else {
            result = super.add(x);
        }
        return result;
    }

    /**
     * This method is used to delete a node in tree
     *
     * @return True or false if the value is added or not
     * @param   x  This is the string entered by user for it to
     * be deleted from tree
     */
    public boolean delete(E x) {
        boolean result = false;
        delete = 0;
        //logic to delete if value exists
        if (x == null) {
            if (countNull > 0) {
                countNull = countNull - 1;
                result = true;

            }
        } else {
            result = super.delete(x);
        }
        return result;
    }

    /**
     * This method is used to find a node in tree
     * @param	x		This is the string entered by user for it
    to be searched to tree
     * @return  				True or false if the value is added or not
     */
    public boolean find(E x) {
        boolean result = false;
        if(x == null){
            result = IncludesNulls();
        }
        else {
            result = super.find(x);
        }
        return result;
    }

    public boolean IncludesNulls() {
        boolean result;
        if (countNull !=0){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

}