import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacionEcuacion extends JFrame {
    private JTextField campoA;
    private JTextField campoB;
    private JTextField campoC;
    private JButton botonCalcular;
    private JLabel etiquetaResultado;

    public AplicacionEcuacion() {
        setTitle("Calculadora de Ecuación Cuadrática");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new GridLayout(4, 2));
        panelEntrada.setBackground(Color.LIGHT_GRAY);

        JLabel etiquetaA = new JLabel("Coeficiente A:");
        campoA = new JTextField();
        JLabel etiquetaB = new JLabel("Coeficiente B:");
        campoB = new JTextField();
        JLabel etiquetaC = new JLabel("Coeficiente C:");
        campoC = new JTextField();
        botonCalcular = new JButton("Calcular");
        botonCalcular.setPreferredSize(new Dimension(150, 30));

        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double coefA = Double.parseDouble(campoA.getText());
                    double coefB = Double.parseDouble(campoB.getText());
                    double coefC = Double.parseDouble(campoC.getText());

                    double discriminante = coefB * coefB - 4 * coefA * coefC;

                    if (discriminante > 0) {
                        double raiz1 = (-coefB + Math.sqrt(discriminante)) / (2 * coefA);
                        double raiz2 = (-coefB - Math.sqrt(discriminante)) / (2 * coefA);
                        etiquetaResultado.setText("Raíz 1 (x1): " + raiz1 + " | Raíz 2 (x2): " + raiz2);
                    } else if (discriminante == 0) {
                        double raizUnica = -coefB / (2 * coefA);
                        etiquetaResultado.setText("Raíz única (x): " + raizUnica);
                    } else {
                        etiquetaResultado.setText("No hay soluciones reales.");
                    }
                } catch (NumberFormatException ex) {
                    etiquetaResultado.setText("Ingrese valores válidos.");
                }
            }
        });

        panelEntrada.add(etiquetaA);
        panelEntrada.add(campoA);
        panelEntrada.add(etiquetaB);
        panelEntrada.add(campoB);
        panelEntrada.add(etiquetaC);
        panelEntrada.add(campoC);
        panelEntrada.add(new JLabel()); // Espacio en blanco
        panelEntrada.add(botonCalcular);

        etiquetaResultado = new JLabel("", SwingConstants.CENTER);
        etiquetaResultado.setPreferredSize(new Dimension(300, 30));

        add(panelEntrada, BorderLayout.CENTER);
        add(etiquetaResultado, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AplicacionEcuacion();
    }
}
