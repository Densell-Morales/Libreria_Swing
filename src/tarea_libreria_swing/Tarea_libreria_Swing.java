
package tarea_libreria_swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Tarea_libreria_Swing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Etiqueta"));
        frame.add(new JButton("Botón"));
        frame.add(new JTextField(10));
        frame.add(new JCheckBox("Casilla de verificación"));
        frame.add(new JRadioButton("Botón de opción"));
        frame.add(new JToggleButton("Botón de alternancia"));
        frame.add(new JComboBox<>(new String[]{"Opción 1", "Opción 2", "Opción 3"}));
        frame.add(new JList<>(new String[]{"Elemento 1", "Elemento 2", "Elemento 3"}));
        frame.add(new JTextArea(5, 20));
        frame.add(new JScrollPane(new JTextArea(5, 20)));

        frame.setVisible(true);
    
    }
    
}
