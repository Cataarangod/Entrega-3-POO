package Capitulo4;

import javax.swing.*;
import java.awt.event.*;
import java.text.MessageFormat;

public class Empleado {
    private String codigoEmpleado, nombreEmpleado;
    private double horasTrabajadas, valorHora, porcentajeReteFuente, salarioBruto, salarioNeto;
    private JPanel empleadoForm;
    private JTextPane txtCodigo, txtNombre, txtValorHora, txtHorasTrabajadas, txtPorcReteFuente;
    private JLabel lblCodigo, lblNombre, lblValorHora, lblHorasTrabajadas, lblPorcReteFuente;
    private JButton btnGuardar;
    private JLabel lblInformacionEmpleado;
    private JLabel lblResultadoSalario;

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
        f.pack();
        //set the location (x,y)
        f.setLocation(250, 60);
        f.setVisible(true);
        f.setResizable(false);
    }


    public void settingEmployeeInfo () {
        this.codigoEmpleado = txtCodigo.getText();
        this.nombreEmpleado = txtNombre.getText();
        this.horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        this.valorHora = Double.parseDouble(txtValorHora.getText());
        this.porcentajeReteFuente = Double.parseDouble(txtPorcReteFuente.getText())/100;
        calcularSalarioBruto();
        lblInformacionEmpleado.setText(MessageFormat.format("Código de empleado: {0} \n Nombre: {1} \n",
                this.codigoEmpleado, this.nombreEmpleado));
        lblResultadoSalario.setText(MessageFormat.format("Salario bruto: {0} \n Salario neto: {1} ",this.salarioBruto, this.salarioNeto));
    }

    private void calcularSalarioBruto(){
        salarioBruto = horasTrabajadas * valorHora;
        calcularSalarioNeto();
    }
    private void calcularSalarioNeto() {
        System.out.println(salarioBruto);
        salarioNeto = salarioBruto - (salarioBruto * porcentajeReteFuente);
    }
}