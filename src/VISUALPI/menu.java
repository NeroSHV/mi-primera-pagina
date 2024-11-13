package VISUALPI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {

    public menu() {
        setTitle("Página de Inicio");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        JButton inicioButton = new JButton("Inicio");
        inicioButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Regresando a la página de inicio..."));
        JButton ingresarButton = new JButton("Ingresar");
        ingresarButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Iniciar sesión..."));

        topPanel.add(inicioButton, BorderLayout.WEST);
        topPanel.add(ingresarButton, BorderLayout.EAST);

        JPanel centerPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton entradasButton = new JButton("Entradas");
        JButton platoFuerteButton = new JButton("Plato Fuerte");
        JButton adicionesButton = new JButton("Adiciones");
        JButton postresButton = new JButton("Postres");
        JButton menuInfantilButton = new JButton("Menú Infantil");

        entradasButton.addActionListener(new MenuButtonListener("Entradas"));
        platoFuerteButton.addActionListener(new MenuButtonListener("Plato Fuerte"));
        adicionesButton.addActionListener(new MenuButtonListener("Adiciones"));
        postresButton.addActionListener(new MenuButtonListener("Postres"));
        menuInfantilButton.addActionListener(new MenuButtonListener("Menú Infantil"));

        centerPanel.add(entradasButton);
        centerPanel.add(platoFuerteButton);
        centerPanel.add(adicionesButton);
        centerPanel.add(postresButton);
        centerPanel.add(menuInfantilButton);

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
    }

    private class MenuButtonListener implements ActionListener {
        private String section;

        public MenuButtonListener(String section) {
            this.section = section;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(menu.this, "Accediendo a " + section + "...");
        }
    }

   public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }
}

