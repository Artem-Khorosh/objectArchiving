import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Encrypted");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        GUIForm form = new GUIForm();
        frame.add(form.getRootPanel());
        frame.setVisible(true);

    }
}
