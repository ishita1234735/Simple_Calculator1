import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class Simple_Calculator extends javax.swing.JFrame {
       JLabel lb;
    public Simple_Calculator() 
    {
        lb=new JLabel();
        initComponents();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int h=(int)d.getHeight();
        int w=(int)d.getWidth();
        setSize(w,h);
        lb.setBounds(0, 0, w, h);
        ImageIcon ic=new ImageIcon("src\\myuploads1\\Calculator.jpg");
        Image img=ic.getImage().getScaledInstance(lb.getWidth(),lb.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon icl=new ImageIcon(img);
        lb.setIcon(icl);
        add(lb);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel1.setText("CALCULATOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 10, 350, 40);

        lb1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lb1.setText("Enter First Number");
        getContentPane().add(lb1);
        lb1.setBounds(220, 110, 220, 32);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(710, 120, 250, 30);

        lb2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lb2.setText("Enter Second Number");
        getContentPane().add(lb2);
        lb2.setBounds(220, 200, 260, 32);
        getContentPane().add(tf2);
        tf2.setBounds(710, 200, 250, 30);

        lb3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lb3.setText("Result");
        getContentPane().add(lb3);
        lb3.setBounds(220, 290, 180, 30);

        tf3.setEditable(false);
        getContentPane().add(tf3);
        tf3.setBounds(710, 280, 250, 30);

        bt1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bt1.setText("ADD ");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(210, 410, 150, 40);

        bt2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bt2.setText("SUBTRACT");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(440, 410, 150, 40);

        bt3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bt3.setText("MULTIPLY");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(670, 410, 160, 40);

        bt4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bt4.setText("DIVIDE");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4);
        bt4.setBounds(900, 410, 170, 40);

        bt5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bt5.setText("CLEAR");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(550, 510, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
          try
           {
                 double num1=Double.parseDouble(tf1.getText());
                 double num2=Double.parseDouble(tf2.getText());
                 double result=num1*num2;
                 tf3.setText(String.valueOf(result));
           }
          catch(Exception e)
          {
                    JOptionPane.showMessageDialog(this,"Kindly Enter Numbers");
          }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
                try
           {
                 double num1=Double.parseDouble(tf1.getText());
                 double num2=Double.parseDouble(tf2.getText());
                  if(num2==0)
                  {
                       JOptionPane.showMessageDialog(this,"Cannot Divide by Zero");
                  }
                 double result=num1/num2;
                 tf3.setText(String.valueOf(result));
           }
          catch(Exception e)
          {
                    JOptionPane.showMessageDialog(this,"Kindly Enter Valid Numbers");
          }
    }//GEN-LAST:event_bt4ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
           try
           {
                 double num1=Double.parseDouble(tf1.getText());
                 double num2=Double.parseDouble(tf2.getText());
                 double result=num1+num2;
                 tf3.setText(String.valueOf(result));
           }
          catch(Exception e)
          {
                    JOptionPane.showMessageDialog(this,"Kindly Enter Numbers");
          }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
            try
           {
                 double num1=Double.parseDouble(tf1.getText());
                 double num2=Double.parseDouble(tf2.getText());
                 double result=num1-num2;
                 tf3.setText(String.valueOf(result));
           }
          catch(Exception e)
          {
                    JOptionPane.showMessageDialog(this,"Kindly Enter Numbers");
          }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
              tf1.setText("");
              tf2.setText("");
              tf3.setText("");
    }//GEN-LAST:event_bt5ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simple_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
