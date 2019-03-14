package activities;

import java.io.*;

public class SalJoaA2QuoteServer {
    public static void main(String[] args) throws IOException {
        new SalJoaA2QuoteServerThread().start();
    }
}
