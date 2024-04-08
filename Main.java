import java.util.Scanner;

public class Main {
    // Define the number of people as N
    static final int N = 26;
    static boolean[] contacted = new boolean[N];
    static boolean checkOnce = true;

    // Function to initiate contact with a person
    public static void contact(char person) {
        if (contacted[person - 'A']) return;
        contacted[person - 'A'] = true;
        System.out.print(person + ", ");
        if (checkOnce) {
            contactedFriends(person);
            checkOnce = false;
        }
        // Switch case to determine contacts based on the person contacted
        switch (person) {
            case 'A':
                contact('B');
                contact('C');
                contact('J');
                break;
            case 'D':
                contact('E');
                contact('F');
                contact('G');
                break;
            case 'H':
                contact('I');
                contact('K');
                contact('V');
                break;
            case 'J':
                contact('V');
                break;
            case 'K':
                contact('L');
                contact('M');
                contact('N');
                contact('A');
                break;
            case 'O':
                contact('P');
                contact('V');
                contact('U');
                break;
            case 'Q':
                contact('S');
                contact('T');
                contact('D');
                break;
            case 'U':
                contact('H');
                contact('J');
                break;
            case 'V':
                contact('W');
                contact('X');
                contact('Y');
                contact('Z');
                break;
        }
    }

    // Function to initiate contacts with predefined friends based on the contacted person
    public static void contactedFriends(char person) {
        if (person == 'B' || person == 'C' || person == 'J') {
            contact('B');
            contact('C');
            contact('J');
        }
        if (person == 'E' || person == 'F' || person == 'G') {
            contact('E');
            contact('F');
            contact('G');
        }
        if (person == 'I' || person == 'K' || person == 'V') {
            contact('I');
            contact('K');
            contact('V');
        }
        if (person == 'L' || person == 'M' || person == 'N' || person == 'A') {
            contact('L');
            contact('M');
            contact('N');
            contact('A');
        }
        if (person == 'P' || person == 'V' || person == 'U') {
            contact('P');
            contact('V');
            contact('U');
        }
        if (person == 'S' || person == 'T' || person == 'D') {
            contact('S');
            contact('T');
            contact('D');
        }
        if (person == 'H' || person == 'J') {
            contact('H');
            contact('J');
        }
        if (person == 'W' || person == 'X' || person == 'Y' || person == 'Z') {
            contact('W');
            contact('X');
            contact('Y');
            contact('Z');
        }
    }

    // Main function to start the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startingCandidate = scanner.next().charAt(0);
        contact(startingCandidate);
        scanner.close();
    }
}
