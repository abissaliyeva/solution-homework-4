package hm4;

//adapter that converts calls from the ChatService interface to the LegacyChatService
public class ChatServiceAdapter implements ChatService{
    LegacyChatService legacyChatService; //reverence to the legacy service
    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        //a constructor to initialize legacyChatService
        this.legacyChatService = legacyChatService;
    }
    @Override
    public void sendMessage(String message) {
        //override the method and adapt the sendMessage method to the sendLegacyMesaage method
        legacyChatService.log(message);
    }
}
