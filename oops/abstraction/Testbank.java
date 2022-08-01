abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}
public class Testbank{
    public static void main(String[] args){
        Bank b;
        b = new SBI();
        System.out.println("Rate Of Interest "+b.getRateOfInterest()+"%");
        b = new PNB();
        System.out.println("Rate Of Interest "+b.getRateOfInterest()+"%");
    }
}
