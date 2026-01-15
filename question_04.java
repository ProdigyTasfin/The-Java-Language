// Using a provided dataset of student marks (Dave, Sakib, Eva, Mira, and Rayan), write a Java program.
// Method: Create a method named processExamData() that takes data for a specific exam and prints
// the name(s) of the student(s) who obtained the highest mark in that exam.
// Exams to Process: Quiz, Mid1, Mid2, Final, and, Project. 

public class question_04{

    
    public static void main(String[] args) {
        
        String[] names = {"Dave", "Sakib", "Eva", "Mira", "Rayan"};
        
        processExamData("Quiz",  new int[]{8, 9, 7, 9, 6}, names);
        processExamData("Mid1",  new int[]{20, 18, 22, 21, 19}, names);
        processExamData("Mid2",  new int[]{25, 24, 23, 25, 22}, names);
        processExamData("Final", new int[]{80, 85, 78, 85, 82}, names);
        processExamData("Project", new int[]{18, 20, 19, 20, 17}, names);
    }
}
static void processExamData(String examName, int[] marks, String[] names) {
    
            int max = marks[0];
            for (int i = 1; i < marks.length; i++) {
                if (marks[i] > max) {
                    max = marks[i];
                }
            }
    
            System.out.println(examName + " Top Scorer(s):");
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] == max) {
                    System.out.println(names[i]);
                }
            }
            System.out.println();
        }