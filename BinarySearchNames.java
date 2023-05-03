import java.util.Scanner;

class BinarySearchNames {
    public static void main(String[] args) {
        String[] names = new String[10];
        int first = 0, last = 9, mid, pos = -1;
        String searchName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 names in ascending order:");

        // Reading in the names
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }

        // Prompting for the name to search for
        System.out.println("Enter a name to search for:");
        searchName = scanner.nextLine();

        // Performing the binary search
        while (first <= last) {
            mid = (first + last) / 2;

            if (names[mid].compareTo(searchName) < 0) {
                first = mid + 1;
            } else if (names[mid].compareTo(searchName) == 0) {
                pos = mid + 1;
                break;
            } else {
                last = mid - 1;
            }
        }

        // Printing the result
        if (pos == -1) {
            System.out.println("Name not found");
        } else {
            System.out.println("Name found at position " + pos);
        }
    }
}
