package BehavioralPatterns.Strategy.ConcImplementations;

import BehavioralPatterns.Strategy.Interface.Encrypt.Encrypt;

public class aesEncryption implements Encrypt {

    @Override
    public void send(String message) {
        System.out.println("aesEncryption logic");
    }
    
}
