package hm4;


//demo class to demonstrate everything
public class ChatAdapterDemo {
    public static void main(String[] args) {
        //create a legacy service instance
        LegacyChatService legacyChatService = new LegacyChatService();

        //create an adapter instance to wrap the legacy chat service
        ChatService chatService = new ChatServiceAdapter(legacyChatService);

        //send a message through the adapter
        chatService.sendMessage("Hello world!");
    }
}
