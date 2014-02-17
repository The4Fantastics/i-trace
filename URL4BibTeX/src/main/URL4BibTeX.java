
package main;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class URL4BibTeX extends javax.swing.JFrame {

	private javax.swing.JButton cmdRefact;
	private javax.swing.JButton cmdSearch;
	private javax.swing.JLabel lblFile;
	private javax.swing.JTextField txtFile;
	    
    public URL4BibTeX() {
    	setResizable(false);
    	setAutoRequestFocus(false);
      
    	initComponents();
    	this.setVisible(true);
    }
    
    
    private void initComponents() {

        cmdSearch = new javax.swing.JButton();
        lblFile = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        
        //txtFile.setText("D:\\Documents\\library.bib");
        
        cmdRefact = new javax.swing.JButton();
        cmdRefact.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		// Chequeamos que existe el fichero
        		if (txtFile.getText()==""){ //$NON-NLS-1$
        			JOptionPane.showMessageDialog(null, Messages.getString("URL4BibTeX.UI.selectFile"),  //$NON-NLS-1$
            				"", JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$
        		}else{
        			BibFile bibFile = new BibFile();
        			bibFile.URL4BibTeX(txtFile.getText());
        		
        			JOptionPane.showMessageDialog(null, Messages.getString("URL4BibTeX.UI.conversionOK"),  //$NON-NLS-1$
        				"", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
        		
        			System.exit(DISPOSE_ON_CLOSE);
        		}
					
				
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        

        cmdSearch.setText("Search"); //$NON-NLS-1$
        cmdSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdSearch_click(evt);
            }
        });

        lblFile.setText("File"); //$NON-NLS-1$

        cmdRefact.setText("Refact"); //$NON-NLS-1$
        
        JButton txtCancelar = new JButton("Cancelar"); //$NON-NLS-1$
        txtCancelar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.exit(DISPOSE_ON_CLOSE);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(208)
        					.addComponent(txtCancelar)
        					.addGap(18)
        					.addComponent(cmdRefact))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(27)
        					.addComponent(lblFile)
        					.addGap(18)
        					.addComponent(txtFile, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(cmdSearch)))
        			.addGap(20))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cmdSearch)
        				.addComponent(lblFile)
        				.addComponent(txtFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cmdRefact)
        				.addComponent(txtCancelar))
        			.addContainerGap(132, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        
        this.setTitle(Messages.getString("URL4BibTeX.Constants.appName") + " " + Messages.getString("URL4BibTeX.Constants.appVer"));   //$NON-NLS-1$

        pack();
    }

    private void cmdSearch_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdSearch_click
        
    	JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            Messages.getString("MenuPrincipal.URL4BibTeX.Constants.messageTypeFiles"), Messages.getString("MenuPrincipal.URL4BibTeX.Constants.extensionTypeFiles")); //$NON-NLS-1$ //$NON-NLS-2$
        
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(this);
        
        if(returnVal == JFileChooser.APPROVE_OPTION) {
        	txtFile.setText(chooser.getSelectedFile().getAbsolutePath());  
        
        }
        
       
        
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { //$NON-NLS-1$
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(URL4BibTeX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(URL4BibTeX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(URL4BibTeX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(URL4BibTeX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new URL4BibTeX().setVisible(true);
            }
        });
    }
}
