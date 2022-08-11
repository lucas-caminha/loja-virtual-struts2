package br.com.loja.virtual.action;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;

import br.com.loja.virtual.infra.utils.HibernateUtil;
import br.com.loja.virtual.model.Pedido;

public class UsuarioAction extends ActionSupport {
	
	public String teste() {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Check MySQL database version
			String sql = "select * from usuario";
			String result = (String) session.createNativeQuery(sql).getSingleResult();
			System.out.println(result);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  
		
		return SUCCESS;
	}

}
