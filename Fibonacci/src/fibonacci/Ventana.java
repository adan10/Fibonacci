package fibonacci;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener{
    
     JLabel numero,fibonacci,factorial;
    JTextField tenumero;
    JButton factorial1,fibonacci1;

    public Ventana(){
    configurarVentana();
    añadirComponentes();
    
    }
//configuracion de la ventana
    private void configurarVentana() {
        setTitle("Convertidor 1.0");
            setSize(1000, 500);
            setLocationRelativeTo(null);
            setLayout(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
//agrega componentes a la ventana
    private void añadirComponentes() {
        
        //JLabel
        numero= new JLabel("Escibe un número:");
        numero.setBounds(100, 100, 150, 50);
        
        add(numero);
        
        fibonacci = new JLabel("Número en Factorial");
        fibonacci.setBounds(375, 300, 150, 50);
        add(fibonacci);
        factorial = new JLabel("Número en Fibonacci");
        factorial.setBounds(375, 150, 150, 50);
        add(factorial);
        
        //JButton     JButton factorial1,fibonacci1;
       
        factorial1 = new JButton("Factorial");
        factorial1.setBounds(500, 300, 150, 50);
        factorial1.setBackground(Color.decode("#0126a0"));
        factorial1.setForeground(Color.white);
        factorial1.setBorderPainted(false);
        add(factorial1);
        factorial1.addActionListener(this);
        factorial1.setVisible(true);
        
        
        fibonacci1 = new JButton("Fibonacci");
        fibonacci1.setBounds(500, 150, 150, 50);
        fibonacci1.setBackground(Color.decode("#4e01a0"));
        fibonacci1.setForeground(Color.white);
        fibonacci1.setBorderPainted(false);
        add(fibonacci1);
        fibonacci1.addActionListener(this);
        fibonacci1.setVisible(true);
        
        //JTextFiel
        
        tenumero = new JTextField();
        tenumero.setBounds(150, 150, 150, 50);
        tenumero.addActionListener(this);
        add(tenumero);
        tenumero.setVisible(true);
    }
    //valida que sea un numero o este vacio 
    public boolean Valida(){
        int valida=0;
        String num=tenumero.getText();
        boolean val=true;
        try
        {
            valida =Integer.parseInt(num);
        
        }catch(Exception e){
            //manda mensaje de error
       JOptionPane.showMessageDialog(this, "Escribe solo numeros (enteros) ");
       val=false;
        }
        return val;
    /*
        @return: val
        */
    }

    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
         int resultado=0;
         String result;
         int prueba=0;
    if(Valida()){
        //Acciones si es factorial
        if(e.getSource() == factorial1 ){
           Factorial obj = new Factorial();
            resultado = obj.operacion(Integer.parseInt(tenumero.getText()));
            JOptionPane.showMessageDialog(this, "Su resultado " +resultado);
        }else if(e.getSource() == fibonacci1){
            //Acciones si es fibonacci
         Fibonacci1 fino = new Fibonacci1();
         result=fino.operacion(Integer.parseInt(tenumero.getText()));
          JOptionPane.showMessageDialog(this, "Su resultado " +result);
        }
    
    }
    
    }
}

