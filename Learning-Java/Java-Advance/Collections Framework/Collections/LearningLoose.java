import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LearningLoose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to make ArrayList (1) or a LinkedList (2)?");
        int first_input = scanner.nextInt();

        System.out.println("Enter the Size of the Collection Object : ");
        int size_obj = scanner.nextInt();

        System.out.println("You chose " + first_input + " and the size to be " + size_obj);

        if (first_input == 1){
            CustomArrayList customArrayList = new CustomArrayList();
            customArrayList.arrayed(size_obj);
        } else if (first_input == 2) {
            CustomLinkedList customLinkedList = new CustomLinkedList();
            customLinkedList.linked(size_obj);
        }
        else {
            System.out.println("Enter a Valid Input");
        }

    }
}

class CustomArrayList {
    void arrayed(int array_size){
        ArrayList<Object> arrayList = new ArrayList<>();
        int i = 0;
        Scanner arrayScanner = new Scanner(System.in);

        while (i<array_size){
            System.out.println("Enter the Values of ArrayList upto "+ array_size+ " values");
            String arrayValues = arrayScanner.next();
            arrayList.add(arrayValues);
            i++;
        }

        System.out.println(arrayList);
        System.out.println("Do you want to Fetch Values of the ArrayList (Y/N)");
        String wantsArrayValues = arrayScanner.next();

        if (wantsArrayValues.equalsIgnoreCase("Y")){
            System.out.println("Enter the Index of the ArrayList");
            int indexArrayList = arrayScanner.nextInt();
            if (indexArrayList >= 0 && indexArrayList < array_size){
                Object valueOfArrayAtIndex = arrayList.get(indexArrayList);
                System.out.println(valueOfArrayAtIndex);
            }
            else {
                System.out.println("Enter a valid Index");
            }
        } else if (wantsArrayValues.equalsIgnoreCase("N")) {
            System.out.println("Okay, Thanks for using ArrayList");
        }
    }
}

class CustomLinkedList {
    Scanner linkedListScanner = new Scanner(System.in);
    int j = 0;
    void linked(int ll_size){
        LinkedList<Object> linkedList = new LinkedList<>();

        while (j < ll_size){
            System.out.println("Enter the Values of Linked List upto "+ ll_size+ " values");
            String listValues = linkedListScanner.next();
            linkedList.add(listValues);
            j++;
        }

        System.out.println(linkedList);
        System.out.println("Do you want to Fetch Values from the LinkedList? (Y/N)");
        String wantsListValues = linkedListScanner.next();

        if (wantsListValues.equalsIgnoreCase("Y")){
            System.out.println("Enter the Index you want to fetch");
            int indexLinkedList = linkedListScanner.nextInt();
            if (indexLinkedList >= 0 && indexLinkedList < ll_size){
                Object valueOfListAtIndex = linkedList.get(indexLinkedList);
                System.out.println(valueOfListAtIndex);
            }
            else {
                System.out.println("Enter a Valid Index");
            }
        } else if (wantsListValues.equalsIgnoreCase("N")) {
            System.out.println("Thanks, Your LinkedList has been Created");
        }
        else {
            System.out.println("learn to read the whats written");
        }
    }
}

