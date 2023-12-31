package com.simplilearn.demo;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@RequestMapping(value = "/")
	public String index() 
	{
		this.sendMessage("This is a message sent at " + Calendar.getInstance().getTime());

		return "Check Eclipse console for kafka output";
	}

	@GetMapping("/send")
	private void sendMessage(String msg) {
		kafkaTemplate.send("ecommerce", msg);
	}

}
