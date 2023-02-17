package BehavioralPatterns.Strategy;

import BehavioralPatterns.Strategy.Interface.Encrypt.Encrypt;

public class ChatClient {
    private Encrypt encryptionAlgorithm;

    public ChatClient(Encrypt encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        encryptionAlgorithm.send(message);
    }
}
