import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("1&2");

        ArrayList<String> studentList = readStudentList("Student List.txt");// alhumdellah we have done this in day1

    }
    public static ArrayList<String> readStudentList(String filePath) {
        ArrayList<String> studentList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                studentList.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            }

        return studentList; // student: 202160310, 202261920
    }

}
