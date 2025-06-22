public class MVCPatternDemo {
    public static void main(String[] args) {
        // Step 1: Create the model
        Student student = new Student("Keerthana", "S101", "A");

        // Step 2: Create the view
        StudentView view = new StudentView();

        // Step 3: Create the controller
        StudentController controller = new StudentController(student, view);

        // Step 4: Display initial data
        controller.updateView();

        // Step 5: Update model data using controller
        controller.setStudentName("praveen");
        controller.setStudentGrade("B+");

        // Step 6: Display updated data
        controller.updateView();
    }
}
