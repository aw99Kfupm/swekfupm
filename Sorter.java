public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("1&2");

    }
    // Ra
    public static ArrayList<String> readStudentList(String filePath) {
        ArrayList<String> studentList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextline()) {
                studentList.add(scanner.next());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return studentList;
    }
}
