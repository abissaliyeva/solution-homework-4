Part 1: Global Configuration Manager (Singleton Pattern)
ConfigurationManager.java - the main singleton class
ConfigManagerDemo.java - deno class. just run it and you'll see the output (exact same as a screenshot i upload)

Part 2: Chat Service Adapter (Adapter Pattern)
ChatService.java - an interface that conatins a sending method
LegacyChatService.java - legacy service for sending a message in the legacy format
ChatServiceAdapter.java - adapter class that converts calls from the ChatService interface to the LegacyChatService
ChatAdapterDemo.java - demo class to demonstrate everyting. run it and in the console will appear a message: Legacy Chat: Hello world! (screenshot i uploaded too)
