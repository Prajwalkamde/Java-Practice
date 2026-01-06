public class Inheritance {
    public static void main(String[] args) {
        Passenger p1 = new Passenger();
        p1.takeOff();
        p1.fly();
        p1.carryPassenger();
        p1.land();
        System.out.println("_____________________");
        Fighter f1 = new Fighter();
        f1.takeOff();
        f1.fly();
        f1.carryWeapons();
        f1.land();
    }
}
class Plane{
    public void takeOff(){
        System.out.println("Plane take off");
    }
    public void fly(){
        System.out.println("Plane flying");
    }
    public void land(){
        System.out.println("Plane landing...");
    }
}

class Passenger extends Plane{
    public void carryPassenger(){
        System.out.println("Carrying passenger");
    }
}

class Fighter extends Plane{
    public void carryWeapons(){
        System.out.println("Carrying weapons");
    }
}
