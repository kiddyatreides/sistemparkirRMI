/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemparkirserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import model.Client;
import object.IClient;

/**
 *
 * @author Kid
 */
public class SistemParkirServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try
        {
            Registry registry = LocateRegistry.createRegistry(9999);          
            IClient f = new Client();

            registry.rebind("log", f);
            
            System.out.println("Object is registered.");
            System.out.println("Now server is waiting for client request...");
        }
        catch(Exception e)
        {
            System.out.println("FileServer: " + e);
        }
    }
    
}
