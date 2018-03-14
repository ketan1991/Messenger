package org.ketan.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ketan.messenger.pojo.Message;
import org.ketan.messenger.service.MessageService;

@Path("messages1")
public class MessageResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON	)
    public List<Message> getMessages() {
         return MessageService.getAllMessages();
    }
}
