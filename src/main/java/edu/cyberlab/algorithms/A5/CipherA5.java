package edu.cyberlab.algorithms.A5;

import edu.cyberlab.algorithms.Cipher;

public class CipherA5 implements Cipher {

    private KeyGenerator keyGenerator;


    @Override
    public String encrypt(String message) {
        StringBuilder encyptedMessage = new StringBuilder();
        char[] messageChars = message.toCharArray();
        for (char messageChar : messageChars) {
            int key = genereteKey();
            encyptedMessage.append(Integer.parseInt(String.valueOf(messageChar)) ^ key);
        }
        return encyptedMessage.toString();
    }

    private int genereteKey() {
        return 0;
    }

    @Override
    public String decrypt(String message) {
        return null;
    }
}
