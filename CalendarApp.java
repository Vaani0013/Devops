import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarApp extends JFrame implements ActionListener {
    private JLabel monthLabel;
    private JButton prevButton, nextButton;
    private JPanel calendarPanel;

    private Calendar currentCalendar;

    public CalendarApp() {
        setTitle("Calendar App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        currentCalendar = Calendar.getInstance();
        currentCalendar.set(Calendar.DAY_OF_MONTH, 1);

        monthLabel = new JLabel();
        updateMonthLabel();

        prevButton = new JButton("<< Prev");
        prevButton.addActionListener(this);

        nextButton = new JButton("Next >>");
        nextButton.addActionListener(this);

        calendarPanel = new JPanel(new GridLayout(7, 7));

        add(monthLabel, BorderLayout.NORTH);
        add(prevButton, BorderLayout.WEST);
        add(nextButton, BorderLayout.EAST);
        add(calendarPanel, BorderLayout.CENTER);

        updateCalendarView();

        setVisible(true);
    }

    private void updateMonthLabel() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
        monthLabel.setText(dateFormat.format(currentCalendar.getTime()));
    }

    private void updateCalendarView() {
        calendarPanel.removeAll();

        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (String day : daysOfWeek) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            calendarPanel.add(label);
        }

        int firstDayOfWeek = currentCalendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = currentCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        for (int day = 1; day <= daysInMonth; day++) {
            JButton button = new JButton(String.valueOf(day));
            button.addActionListener(this);
            calendarPanel.add(button);
        }

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {
            currentCalendar.add(Calendar.MONTH, -1);
        } else if (e.getSource() == nextButton) {
            currentCalendar.add(Calendar.MONTH, 1);
        } else if (e.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) e.getSource();
            int day = Integer.parseInt(clickedButton.getText());
            currentCalendar.set(Calendar.DAY_OF_MONTH, day);
            JOptionPane.showMessageDialog(this, "You clicked on " + day);
        }

        updateMonthLabel();
        updateCalendarView();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalendarApp());
    }
}
