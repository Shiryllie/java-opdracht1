public class Main {
    public static void main(String[] args) {
        int number = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Corrie";
        hello();
        positiveOrNegative(number);
        positiveOrNegativeOrZero(number);
        bartender(name);
        sum(input1, input2);

    }

    public static void hello() {
        System.out.println("Hello world!");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void bartender(String name) {
        switch (name) {
            case "Henk":
                System.out.println(name + " " + "wilt een Baco!");
                break;
            case "Jaap":
                System.out.println(name + " " + "wilt een Boswandeling!");
                break;
            default:
                System.out.println(name + " " + "wilt gewoon een biertje!");


        }
    }

    public static void sum(int input1, int input2) {
        System.out.println("input1 summed by input2"+ " = " + (input1 + input2));
    }
}






