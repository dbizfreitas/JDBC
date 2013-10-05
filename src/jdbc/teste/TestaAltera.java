/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.teste;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author FACULDADE
 */
public class TestaAltera {
    // isto vai no DAO
    public static void main(String[] args){
       String sql = "update contatos set nome=?, email=?, endereco =?," + "dataNascimento=? where id=?";
       try{
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1,contato.getNome());
           
           
       }catch(SQLException e){
           throw new RuntimeException(e);
           
       }
        
    }
    
}
