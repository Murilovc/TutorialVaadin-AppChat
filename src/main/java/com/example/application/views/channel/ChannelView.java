package com.example.application.views.channel;

import com.example.application.chat.ChatService;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;

@Route(value = "channel")
public class ChannelView extends VerticalLayout 
        implements HasUrlParameter<String>{

	private final ChatService chatService;
	private final MessageList messageList;
	
	public ChannelView(ChatService chatService) {
		this.chatService = chatService;
		setSizeFull();
		
		messageList = new MessageList();
		messageList.setSizeFull();
		this.add(messageList);
		
		var messageInput = new MessageInput();
		messageInput.setWidthFull();
		this.add(messageInput);
	}
	
	@Override
	public void setParameter(BeforeEvent event, String parameter) {
		
	}
    
}
