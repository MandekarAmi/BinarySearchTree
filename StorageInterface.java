public interface StorageInterface <E>{
     boolean add(E x);               // true if it was successfully added, false otherwise
     boolean find(E x);           // true if x could be found, false otherwise
     boolean delete(E x);         // true if it was successfully deleted, false otherwise
     boolean IncludesNulls();
}
