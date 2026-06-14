package View;
import Controller.*;
import Model.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.sql.Connection;

public class NavPanelAdmin extends JPanel {
    private Connection conn;
    public JButton scheduleBtn = new JButton("Schedule");
    public JButton tutorBtn = new JButton("Tutor");
    public JButton studentBtn = new JButton("Student");
    public JButton paymentBtn = new JButton("Payment");
    public JButton coursesBtn = new JButton("Manage Course");
    public JButton classBtn = new JButton("Manage Class");

    public NavPanelAdmin() {
        this.setLayout(new BorderLayout());
        JPanel isiNavPanel = new JPanel();
        isiNavPanel.setLayout(new BoxLayout(isiNavPanel, BoxLayout.Y_AXIS));
        isiNavPanel.setBackground(new Color(138, 194, 221));
        this.setBackground(new Color(138, 194, 221));
        this.setBorder(new EmptyBorder(10, 10, 10, 10));

        setNavButtons(scheduleBtn, "images/schedule.png");
        setNavButtons(tutorBtn, "images/teacher.png");
        setNavButtons(studentBtn, "images/student.png");
        setNavButtons(paymentBtn, "images/pay.png");
        setNavButtons(coursesBtn, "images/book.png");
        setNavButtons(classBtn, "images/room.png");
        isiNavPanel.add(scheduleBtn);
        isiNavPanel.add(tutorBtn);
        isiNavPanel.add(studentBtn);
        isiNavPanel.add(paymentBtn);
        isiNavPanel.add(coursesBtn);
        isiNavPanel.add(classBtn);

        this.add(isiNavPanel, BorderLayout.NORTH);

        JLabel imgLabel = new JLabel();
        ImageIcon mascot = new ImageIcon(new ImageIcon("images/maskot_cowo.png").getImage().
                getScaledInstance(180, 180, Image.SCALE_SMOOTH));
        imgLabel.setIcon(mascot);
        this.add(imgLabel, BorderLayout.SOUTH);
    }

    private void setNavButtons(JButton button, String iconPath) {
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setPreferredSize(new Dimension(180, 50));
        button.setBackground(new Color(138, 194, 221));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(138, 194, 221)));
        button.setIconTextGap(10);
        button.setIcon(new ImageIcon(new ImageIcon(iconPath).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH)));

        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(9, 239, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(138, 194, 221));
            }
        });
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    public Connection getConnection() {
        return conn;
    }
}
