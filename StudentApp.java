import gui.StudentWindow;


/**
 * ეს პროექტი განკუთვნილია სტუდენტებისთვის
 */
public class StudentApp {

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentWindow sw = new StudentWindow();
                sw.createAndShowGUI();
            }
        });
    }
}
