import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Queue<String> grocery = new PriorityQueue<>();
    private static HashMap<String,Integer> medicine = new HashMap<>();
    private static Stack<String> homeStuff = new Stack<>();
    public static void main(String[] args) {


    }

    private static void Controller(){
        System.out.println("1) add\n2) get");
        int commandId = scanner.nextInt();
        scanner.nextLine();
        switch (commandId){
            case 1 -> {}
            case 2 -> {}
            default -> {
                System.out.println("invalid input !!!");
            }
        }
    }


    private static void add(){
        System.out.println("choose your list");
        System.out.println("1) medicine\n2) grocery\n3) home stuff");
        int commandId = scanner.nextInt();
        scanner.nextLine();
        if (commandId == 1){

        } else if (commandId == 2) {

        }

        else if(commandId == 3){

        }
        else
            System.out.println("invalid input !!!");
    }

    private static void get(){

    }



    private static void addMedicine(){
        System.out.print("Priority <<1,10>>: ");
        int pri = scanner.nextInt();
        scanner.nextLine();
        System.out.print("your chores: ");
        String input = scanner.nextLine();
        medicine.put(input,pri);

    }

    private static void addGrocery{
        System.out.print("enter your grocery task: ");
        String task = scanner.nextLine();
        grocery.offer(task);
    }

    private static void addHomeStuff(){
        System.out.print("enter your task: ");
        String task = scanner.nextLine();
        homeStuff.push(task);
    }

    private static void get



}