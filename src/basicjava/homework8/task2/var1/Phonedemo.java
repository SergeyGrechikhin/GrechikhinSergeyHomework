package basicjava.homework8.task2.var1;

public class Phonedemo {
    public static void main(String[] args) {
        PhoneService myvolume = new PhoneService() ;
        Phone myvolume1 = new Phone("Samsung Galaxy","Black",true);
        System.out.println(myvolume1);

        myvolume.changevolume(myvolume1);
        System.out.println(myvolume1);
    }
}
