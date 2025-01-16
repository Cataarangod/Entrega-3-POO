package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianguloEquilatero {
    int lado;
    private JPanel TrianguloEquilateroForm;
    private JTextPane txtlado, txtAltura, txtPerimetro, txtArea;
    private JButton btnCalcular, btnLimpiar;

    public TrianguloEquilatero(int lado) {
        this.lado = lado;
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                calcularArea();
                calcularPerimetro();
                calcularAltura();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtlado.setText("");
                txtArea.setText("");
                txtPerimetro.setText("");
                txtAltura.setText("");
            }
        });
    }

    public void loadForm() {
        JFrame f = new JFrame("Triángulo equilatero");
        f.setContentPane(new TrianguloEquilatero(3).TrianguloEquilateroForm);
        f.pack();
        f.setLocation(400, 65);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo() {
        this.lado = Integer.parseInt(txtlado.getText());
    }

    private void calcularArea() {
        txtArea.setText(String.valueOf(Math.sqrt(3) / 4 * (lado * lado)));
    }

    private void calcularPerimetro() {
        txtPerimetro.setText(String.valueOf(lado * 3));
    }

    private void calcularAltura() {
        txtAltura.setText(String.valueOf(Math.sqrt(3) * lado / 2));
    }

    double getAltura() {
        return Double.parseDouble(String.valueOf(Math.sqrt(3) * lado / 2));
    }

    double getArea() {
        return Double.parseDouble(String.valueOf(Math.sqrt(3) / 4 * (lado * lado)));
    }

    double getPerimetro() {
        return Double.parseDouble(String.valueOf(lado * 3));
    }
}
