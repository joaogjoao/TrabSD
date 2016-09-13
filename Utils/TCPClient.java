/** * TCPClient: Cliente para conexao TCP * Descrio: Envia uma informacao ao servidor e finaliza a conexao */import java.net.*;import java.io.*;import java.util.Scanner;public class TCPClient {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        Socket s = null;        try {            String ip = "127.0.0.1";            String envio;            int serverPort = 7896;            /* especifica a porta */            s = new Socket(ip, serverPort);            /* conecta com o servidor */            /* cria objetos de leitura e escrita */            DataInputStream in = new DataInputStream(s.getInputStream());            DataOutputStream out = new DataOutputStream(s.getOutputStream());            do {                System.out.println("Escreva a mensagem para o servidor: ");                envio = sc.nextLine();                 out.writeUTF(envio);      	// envia uma string para o servidor                String info =in.readUTF();                System.out.println("Informacao enviada.");                System.out.println(info+"\n");            } while (!envio.equals("SAIR"));            in.close();            out.close();            s.close();   //finaliza a conexao        } catch (UnknownHostException e) {            System.out.println("Socket:" + e.getMessage());        } catch (EOFException e) {            System.out.println("EOF:" + e.getMessage());        } catch (IOException e) {            System.out.println("leitura:" + e.getMessage());        } //catch    } //main} //class