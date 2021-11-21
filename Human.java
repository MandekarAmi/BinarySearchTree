import java.util.Date;

public class Human implements Comparable<Human>{
    Date dateOfBirth;
    String firstName;
    String userId;

    public Human(Date dateOfBirth, String firstName, String userId ){
        this.dateOfBirth=dateOfBirth;
        this.firstName=firstName;
        this.userId=userId;
    }
    @Override
    public String toString(){
       return "DOB: "+this.dateOfBirth+" || FirstName: "+this.firstName+" || UserId: "+this.userId;
    }

    @Override
    public int compareTo(Human o) {
        if( this.userId.compareTo(o.userId) < 0){
            return -1;
        }
        else if( this.userId.compareTo(o.userId) > 0){
            return 1;
        }
        else {
            return 0;
        }
    }

//    @Override
//    public int compareTo(Object o) {
//        if( this.userId.compareTo(((Human)o).userId) < 0){
//            return -1;
//        }
//        else if( this.userId.compareTo(((Human)o).userId) > 0){
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }
}