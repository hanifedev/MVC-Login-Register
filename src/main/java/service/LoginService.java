package service;
 
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import model.User;
 
public class LoginService {
	 public boolean authenticateUser(String kullaniciadi, String password) {
	        User user = getUserByUsername(kullaniciadi);         
	        if(user!=null && user.getKuladi().equals(kullaniciadi) && user.getParola().equals(password)){
	            return true;
	        }else{
	            return false;
	        }
	    }
	 
	    public User getUserByUsername(String kullaniciadi) {
	        Session session = HibernateUtil.openSession();
	        Transaction tx = null;
	        User user = null;
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            Query query = session.createQuery("from User where kuladi='"+kullaniciadi+"'");
	            user = (User)query.uniqueResult();
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return user;
	    }
	
	@SuppressWarnings("unchecked")
	public List<User> getListOfUser(){
		List<User> list = new ArrayList<User>();
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try{
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from User").list();
			tx.commit();
		}
		catch(Exception e){
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
	}
}