package iTrace.ui.dataUI;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import iTrace.Aspect;
import iTrace.ui.data.ModelData;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import iTrace.AbstractionLevel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Dialog.ModalExclusionType;
import java.io.FilenameFilter;
import java.awt.Window.Type;
import java.awt.Dialog.ModalityType;
import javax.swing.ImageIcon;

public class ModelDataUI extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	private JComboBox cmbAspect = new JComboBox();
	private JComboBox cmbAbstractionLevel = new JComboBox();
	
	private static ModelData model;
	private JTextField txtMetamodel = new JTextField();
	private JTextField txtModel = new JTextField();
	private JTextField txtName = new JTextField();
	
	public static void init(ModelData refModel) {
		
		model = refModel;

		try {
			ModelDataUI dialog = new ModelDataUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean checkValues(){
		//System.out.println("Valor de metamodel: " + model.getMetamodel());
		if 	(model.getMetamodel().equals("") || model.getName().equals("") || model.getPath().equals("")){
			return false;
		}else{
			return true;
		}
			
	}
	public ModelDataUI() {
		setResizable(false);
		
		setTitle("Please, insert information for model ...");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 450, 262);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 40);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblIconModel = new JLabel("");
		lblIconModel.setIcon(new ImageIcon("./icons/Model.png"));
		lblIconModel.setBounds(10, 0, 44, 45);
		contentPanel.add(lblIconModel);
		
		JLabel lblNewLabel = new JLabel("Model Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(104, 15, 90, 14);
		contentPanel.add(lblNewLabel);
		
		txtName.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtName.setBounds(204, 12, 197, 20);
		contentPanel.add(txtName);
		txtName.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 189, 434, 34);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Validate");
				okButton.setIcon(new ImageIcon("./icons/ok.png"));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						model.setAspect(Aspect.getByName(cmbAspect.getSelectedItem().toString()));
						model.setAbstractionLevel(AbstractionLevel.getByName(cmbAbstractionLevel.getSelectedItem().toString()));
						model.setMetamodel(txtMetamodel.getText());
						model.setName(txtName.getText());
						model.setPath(txtModel.getText());
						
						if (checkValues()){
							dispose();
						}else{
							JOptionPane.showMessageDialog(contentPanel,
									"All fields are required. Please, make you sure all fields have a value.",
									"Information",
									JOptionPane.INFORMATION_MESSAGE);
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		{
			cmbAspect.setBounds(104, 51, 128, 20);
			getContentPane().add(cmbAspect);
			cmbAspect.setModel(new DefaultComboBoxModel(Aspect.values()));
		}
		
		JLabel lblAbstractionLevel = new JLabel("Abstraction Level");
		lblAbstractionLevel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAbstractionLevel.setBounds(10, 91, 84, 14);
		getContentPane().add(lblAbstractionLevel);
		
		JLabel lblAspect = new JLabel("Aspect");
		lblAspect.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAspect.setBounds(10, 54, 46, 14);
		getContentPane().add(lblAspect);
		
		cmbAbstractionLevel.setModel(new DefaultComboBoxModel(AbstractionLevel.values()));
		cmbAbstractionLevel.setBounds(104, 88, 128, 20);
		getContentPane().add(cmbAbstractionLevel);
		{
			JLabel lblMetamodel = new JLabel("Metamodel");
			lblMetamodel.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblMetamodel.setBounds(10, 130, 84, 14);
			getContentPane().add(lblMetamodel);
		}
		txtMetamodel.setEnabled(false);
		
		txtMetamodel.setBounds(104, 127, 279, 20);
		getContentPane().add(txtMetamodel);
		txtMetamodel.setColumns(10);
		
		JButton btnMeta = new JButton("...");
		btnMeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame f = new Frame();
				FileDialog file = new FileDialog(f, "Select metamodel file for " + model.getMetaATL(), FileDialog.LOAD);
				file.setVisible(true);
				String aux = file.getDirectory() + file.getFile();
				aux=aux.replace("\\", "/");
					if (aux.equals("nullnull")){
						aux="";
					}
				txtMetamodel.setText(aux);
			}
		});
		btnMeta.setBounds(393, 126, 31, 23);
		getContentPane().add(btnMeta);
		txtModel.setEnabled(false);
		
		txtModel.setBounds(104, 158, 279, 20);
		getContentPane().add(txtModel);
		txtModel.setColumns(10);
		
		JButton btnModel = new JButton("...");
		btnModel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame f = new Frame();
				FileDialog file = new FileDialog(f, "Select model file for " + model.getModelATL(), FileDialog.LOAD);
				file.setVisible(true);
				String aux = file.getDirectory() + file.getFile();
				aux=aux.replace("\\", "/");
				if (aux.equals("nullnull")){
					aux="";
				}
				txtModel.setText(aux);
			}
		});
		btnModel.setBounds(393, 154, 31, 23);
		getContentPane().add(btnModel);
		
		JLabel lblAtlMetamodel = new JLabel("ATL Metamodel: " + model.getMetaATL());
		lblAtlMetamodel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAtlMetamodel.setBounds(242, 91, 182, 14);
		getContentPane().add(lblAtlMetamodel);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblModel.setBounds(10, 161, 46, 14);
		getContentPane().add(lblModel);
		
		JLabel lblAtlModel = new JLabel("ATL Model: " + model.getModelATL());
		lblAtlModel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAtlModel.setBounds(242, 54, 182, 14);
		getContentPane().add(lblAtlModel);
	}
}
