
package proyectocalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ventana extends JFrame {
    JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField();
    JTextField txtValor2 = new JTextField();
    JLabel lblResultado = new JLabel(" ");
    int valor1 = 0;
    char simbolo = ' ';
    public ventana() {
        this.setVisible(true);  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
    public void insertarPanel() {
        this.getContentPane().add(panelInicio);
      
        panelInicio.setLayout(null); 
    }

    public void insertarEtiquetas() {

        lblResultado.setBounds(20, 180, 200, 25);
        panelInicio.add(lblResultado);
    }

    public void insertarTexto() {
        txtValor1.setBounds(50, 40, 290, 35);
        panelInicio.add(txtValor1);
        txtValor1.repaint();
        txtValor2.repaint();
        
        

    }

    public void insertarBotones() {
       

        JButton btnSum = new JButton("+");
        panelInicio.add(btnSum);
        btnSum.setBounds(270, 100, 60, 20);
        ActionListener suma2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    valor1 += Integer.parseInt(txtValor1.getText());
                    simbolo = '+';
                    txtValor1.setText("");
                }
            }
        };
        btnSum.addActionListener(suma2);
        
        

        JButton btnRes = new JButton("-");
        panelInicio.add(btnRes);
        btnRes.setBounds(270, 130, 60, 20);
        ActionListener res2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor1 == 0) {
                        valor1 = Integer.parseInt(txtValor1.getText());
                    } else {
                        valor1 -= Integer.parseInt(txtValor1.getText());
                    }
                    simbolo = '-';
                    txtValor1.setText("");
                }
            }
        };
        btnRes.addActionListener(res2);
        
        
         JButton btndiv = new JButton("÷");
        panelInicio.add(btndiv);
        btndiv.setBounds(270, 190, 60, 20);
        ActionListener divid = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor1 == 0) {
                        valor1 = Integer.parseInt(txtValor1.getText());
                    } else {
                        valor1 -= Integer.parseInt(txtValor1.getText());
                    }
                    simbolo = '-';
                    txtValor1.setText("");
                }
            }
        };
        btndiv.addActionListener(divid);
        
        
         JButton btnmul = new JButton("x");
        panelInicio.add(btnmul);
        btnmul.setBounds(270, 160, 60, 20);
        ActionListener multi= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                   valor1 *= Integer.parseInt(txtValor1.getText());
                    simbolo = 'x';
                    txtValor1.setText("");
                }
            }
        };
        btnmul.addActionListener(multi);

        JButton btnIgual = new JButton("=");
        panelInicio.add(btnIgual);
        btnIgual.setBounds(50, 220, 220, 30);
        ActionListener resultado = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = 0;
                if (simbolo == '+') {
                    resultado = valor1 + Integer.parseInt(txtValor1.getText());
                } else if (simbolo == '-') {
                    resultado = valor1 - Integer.parseInt(txtValor1.getText());
                }
                txtValor1.setText(String.valueOf(resultado));
                valor1 = 0;

            }
        };
        btnIgual.addActionListener(resultado);

        JButton btnRaiz = new JButton("√");
        panelInicio.add(btnRaiz);
        btnRaiz.setBounds(280, 220, 60, 30);
        ActionListener resRaiz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (Double.parseDouble(txtValor1.getText()) >= 0) {
                        double total = Math.sqrt(Double.parseDouble(txtValor1.getText()));
                        txtValor1.setText(String.valueOf(total));
                        valor1 = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Math Error");
                    }
                }
            }
        };
        btnRaiz.addActionListener(resRaiz);

        JButton btn1 = new JButton("1");
        btn1.setBounds(50, 100, 60, 20);
        panelInicio.add(btn1);
        btn1.repaint();

        ActionListener agregar1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "1";
                txtValor1.setText(union);
            }
        };
        btn1.addActionListener(agregar1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(120, 100, 60, 20);
        panelInicio.add(btn2);
        btn2.repaint();

        ActionListener agregar2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "2";
                txtValor1.setText(union);
            }
        };
        btn2.addActionListener(agregar2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(190, 100, 60, 20);
        panelInicio.add(btn3);
        btn3.repaint();

        ActionListener agregar3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "3";
                txtValor1.setText(union);
            }
        };
        btn3.addActionListener(agregar3);

        JButton btn4 = new JButton("4");
        btn4.setBounds(50, 130, 60, 20);
        panelInicio.add(btn4);
        btn4.repaint();

        ActionListener agregar4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "4";
                txtValor1.setText(union);
            }
        };
        btn4.addActionListener(agregar4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(120, 130, 60, 20);
        panelInicio.add(btn5);
        btn5.repaint();

        ActionListener agregar5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "5";
                txtValor1.setText(union);
            }
        };
        btn5.addActionListener(agregar5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(190, 130, 60, 20);
        panelInicio.add(btn6);
        btn6.repaint();

        ActionListener agregar6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "6";
                txtValor1.setText(union);
            }
        };
        btn6.addActionListener(agregar6);

        JButton btn7 = new JButton("7");
        btn7.setBounds(50, 160, 60, 20);
        panelInicio.add(btn7);
        btn7.repaint();

        ActionListener agregar7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "7";
                txtValor1.setText(union);
            }
        };
        btn7.addActionListener(agregar7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(120, 160, 60, 20);
        panelInicio.add(btn8);
        btn8.repaint();

        ActionListener agregar8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "8";
                txtValor1.setText(union);
            }
        };
        btn8.addActionListener(agregar8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(190, 160, 60, 20);
        panelInicio.add(btn9);
        btn9.repaint();

        ActionListener agregar9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "9";
                txtValor1.setText(union);
            }
        };
        btn9.addActionListener(agregar9);

        JButton btn0 = new JButton("0");
        btn0.setBounds(50, 190, 60, 20);
        panelInicio.add(btn0);
        btn0.repaint();

        ActionListener agregar0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "0";
                txtValor1.setText(union);
            }
        };
        btn0.addActionListener(agregar0);

        JButton btnp = new JButton(".");
        btnp.setBounds(120, 190, 60, 20);
        panelInicio.add(btnp);
        btnp.repaint();

        ActionListener agregarp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + ".";
                txtValor1.setText(union);
            }
        };
        btnp.addActionListener(agregarp);

        JButton btnBorrar = new JButton("C");
        panelInicio.add(btnBorrar);
        btnBorrar.setBounds(190, 190, 60, 20);

        ActionListener borrarUno = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String union = "";
                for (int i = 0; i < txtValor1.getText().length() - 100; i++) {
                    union = union + txtValor1.getText().charAt(i);
                }

                txtValor1.setText(union);

            }
        };

        btnBorrar.addActionListener(borrarUno);


           JButton btnBorrardo = new JButton("AC");
        panelInicio.add(btnBorrardo);
        btnBorrardo.setBounds(190, 220, 60, 30);

        ActionListener borrardo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String union = "";
                for (int i = 0; i < txtValor1.getText().length() - 100; i++) {
                    union = union + txtValor1.getText().charAt(i);
                }

                txtValor1.setText(union);

            }
        };

     btnBorrardo.addActionListener(borrardo);
        }
    }
                

    

    
    }
}

