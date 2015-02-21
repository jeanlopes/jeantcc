/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Convidado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jean
 */
@Stateless
public class convidadoBean {

    @PersistenceContext(unitName = "jeantccPU")
        EntityManager em;
    
    
    public void salvar(String nome, int genero) {
        Convidado convidado = new Convidado();
        
        convidado.setNome(nome);
        convidado.setGenero(genero);
        
        try {
        em.persist(convidado);
        em.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
