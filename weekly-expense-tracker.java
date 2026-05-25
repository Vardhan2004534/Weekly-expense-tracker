import javax.swing.*;
import java.awt.*;


public class WeeklyExpenseTracker extends JFrame {

    public WeeklyExpenseTracker() {

        setTitle("Weekly Expense Tracker");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
    }

public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new WeeklyExpenseTracker().setVisible(true);
        });
    }
}

