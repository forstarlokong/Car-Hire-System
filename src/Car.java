import java.util.*;

public class Car {
String Name;
String RegistrationNumber;
String Brand;
String Capacity;
    //This function is used to display all the properties of the vehicle.
void print(){
    System.out.println("Vehicle Name = "+Name);
    System.out.println("Vehicle Registration Number = "+RegistrationNumber);
    System.out.println("Vehicle Brand = "+Brand);
    System.out.println("Vehicle Capacity = "+Capacity);
}
}
// Then we need to have a class with the main method.
class CarMain{
    public static void main(String args[]){
        Car c1 = new Car();     //this is used to call class Car/vehicle.
        Car c2 = new Car();     //this is for the other cars or the second car.

        //we now accept input from the admin
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER VEHICLE Name");
        c1.Name = in.next();
        System.out.println("ENTER VEHICLE Registration Number");
        c1.RegistrationNumber = in.next();
        System.out.println("ENTER VEHICLE Brand");
        c1.Brand = in.next();
        System.out.println("ENTER VEHICLE Capacity");
        c1.Capacity = in.next();

        //we then accept input for the second vehicle.
        System.out.println("ENTER SECOND VEHICLE Name");
        c2.Name = in.next();
        System.out.println("ENTER SECOND VEHICLE Registration Number");
        c2.RegistrationNumber = in.next();
        System.out.println("ENTER SECOND VEHICLE Brand");
        c2.Brand = in.next();
        System.out.println("ENTER SECOND VEHICLE Capacity");
        c2.Capacity = in.next();

        //Then we display all the vehicles
        c1.print();
        c2.print();
    }
}
