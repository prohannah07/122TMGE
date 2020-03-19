package TMGE.Networking;

import TMGE.GUI.BejeweledUI;

import java.io.*;
import java.net.*;
import java.util.TimerTask;

public class Client extends Multiplayer {



    // constructor to put ip address and port
    public Client(String address, int port) throws IOException {
        super(false);
        // establish a connection
        try
        {
            socket = new Socket(address, port);
            System.out.println("Connected");
            out    = new DataOutputStream(socket.getOutputStream());
            input = new DataInputStream(socket.getInputStream());
        } catch(IOException u)
        {
            throw u;
        }



    }








}
