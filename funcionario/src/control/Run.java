/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.modeloRegisto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Armano
 */
public class Run {
    
    public static void main(String[]args){
    
        Session te=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction ta=te.beginTransaction();
        
        modeloRegisto ai=new modeloRegisto();
        ai.setApelido("Nhapulo");
        ai.setBi("234252435m");
        //ai.setId(0);
        ai.setNome("ashdagjhdgajgsdhaj");
       te.close();
       ta.commit();
   
    }
}
