package view;

import javax.swing.JOptionPane;

import controller.DistroController;

public class mainEX03 {
	public static void main(String[] args) {
		DistroController m = new DistroController();
		String os = "";
		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"ESCOLHA A OPS \n 1 = Identifica SO \n 2 = Mostrar Distro \n 9 = FIM"));
			switch (opc) {
			case 1:
				os = m.os();
				System.out.println(os);
				System.out.println("");
				break;

			case 2:
				m.ExibeDistro(os, "cat /etc/os-release ");
				break;
				
				
			case 9:
				System.out.println("FIM DO PROGRAMA");
				break;

			}
		}
	}
}
