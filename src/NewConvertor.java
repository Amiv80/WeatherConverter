import java.util.*;
public class NewConvertor extends javax.swing.JFrame {

    /**
     * Creates new form NewConvertor
     */
    public NewConvertor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        Button1 = new javax.swing.JRadioButton();
        Button2 = new javax.swing.JRadioButton();
        Button3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Celsius = new javax.swing.JLabel();
        Fahrenheit = new javax.swing.JLabel();
        Kelvin = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather Convertor");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setName("Frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 310));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Weather Converter");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 50));

        jFormattedTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0"))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setCaretColor(new java.awt.Color(0, 0, 204));
        jFormattedTextField1.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        jFormattedTextField1.setMaximumSize(new java.awt.Dimension(100, 30));
        jFormattedTextField1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyReleased(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button1);
        Button1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Button1.setForeground(new java.awt.Color(0, 0, 0));
        Button1.setSelected(true);
        Button1.setText("Fahrenheit");
        Button1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button2);
        Button2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Button2.setForeground(new java.awt.Color(0, 0, 0));
        Button2.setText("Celsius");
        Button2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button3);
        Button3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Button3.setForeground(new java.awt.Color(0, 0, 0));
        Button3.setText("Kelvin");
        Button3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter your temperature :");

        jLabel3.setBackground(new java.awt.Color(0, 255, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Answer:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Celsius.setBackground(new java.awt.Color(255, 255, 255));
        Celsius.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Celsius.setForeground(new java.awt.Color(0, 0, 0));
        Celsius.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Celsius.setText("-");
        Celsius.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Celsius.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Fahrenheit.setBackground(new java.awt.Color(255, 255, 255));
        Fahrenheit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fahrenheit.setForeground(new java.awt.Color(0, 0, 0));
        Fahrenheit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fahrenheit.setText("-");
        Fahrenheit.setToolTipText("");
        Fahrenheit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fahrenheit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Kelvin.setBackground(new java.awt.Color(255, 255, 255));
        Kelvin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Kelvin.setForeground(new java.awt.Color(0, 0, 0));
        Kelvin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kelvin.setText("-");
        Kelvin.setToolTipText("");
        Kelvin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Kelvin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        Image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Celsius, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(Celsius, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyReleased
        if (Button1.isSelected())
        {
            FarenheitPrint();
        }
        else if (Button2.isSelected())
        {
            CelsiusPrint();
        }
        else
        {
            KelvinPrint();
        }
    }//GEN-LAST:event_jFormattedTextField1KeyReleased
    public void FarenheitPrint()
    {
        String num;
        float input , far1 = 0, far2 = 0, far3 = 0;
        try
        {
            num = jFormattedTextField1.getText();
                input = Float.parseFloat(num);
            far1    = input;                                    // farnheit to farnheit
            far2    = (float) ((input - 32) * 1.8);             // farnheit to celsius
            far3    = (float) ((input - 32) * 1.8 + 273.15);    // farnheit to kelvin               
        }     
        catch(Exception ex){}
        
        Fahrenheit.setText("Fahrenheit= " + far1 + " F°");
        Celsius.setText("Celsius= " + far2 + " C°");
        Kelvin.setText("Kelvin= " + far3 + " K");
    }
    public void CelsiusPrint()
    {
        String num;
        float input , cel1 = 0 , cel2 = 0 , cel3 = 0;
        try
        {
            num = jFormattedTextField1.getText();
                input = Float.parseFloat(num);
            cel1    = (float) ((input * 1.8) +32);      // celsius to farnheit
            cel2    = input;                            // celsius  to celsius
            cel3    = (float) ((input + 273.15));       // celsius  to kelvin   
            
        }     
        catch(Exception ex){}
        
        Fahrenheit.setText("Fahrenheit= " + cel1 + " F°");
        Celsius.setText("Celsius= " + cel2 + " C°");
        Kelvin.setText("Kelvin= " + cel3 + " K");
    }
    public void KelvinPrint()
    {
        String num;
        float input , kel1 = 0 , kel2 = 0 , kel3 = 0;
        try
        {
            num = jFormattedTextField1.getText();
                input = Float.parseFloat(num);
            kel1    = (float) ((input - 273.15) * 1.8 + 32);    // kelvin  to farnheit
            kel2    = (float) ((input - 273.15));               // kelvin  to celsius
            kel3    = input;                                    // kelvin  to kelvin   
            
        }     
        catch(Exception ex){}
        
        Fahrenheit.setText("Fahrenheit= " + kel1 + " F°");
        Celsius.setText("Celsius= " + kel2 + " C°");
        Kelvin.setText("Kelvin= " + kel3 + " K");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewConvertor().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Button1;
    private javax.swing.JRadioButton Button2;
    private javax.swing.JRadioButton Button3;
    private javax.swing.JLabel Celsius;
    private javax.swing.JLabel Fahrenheit;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Kelvin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
