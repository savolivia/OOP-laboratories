public class Main{
    public static void main(String[] args){
        System.out.println("Basic Level:");

        Box b1 = new Box();
        Box b2 = new Box(17);
        Box b3 = new Box(22, 5, 20);

        System.out.println("The value of the box size is: "+ b3.showResult());
        System.out.println("The value of box surface is: " + b3.getSurfaceArea() + "cm2");
        System.out.println("The value of box volume is: " + b3.getVolume() + "cm3");

        System.out.println("\nAdvanced Levels:");

        Queue q1 = new Queue(7);
        Queue q2 = new Queue();

        System.out.println("\nFirst queue:");
        q1.push(13);
        q1.push(155);
        q1.push(32);

        q1.pop();
        q1.isEmpty();
        q1.isFull();

        System.out.println("The queue has " + q1.size() + " elements.");

        System.out.println("\nSecond queue:");
        q2.push(73);
        q2.push(19);
        q2.push(65);

        q2.pop();
        q2.isEmpty();
        q2.isFull();

        System.out.println("The queue has " + q2.size() + " elements.");
    }


}