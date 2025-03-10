import java.util.Collection;
import java.util.Scanner;

public class Main {                                        
    public static void main(String[] args) {        //creates a new library queue object
        Scanner scan = new Scanner(System.in);
        Library library = new Library();

        System.out.print("1 Play\n2 Skip\n3 Add \n4 Remove \n5 Sort \n6 Shuffle \n7 Find \n8 Exit \n" );    // main queue menu
        int opt = scan.nextInt();


        if(opt == 1) {                                                                    // if else ladder for every menu option 
            System.out.println("Now Playing"+ library.getNextItem());
        } else if (opt == 2) {
            System.out.println("Skipped");
            library.skipNextItem();
        } else if (opt == 3) {
            System.out.println("Enter Title> ");
            library.addItem(scan.nextLine());
            System.out.println("Added");
        }
        else if (opt == 4){
            System.out.println("What Do You Want To Remove?> ");
            System.out.println(library.collection);
            library.removeItem(scan.nextLine());
            System.out.println("Removed");
        } else if (opt == 5) {
            System.out.println("Sorted");
            library.sortAlphabet();
        }
        else if (opt == 6){
            System.out.println("Shuffled");
            library.shuffle();
        }
        else if (opt == 7){
            System.out.println("What Are You Looking For?> ");
            System.out.println(library.find(scan.nextLine()));
        }
        else if (opt == 8){
            System.exit(0);
        }

    }
}
