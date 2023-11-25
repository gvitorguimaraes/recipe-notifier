package br.com.org.recipenotifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public TestProducer(KafkaTemplate<String, String> kafkaTemplate)
	{
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message)
	{
					   // - Topic , Mensagem -
		kafkaTemplate.send("teste", message);
	}
	
}
