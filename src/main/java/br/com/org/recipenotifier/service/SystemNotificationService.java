package br.com.org.recipenotifier.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Classe utilizada para gerenciar os eventos recebidos e direcionar os envios
 */

@Service
public class SystemNotificationService{
	
	@KafkaListener(topics = "teste", groupId = "group-1")
	public void receiveMessage(String message)
	{
		// Implementar logica para acionar o envio de e-mail **
		
		//Temporario para teste
		System.out.println("Consumer Message: "+ message);
	}
}
