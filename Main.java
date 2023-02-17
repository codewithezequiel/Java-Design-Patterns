import BehavioralPatterns.Strategy.ChatClient;
import BehavioralPatterns.Strategy.ConcImplementations.aesEncryption;

class Main {
    public static void main(String[] args) {
    
        var client = new ChatClient(new aesEncryption());
        client.send("message");
    }

}
