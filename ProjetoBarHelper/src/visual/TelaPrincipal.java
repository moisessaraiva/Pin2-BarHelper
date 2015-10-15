package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;

public class TelaPrincipal {

	private JFrame frmTelaPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frmTelaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaPrincipal = new JFrame();
		frmTelaPrincipal.setTitle("Tela Principal");
		frmTelaPrincipal.setBounds(100, 100, 1024, 719);
		frmTelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaPrincipal.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 982, 50);
		frmTelaPrincipal.getContentPane().add(panel);
		
		JButton btnCadastrarAtendente = new JButton("Cadastrar \r\nAtendente");
		panel.add(btnCadastrarAtendente);
		btnCadastrarAtendente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnCadastrarCardpio = new JButton("Cadastrar Card\u00E1pio");
		btnCadastrarCardpio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(btnCadastrarCardpio);
		
		JButton btnGerenciarPraas = new JButton("Gerenciar Pra\u00E7as");
		btnGerenciarPraas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(btnGerenciarPraas);
		
		JButton btnEmitirRelatrio = new JButton("Emitir Relat\u00F3rio\r\n");
		btnEmitirRelatrio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(btnEmitirRelatrio);
	}
}
