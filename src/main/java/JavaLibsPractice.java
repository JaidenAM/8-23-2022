import javax.swing.JOptionPane;


public class JavaLibsPractice {
    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Enter your name");

        String input1 = (String)JOptionPane.showInputDialog(null,
                "Where are you from?",
                "Dialog Title",
                1,
                null,
                null,
                "Type something here.");

        String[] acceptableValues = {"Middletown", "New Castle", "Wilmington"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "In " + input1 + " " + "Where are you from?",
                "Dialog Title",
                1,
                null,
                acceptableValues,
                acceptableValues[1]);

        String input7 = (String)JOptionPane.showInputDialog(null,
                "Favorite color?",
                "Dialog Title",
                1,
                null,
                null,
                "Type something here.");

        String input8 = (String)JOptionPane.showInputDialog(null,
                "Favorite Movie?",
                "Dialog Title",
                0,
                null,
                null,
                "Type something here.");

        int input3 = (int)JOptionPane.showInputDialog(null,
                "How much wood could a woodchuck chuck?",
                "Dialog Title",
                1,
                null,
                null,
                "Type here!!!!");
        int input4 = (int)JOptionPane.showInputDialog(null,
                "How many sea shells did sally pickup on the sea shore?",
                "Dialog Title",
                1,
                null,
                null,
                "Type here!!!!");
        JOptionPane.showMessageDialog(null,
                "Together its" + input3 + input4,
                "Title",
                2);
        double input5 = (double)JOptionPane.showInputDialog(null,
                "How many coins do you have?",
                "Dialog Title",
                1,
                null,
                null,
                "Type here!!!!");

        double input6 = (double)JOptionPane.showInputDialog(null,
                "How many coins does your mom have?",
                "Dialog Title",
                1,
                null,
                null,
                "Type here!!!!");

        JOptionPane.showMessageDialog(null,
                "Together its" + input6 + input5,
                "Title",
                2);
        String[] acceptableValues2 = {"Yes", "No", "Yes?"};
        String input9 = (String)JOptionPane.showInputDialog(null,
                "Did you like the test ",
                "Dialog Title",
                1,
                null,
                acceptableValues,
                acceptableValues[1]);

    }
}
