package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.text.AbstractDocument.Content;

public class DistroController {

	public DistroController() {
		super();
	}

	public String os() {

		String os = System.getProperty("os.name");
		return os;

	}

	public void ExibeDistro(String os, String DistroLinux) {
		if (os == "") {
			System.out.println("Primeiro Identifique o Sistema Operacional");

		} else {
			if (os.contains("dows")) {
				System.out.println("O sistema é windowns");

			} else if (os.contains("nux")) {
				try {
					Process p = Runtime.getRuntime().exec(DistroLinux);
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					while (linha != null) {
						System.out.println(linha);
						linha = buffer.readLine();

					}
					buffer.close();
					fluxo.close();
					leitor.close();
				} catch (Exception e) {
					String msgErro = e.getMessage();
					System.err.println(msgErro);
				}
			} else {
				System.out.println("O sistema não é linux nem windows");
			}

		}
	}

}
