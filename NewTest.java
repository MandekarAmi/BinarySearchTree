import java.util.Date;

public class NewTest {
    public static <E> void testIt(E[] toInsert) {

        SortedStorageSetWithNulls<E> aStorage = new SortedStorageSetWithNulls<>();

        for (E value : toInsert) {
            if (!aStorage.add(value))
                System.out.println("	add failed for " + value);
        }
        System.out.println("	" +  aStorage);
        System.out.println("---------------------------------------");

        for (E o : toInsert) {
            if (!aStorage.find(o))
                System.out.println("	find failed for " + o);
        }

        for (E o : toInsert) {
            if (!aStorage.delete(o))
                System.out.println("	delete failed for " + o);
        }
        System.out.println("	" +  aStorage);
        System.out.println("---------------------------------------");
    }

    public static void main(String[] args){

        Human a1 = new Human(new Date(20/9/2021),"Viraj","12VV");
        Human a2 = new Human(new Date(20/9/2021),"Ami","36AM");
        Human a3 = new Human(new Date(20/9/2021),"Sneha","15SR");
        Human[] humans = {a1, a2, a3};
        testIt(humans);

        MusicLP musicLP1 = new MusicLP(2020, "Viraj", "Fresh Water",3.4f,2);
        MusicLP musicLP2 = new MusicLP(2021, "Ami", "Water",4.2f,4);
        MusicLP musicLP3 = new MusicLP(2019, "Smit", "Ocean Water",2.7f,1);
        MusicLP[] musicLPS = {musicLP2,musicLP1,musicLP3};
        testIt(musicLPS);

        Address m1 = new Address(282, "Andheri East","Mumbai","Maharashtra",400069);
        Address m2 = new Address(402, "Nerul East","Navi Mumbai","Maharashtra",400706);
        Address[] addresses = {m1,m2};
        testIt(addresses);

        Object[] mix = {a1,a2,musicLP1,a1};
        testIt(mix);
    }
}
