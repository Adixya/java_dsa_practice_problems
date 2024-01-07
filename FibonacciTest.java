import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonacciTest extends JFrame {
    private JTextArea outputArea;
    private JButton generateButton;
    private int currentFib = 1;
    private int previousFib = 0;

    public FibonacciTest() {
        super("Fibonacci Sequence Generator");

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        generateButton = new JButton("Generate Fibonacci Number");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateNextFibonacci();
            }
        });

        setLayout(new FlowLayout());
        add(scrollPane);
        add(generateButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void generateNextFibonacci() {
        int nextFib = currentFib + previousFib;
        previousFib = currentFib;
        currentFib = nextFib;

        outputArea.append(currentFib + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FibonacciTest());
    }
}
