public class CarTesting {
    public static void main(String[] args)
    {
        //Object type   name            calling the constructor
        Car             hritikCar = new Car("Ferrari","760","red",2019,1);
        Car             shenMobile = new Car("Mazda","RX7","blue",1998, 12000);

        System.out.printf("Hritik's car is: %s%n", hritikCar.toString());
        System.out.printf("Shen's   car is: %s%n", shenMobile.toString());
    }
}
