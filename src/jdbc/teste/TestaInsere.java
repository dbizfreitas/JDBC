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
        
        List<Contato>contatos = dao.getLista();
        
        for(Contato _contato : contatos){
            System.out.println("Nome:"  + _contato.getNome());
            System.out.println("Email:" + _contato.getEmail());
            System.out.println("Endereco:" + _contato.getEndereco());
            System.out.println("Data de Nascimento:" + _contato.getDataNascimento().getTime() + "\n");
            
        }
        
    }
   
}
