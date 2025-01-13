import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ChooseWisely {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to Use ArrayList (1) or LinkedList (2): ");
        int choice = sc.nextInt();
        System.out.print("Enter the Size of the Collection Object: ");
        int size = sc.nextInt();

        if (choice == 1){
            ArrayList<String> al = new ArrayList<>();
            int i = 0;

            while (i < size){
                System.out.println("Enter Values for ArrayList: ");
                String arl = sc.next();
                al.add(arl);
                i++;
            }
            System.out.println("Your ArrayList is : "+ al);

            System.out.println("Do you want to Get Values from your ArrayList? (Y/N)");
            String ArValues = sc.next();
            if (ArValues.equalsIgnoreCase("Y")){
                System.out.println("What Index do you want to Fetch?");
                int ArIndex = sc.nextInt();
                String Arget = al.get(ArIndex);
                System.out.println(Arget);
            }
            else if (ArValues.equalsIgnoreCase("N"))
            {
                System.out.println("Thank you");
            }
            else {
                System.out.println("Enter a Valid Input");
            }
        }
        else if (choice == 2) {
            LinkedList<String> ll = new LinkedList<>();
            int j = 0;

            while (j < size){
                System.out.println("Enter Values for LinkedList: ");
                String lil = sc.next();
                ll.add(lil);
                j++;
            }

            System.out.println("Do you want to fetch Values from your LinkedList? (Y/N)");
            String llValues = sc.next();
            if (llValues.equalsIgnoreCase("Y")){
                System.out.println("Which index would you like to Fetch");
                int llIndex = sc.nextInt();
                if (llIndex >= 0 && llIndex < ll.size()){
                    String llget=ll.get(llIndex);
                    System.out.println(llget);
                }
                else {
                    System.out.println("Enter a Valid Index");

                }
            } else if (llValues.equalsIgnoreCase("N")) {
                System.out.println("Okay, Thanks for being here");
            }

            System.out.println("You LinkedList is : "+ll);
        }
        else {
            System.out.println("Choose a valid Option ");
        }

    }
}
