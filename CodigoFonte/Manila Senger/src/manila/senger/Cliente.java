package manila.senger;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    private String apelido;
    private DatagramSocket UDPSocket;
    private Socket TCPSocket;
    private MulticastSocket MCSocket;
    private ArrayList<Cliente> manilUsersOnline;

    public boolean join(String ip) {

        Integer porta = 6789;

        try {
            InetAddress group = InetAddress.getByName(ip);
            this.MCSocket = new MulticastSocket(porta);
            this.MCSocket.joinGroup(group);
            
            
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }
    
    
    

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public DatagramSocket getUDPSocket() {
        return UDPSocket;
    }

    public void setUDPSocket(DatagramSocket UDPSocket) {
        this.UDPSocket = UDPSocket;
    }

    public Socket getTCPSocket() {
        return TCPSocket;
    }

    public void setTCPSocket(Socket TCPSocket) {
        this.TCPSocket = TCPSocket;
    }

    public MulticastSocket getMCSocket() {
        return MCSocket;
    }

    public void setMCSocket(MulticastSocket MCSocket) {
        this.MCSocket = MCSocket;
    }

    public ArrayList<Cliente> getManilUsersOnline() {
        return manilUsersOnline;
    }

    public void setManilUsersOnline(ArrayList<Cliente> manilUsersOnline) {
        this.manilUsersOnline = manilUsersOnline;
    }

}
