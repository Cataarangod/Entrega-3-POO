package Capitulo4;

import javax.swing.*;
import java.awt.event.*;

public class Empleado {
    private String codigoEmpleado, nombreEmpleado;
    private double horasTrabajadas, valorHora, porcentajeReteFuente, salarioBruto, salarioNeto;
    private JPanel empleadoForm;
    private JTextPane txtCodigo, txtNombre, txtValorHora, txtHorasTrabajadas, txtPorcReteFuente;
    private JLabel lblCodigo, lblNombre, lblValorHora, lblHorasTrabajadas, lblPorcReteFuente;
    private JButton btnGuardar;

   public Empleado(String codigoEmpleado, String nombreEmpleado,
             double horasTrabajadas, double valorHora, double porcentajeReteFuente){
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeReteFuente = porcentajeReteFuente;
    }

    public Empleado() {
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingEmployeeInfo();
            }
        });
    }

    public void loadForm(){
        //add the frame
        JFrame f = new JFrame("Empleado");
        f.setContentPane(new Empleado().empleadoForm);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        //set the location (x,y)
        f.setLocation(250, 60);
        f.setVisible(true);
        f.setResizable(false);
    }


    public void settingEmployeeInfo () {
        System.out.println("Ingresa los datos");
        this.codigoEmpleado = txtCodigo.getText();
        this.nombreEmpleado = txtNombre.getText();
        System.out.println(codigoEmpleado);
    }
}