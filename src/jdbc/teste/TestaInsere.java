/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.teste;

import java.util.Calendar;
import java.util.List;
import jdbc.dao.ContatoDao;
import jdbc.modelo.Contato;

/**
 *
 * @author FACULDADE
 */
public class TestaInsere {
    public static void main(String[] args){
      
        Contato contato = new Contato();
        contato.setNome("Willy Wonka");
        contato.setEmail("Willy@oomopaloompa.com");
        contato.setEndereco("R.wonka");
        contato.setDataNascimento(Calendar.getInstance());
        
        ContatoDao dao = new ContatoDao();
        
        dao.adiciona(contato);
        
               
        System.out.println("Gravado!");
               
        
    }
   
}
