public class Main_File {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().CreateAndShowGUI();
            }
        });
    }
}
