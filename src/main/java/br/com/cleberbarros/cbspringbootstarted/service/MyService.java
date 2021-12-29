package br.com.cleberbarros.cbspringbootstarted.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.cleberbarros.cbspringbootstarted.config.MyConfigProperties;

@Service
public class MyService {

//	@Value("${notificador.email.porta-servidor}")
//	private String port;
	
	@Autowired
	private MyConfigProperties properties;
	
    public void exibir() {
    	//System.out.println("Porta: "+port);
    	System.out.println("Porta: "+properties.getPortaServidor());
    	System.out.println("smtp: "+properties.getSmtpServidor());
    	System.out.println("imap: "+properties.getImap());
    	System.out.println("envio: "+properties.getEnderecoEnvio());
    }
}
