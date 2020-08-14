package parrainage.scholaire.interfaces;

import parrainage.scholaire.acteurs.Parrainage;
import parrainage.scholaire.parametres.gestion.acteurs.ManageurEtudiant;
import parrainage.scholaire.parametres.gestion.acteurs.ManageurParrainage;

public class AssigneUnParrain extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private ManageurEtudiant mngrEtudiant;
	private ManageurParrainage mgrParrainage;

	private String fieule;

	private String parrain;

	private String identifiantParrain;

	private String Identifiantfieule;

	/**
	 * Creates new form AssigneUnParrain
	 */
	public AssigneUnParrain() {
		mngrEtudiant = new ManageurEtudiant();
		mgrParrainage = new ManageurParrainage();
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList<>();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jList2 = new javax.swing.JList<>();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jComboBox2 = new javax.swing.JComboBox<>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jList1.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = retournerLaListeDetudiantNiveau1("Prepa");// { "Item 1", "Item 2", "Item 3", "Item 4",
																			// "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		jList1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jList1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jList1);

		jLabel1.setText("Niveau:");

		jLabel2.setText("1");

		jList2.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = retournerLaListeDetudiantNiveau2("prepa");

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		jList2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jList2MouseClicked(evt);
			}
		});
		jScrollPane2.setViewportView(jList2);

		jLabel3.setText("2");

		jButton1.setText("Assigne");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel4.setText("Filliere:");

		jLabel5.setText("Filliere:");
		jLabel5.setVisible(false);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prepa", "TIC" }));
		jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jComboBox1MouseClicked(evt);
			}
		});
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});
		jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jComboBox2MouseClicked(evt);
			}
		});
		jComboBox1.addInputMethodListener(new java.awt.event.InputMethodListener() {
			public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
				jComboBox1InputMethodTextChanged(evt);
			}

			public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
			}
		});

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prepa", "TIC" }));
		jComboBox2.addInputMethodListener(new java.awt.event.InputMethodListener() {
			public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
				jComboBox2InputMethodTextChanged(evt);
			}

			public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
			}
		});
		jComboBox2.setVisible(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(71, 71, 71).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(
								jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(143, 143, 143))
				.addGroup(layout.createSequentialGroup().addGap(79, 79, 79)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane2))
						.addGap(63, 63, 63))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton1).addGap(213, 213, 213)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(48, 48, 48)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3))
						.addGap(5, 5, 5)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox1)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(5, 5, 5)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(50, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	protected String[] retournerLaListeDetudiantNiveau2(String prepa) {
		return mngrEtudiant.listEtudiantEnFonctionNiveauEtFiliere(2, prepa).toArray(new String[0]);
	}

	protected String[] retournerLaListeDetudiantNiveau1(String filiere) {
		return mngrEtudiant.listEtudiantEnFonctionNiveauEtFiliere(1, filiere).toArray(new String[0]);
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		mgrParrainage.etablirUnParrainage(new Parrainage(Integer.parseInt(Identifiantfieule),fieule, Integer.parseInt(identifiantParrain),parrain));
	}

	private void jList1MouseClicked(java.awt.event.MouseEvent evt) {
		String jlist1selected = jList1.getSelectedValuesList().get(0);
		Identifiantfieule = jlist1selected.split(",")[0];
		fieule =  jlist1selected.split(",")[1] + " "+ jlist1selected.split(",")[2];
	}

	private void jList2MouseClicked(java.awt.event.MouseEvent evt) {
		String jlist2selected = jList2.getSelectedValuesList().get(0);
		identifiantParrain = jlist2selected.split(",")[0];
		parrain =  jlist2selected.split(",")[1] + " "+  jlist2selected.split(",")[2];
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {

	}

	private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {

	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		String filiere = (String) jComboBox1.getSelectedItem();
		jList1.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = retournerLaListeDetudiantNiveau1(filiere);// { "Item 1", "Item 2", "Item 3", "Item 4",
																			// "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});

		jList2.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = retournerLaListeDetudiantNiveau2(filiere);

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jComboBox2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {

	}

	private void jComboBox1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AssigneUnParrain().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JList<String> jList1;
	private javax.swing.JList<String> jList2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	// End of variables declaration
}