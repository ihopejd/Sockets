package com.demo.forwardingmessage;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    private static final int PORT = 9001;
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(PORT);
        System.out.println("Сервер ждёт подключения...");

        try {
            while (true) {
                new serverProcessor(listener.accept()).start();
            }
        } finally {
            listener.close();
        }

    }
}
