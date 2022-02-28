/*
██████╗░██╗░░░██╗██╗  ███████╗██╗░░░░░██╗  ████████╗░█████╗░██╗░░░██╗░█████╗░██████╗░
██╔══██╗╚██╗░██╔╝╚═╝  ██╔════╝██║░░░░░██║  ╚══██╔══╝██╔══██╗██║░░░██║██╔══██╗██╔══██╗
██████╦╝░╚████╔╝░░░░  █████╗░░██║░░░░░██║  ░░░██║░░░██║░░██║╚██╗░██╔╝███████║██████╔╝
██╔══██╗░░╚██╔╝░░░░░  ██╔══╝░░██║░░░░░██║  ░░░██║░░░██║░░██║░╚████╔╝░██╔══██║██╔══██╗
██████╦╝░░░██║░░░██╗  ███████╗███████╗██║  ░░░██║░░░╚█████╔╝░░╚██╔╝░░██║░░██║██║░░██║
╚═════╝░░░░╚═╝░░░╚═╝  ╚══════╝╚══════╝╚═╝  ░░░╚═╝░░░░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝
*/

package Calculadora;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Calculadora_Class extends JFrame{
   
       private JButton [] botones = new JButton[15]; //Declarar Arreglo de Botones de 15 espacios.
       
       JButton res;
       JTextField caja1 = new JTextField();
       JTextField caja2 = new JTextField();
       JTextField caja3 = new JTextField();
       JTextField caja4 = new JTextField();
       JTextField [] cajas = {caja1, caja2};//Arreglo de Cajas.
       String operacionSeleccionada = "";//Operación de usuario seleccionada.
       int puntero = 0;//Puntero de caja (inicia en la caja 1).
       
       private class NumberActionListener implements ActionListener{//Crear clase que implementa ActionListener.

        @Override
        public void actionPerformed(ActionEvent e) {//Dar funcionalidad a los botones.
            
            if(e.getSource()==botones[0]){
                concatenarNumero("0");//Concatena en el puntero.
            }
            if(e.getSource()==botones[1]){
                concatenarNumero("1");
                //System.out.println("1");
            }
            if(e.getSource()==botones[2]){
                concatenarNumero("2");
               // System.out.println("2");
            }
            if(e.getSource()==botones[3]){
                concatenarNumero("3");
                //System.out.println("3");
            }
            if(e.getSource()==botones[4]){
                concatenarNumero("4");
                //System.out.println("4");
            }
            if(e.getSource()==botones[5]){
                concatenarNumero("5");
                //System.out.println("5");
            }
            if(e.getSource()==botones[6]){
                concatenarNumero("6");
                //System.out.println("6");
            }
            if(e.getSource()==botones[7]){
                concatenarNumero("7");
                //System.out.println("7");
            }
            if(e.getSource()==botones[8]){
                concatenarNumero("8");
                //System.out.println("8");
            }
            if(e.getSource()==botones[9]){
                concatenarNumero("9");
                //System.out.println("9");
            }
            if(e.getSource()==botones[10]){
                operacionSeleccionada = "+";
                caja3.setText(caja3.getText() + "+");//Se concatena en la caja de operación.
                puntero=1;//Se cambia de caja.
            }
            if(e.getSource()==botones[11]){
                operacionSeleccionada = "-";
                caja3.setText(caja3.getText() + "-");
                puntero=1;
            }
            if(e.getSource()==botones[12]){
                operacionSeleccionada = "*";
                caja3.setText(caja3.getText() + "*");
                puntero=1;
            }
            if(e.getSource()==botones[13]){
                operacionSeleccionada = "/";
                caja3.setText(caja3.getText() + "/");
                puntero=1;
            }
            if(e.getSource()==botones[14]){
                // Si el textField no tiene un punto decimal aún...
                if(!cajas[puntero].getText().contains("."))   {
                    //Se le añade el punto decimal.
                  cajas[puntero].setText(cajas[puntero].getText() + ".");
                }
                   
            }
            if(e.getSource()==res){//Si se la da click a boton calcular.
                puntero = 0;//Apuntar de nuevo a la caja 1.
                try{
                    double a = Double.parseDouble(caja1.getText());
                    double b = Double.parseDouble(caja2.getText());
                    
                    switch(operacionSeleccionada){
                        
                        case "+":
                            caja4.setText(String.valueOf(a+b));
                            limpiar();
                        break;
                        
                        case "-":
                            caja4.setText(String.valueOf(a-b));
                            limpiar();
                        break;
                        
                        case "*":
                            caja4.setText(String.valueOf(a*b));
                            limpiar();
                        break;
                        
                        case "/":
                            caja4.setText(String.valueOf(a/b));
                            limpiar();
                        break;
                    }
                }
                catch(Exception error){//En caso que el Usuario no ingrese un dato.
                    System.out.print("ERROR! - Ingresa datos");
                }
            }
        }
        
        private void concatenarNumero(String numero){
            cajas[puntero].setText(cajas[puntero].getText() + numero);
            caja3.setText(caja3.getText() + numero);
        }
        private void limpiar(){//Cada vez que se quiera vaciar las cajas.
            caja1.setText("");
            caja2.setText("");
            caja3.setText("");
        }
    }
       
    public Calculadora_Class(){
       
        setTitle("Calculadora Simple");
        this.setSize(520, 500);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        iniciar();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciar(){
        
        NumberActionListener buttonListener = new NumberActionListener();
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(15, 10, 250, 400);
        panel2.setLayout(new GridLayout(5, 3, 2, 2));
        panel2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Numeros", TitledBorder.CENTER,TitledBorder.DEFAULT_POSITION));
        panel.add(panel2);
        
        JPanel panel3 = new JPanel();
        panel3.setBounds(300, 25, 200, 100);
        panel3.setLayout(new GridLayout(2, 2, 2, 20));
        panel3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Variables", TitledBorder.CENTER,TitledBorder.DEFAULT_POSITION));
        panel.add(panel3);
        
        JLabel etiqueta1 = new JLabel("a");
        panel3.add(etiqueta1);
        
        caja1.setEditable(false);
        panel3.add(caja1);
        
        JLabel etiqueta2 = new JLabel("b");
        panel3.add(etiqueta2);

        caja2.setEditable(false);
        panel3.add(caja2);
        
        JLabel etiqueta3 = new JLabel("Operación");
        etiqueta3.setBounds(370, 120, 130, 30);
        panel.add(etiqueta3);
        
        
        caja3.setBounds(300, 150, 197, 30);
        caja3.setEditable(false);
        panel.add(caja3);
        
        JLabel etiqueta4 = new JLabel("R =");
        etiqueta4.setBounds(140, 420, 200, 30);
        panel.add(etiqueta4);
        
        caja4 = new JTextField();
        caja4.setBounds(160, 420, 200, 30);
        caja4.setEditable(false);
        panel.add(caja4);
        
        res = new JButton("Calcular");
        res.setBounds(300, 190, 197, 30);
        res.setBackground(Color.YELLOW);
        res.addActionListener(buttonListener);
        panel.add(res);
        
        String[]tags = {"S", "R", "P", "D", "."};
        
        int j = 0;
        for(int i = 0; i < botones.length; i++){
            if(i<=9){
                botones[i] = new JButton(String.valueOf(i));
                botones[i].addActionListener(buttonListener);
                panel2.add(botones[i]);
            }
            else{
                botones[i] = new JButton(tags[j]);
                botones[i].addActionListener(buttonListener);
                panel2.add(botones[i]);
                j++;
            }
        }
       
    }
}
