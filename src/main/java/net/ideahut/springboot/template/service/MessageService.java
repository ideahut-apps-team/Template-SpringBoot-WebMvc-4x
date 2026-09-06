package net.ideahut.springboot.template.service;

import java.util.List;

import net.ideahut.springboot.message.MessageHandler;
import net.ideahut.springboot.object.Option;
import tools.jackson.databind.JsonNode;

public interface MessageService extends MessageHandler {
	
	List<Option> getActiveLanguages();
	String getDefaultLanguage();
	
	JsonNode getResource(String type);
	
}
