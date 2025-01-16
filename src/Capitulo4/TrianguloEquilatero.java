package Capitulo4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianguloEquilatero {
    double lado;
    private JPanel trianguloEquilateroloForm;
    private JTextPane txtLado, txtPerimetro, txtArea;
    private JButton btnCalcular, btnLimpiar;
    private JTextPane txtAltura;

    public TrianguloEquilatero(double lado) {
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
                txtLado.setText("");
                txtArea.setText("");
                txtAltura.setText("");
                txtPerimetro.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Triángulo equilátero");
        f.setContentPane(new TrianguloEquilatero(3).trianguloEquilateroloForm);
        f.pack();
        f.setLocation(400, 65);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo(){
        this.lado = Integer.parseInt(txtLado.getText());
    }

    private void calcularArea() {
        txtArea.setText(String.valueOf((Math.sqrt(3)/4)*Math.pow(lado, 2)));
    }

    private void calcularPerimetro() {
        txtPerimetro.setText(String.valueOf(lado*3));
    }

    private void calcularAltura() {
        txtAltura.setText(String.valueOf((Math.sqrt(3)*lado)/2));
    }
}
