package chatambiental;

import View.TelaChat;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Classe onde vai ocorrer toda a parte de comunicação do Usuario com o
 * servidor.
 *
 * @author Math
 */
public class Cliente {

    /**
     *
     *
     *
     */
    private static Socket cli;
    private static PrintStream out;
    private static BufferedReader in;

    /**
     *
     * cli cria um Socket(parametro de conexão: ip e porta utilizadas ) out
     * (manda para o servidor) in (recebe do servidor) intputline (recebe do
     * cliente)
     *
     */
    /*public String mensagem() {
        try {
            cli = new Socket("localhost", 2222);
            out = new PrintStream(cli.getOutputStream());
            in = new BufferedReader(new InputStreamReader(cli.getInputStream()));

            new Thread(new resposta()).start();

            while (true) {
                out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return in.toString();
    }*/

    public static void iniciar() {
        try {
            cli = new Socket("localhost", 2222);
            out = new PrintStream(cli.getOutputStream());
            in = new BufferedReader(new InputStreamReader(cli.getInputStream()));
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void enviar(String mensagem) {
        out.println(mensagem);
    }
    
    public static String receber() throws IOException {
        return in.readLine();
    }
    
    public static void iniciarThreadResposta() {
        new Thread(new RespostaServidor(cli, out, in)).start();
    }

}
