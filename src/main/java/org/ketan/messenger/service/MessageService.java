package org.ketan.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.ketan.messenger.pojo.Message;

public class MessageService {

	
	public static List<Message> getAllMessages()
	{
		Message m1 = new Message(1, "First", "Ketan");
		Message m2 = new Message(2, "Second", "Ketan");
		ArrayList<Message> t = new ArrayList<Message>();
		t.add(m1);
		t.add(m2);
		
		return t;
	}
}
