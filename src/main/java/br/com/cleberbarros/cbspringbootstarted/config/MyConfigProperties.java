package br.com.cleberbarros.cbspringbootstarted.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class MyConfigProperties {

	private String portaServidor;
	
	private String smtpServidor;
	
	private String imap;
	
	private String enderecoEnvio;

	public String getPortaServidor() {
		return portaServidor;
	}

	public void setPortaServidor(String portaServidor) {
		this.portaServidor = portaServidor;
	}

	public String getSmtpServidor() {
		return smtpServidor;
	}

	public void setSmtpServidor(String smtpServidor) {
		this.smtpServidor = smtpServidor;
	}

	public String getImap() {
		return imap;
	}

	public void setImap(String imap) {
		this.imap = imap;
	}

	public String getEnderecoEnvio() {
		return enderecoEnvio;
	}

	public void setEnderecoEnvio(String enderecoEnvio) {
		this.enderecoEnvio = enderecoEnvio;
	}
	
}
