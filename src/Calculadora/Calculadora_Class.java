/*
██████╗░██╗░░░██╗██╗  ███████╗██╗░░░░░██╗  ████████╗░█████╗░██╗░░░██╗░█████╗░██████╗░
██╔══██╗╚██╗░██╔╝╚═╝  ██╔════╝██║░░░░░██║  ╚══██╔══╝██╔══██╗██║░░░██║██╔══██╗██╔══██╗
██████╦╝░╚████╔╝░░░░  █████╗░░██║░░░░░██║  ░░░██║░░░██║░░██║╚██╗░██╔╝███████║██████╔╝
██╔══██╗░░╚██╔╝░░░░░  ██╔══╝░░██║░░░░░██║  ░░░██║░░░██║░░██║░╚████╔╝░██╔══██║██╔══██╗
██████╦╝░░░██║░░░██╗  ███████╗███████╗██║  ░░░██║░░░╚█████╔╝░░╚██╔╝░░██║░░██║██║░░██║
╚═════╝░░░░╚═╝░░░╚═╝  ╚══════╝╚══════╝╚═╝  ░░░╚═╝░░░░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝
*/

package Calculadora;
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
   
       private JButton [] botones = new JButton[15];
       
       JTextField caja1 = new JTextField();
       JTextField caja2 = new JTextField();
       JTextField [] fields = {caja1, caja2};
       int index = 0;
       
       private class NumberActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==botones[0]){
                fields[index].setText(fields[index].getText() + "0");
            }
            if(e.getSource()==botones[1]){
                fields[index].setText(fields[index].getText() + "1");
                //System.out.println("1");
            }
            if(e.getSource()==botones[2]){
                fields[index].setText(fields[index].getText() + "2");
               // System.out.println("2");
            }
            if(e.getSource()==botones[3]){
                fields[index].setText(fields[index].getText() + "3");
                //System.out.println("3");
            }
            if(e.getSource()==botones[4]){
                fields[index].setText(fields[index].getText() + "4");
                //System.out.println("4");
            }
            if(e.getSource()==botones[5]){
                fields[index].setText(fields[index].getText() + "5");
                //System.out.println("5");
            }
            if(e.getSource()==botones[6]){
                fields[index].setText(fields[index].getText() + "6");
                //System.out.println("6");
            }
            if(e.getSource()==botones[7]){
                fields[index].setText(fields[index].getText() + "7");
                //System.out.println("7");
            }
            if(e.getSource()==botones[8]){
                fields[index].setText(fields[index].getText() + "8");
                //System.out.println("8");
            }
            if(e.getSource()==botones[9]){
                fields[index].setText(fields[index].getText() + "9");
                //System.out.println("9");
            }
            if(e.getSource()==botones[10]){
                JTextField [] fields = {caja1, caja2};
                int index = 0;
                fields[index].setText(fields[index].getText() + "0");
            }
            if(e.getSource()==botones[11]){
                JTextField [] fields = {caja1, caja2};
                int index = 0;
                fields[index].setText(fields[index].getText() + "0");
            }
            if(e.getSource()==botones[12]){
                JTextField [] fields = {caja1, caja2};
                int index = 0;
                fields[index].setText(fields[index].getText() + "0");
            }
            if(e.getSource()==botones[13]){
                JTextField [] fields = {caja1, caja2};
                int index = 0;
            }
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
        
        JTextField caja3 = new JTextField();
        caja3.setBounds(300, 150, 197, 30);
        caja3.setEditable(false);
        panel.add(caja3);
        
        JLabel etiqueta4 = new JLabel("R =");
        etiqueta4.setBounds(140, 420, 200, 30);
        panel.add(etiqueta4);
        
        JTextField caja4 = new JTextField();
        caja4.setBounds(160, 420, 200, 30);
        caja4.setEditable(false);
        panel.add(caja4);
        
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
               panel2.add(botones[i]);
               j++;
           }
       }
       
    }
}
