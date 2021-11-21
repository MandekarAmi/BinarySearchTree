public class Address implements Comparable<Address>{
    int houseNumber;
    String streetName;
    String nameOfTown;
    String state;
    int zipCode;

    public Address(int houseNumber,String streetName, String nameOfTown, String state, int zipCode){
        this.houseNumber=houseNumber;
        this.streetName=streetName;
        this.nameOfTown=nameOfTown;
        this.state=state;
        this.zipCode=zipCode;
    }
    @Override
    public String toString(){
        return "Housenumber: "+this.houseNumber+" || StreetName: "+this.streetName+
                " || NameofTown: "+this.nameOfTown+" || State: "+this.state+" || Zipcode: "+this.zipCode;
    }
    @Override
    public int compareTo(Address o) {
        if(this.houseNumber < o.houseNumber){
            return -1;
        }
        else if(this.houseNumber > o.houseNumber){
            return 1;
        }
        else
            return 0;
    }
}
