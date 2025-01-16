package Dashboard;

import Capitulo4.*;
import FigurasGeometricas.*;

import javax.swing.*;
import java.awt.event.*;

public class Dashboard {
    private JPanel dashboardForm;
    private JButton btnCirculo, btnEjercicio19, btnEjercicio7, btnEjercicio10, btnEjercicio22;
    private JButton btnEjercicio23, btnEjercicio40, btnEjercicio41;
    private JButton btnDashboardFiguras;

    public Dashboard() {
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Empleado empleado = new Empleado();
                empleado.loadForm();
            }
        });
        btnEjercicio19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrianguloEquilatero miTriangulo = new TrianguloEquilatero(3);
                miTriangulo.loadForm();
            }
        });
        btnEjercicio7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Capitulo4.ComparadorAB comparador = new Capitulo4.ComparadorAB();
                comparador.loadForm();
            }
        });
        btnEjercicio10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Capitulo4.Matricula matricula = new Capitulo4.Matricula();
                matricula.loadForm();
            }
        });
        btnEjercicio22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Capitulo4.Salario salario = new Capitulo4.Salario();
                salario.loadForm();
            }
        });
        btnEjercicio23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Capitulo4.FormulaCuadratica cuadratica = new Capitulo4.FormulaCuadratica();
                cuadratica.loadForm();
            }
        });
        btnEjercicio40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Capitulo5.CalculosEnterosPositivos calculo = new Capitulo5.CalculosEnterosPositivos();
                calculo.loadForm();
            }
        });
        btnEjercicio41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Capitulo5.MayorValorLista mayor = new Capitulo5.MayorValorLista();
                mayor.loadForm();
            }
        });
        btnDashboardFiguras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DashboardFiguras dashboardFiguras = new DashboardFiguras();
                dashboardFiguras.loadForm();
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Menú principal");
        f.setContentPane(new Dashboard().dashboardForm);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }
}
