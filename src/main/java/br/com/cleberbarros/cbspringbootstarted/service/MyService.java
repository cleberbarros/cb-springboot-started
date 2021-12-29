package br.com.cleberbarros.cbspringbootstarted.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Value("${notificador.email.porta-servidor}")
	private String port;
	
    public void exibir() {
    	System.out.println("Porta: "+port);
    }
}
