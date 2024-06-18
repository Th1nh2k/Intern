package com.example.demo;

import com.example.demo.Model.NhomQuyen;
import com.example.demo.Model.Quyen_NhomQuyen;
import com.example.demo.Model.User;
import com.example.demo.Severice.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mypersistantunit");
//		EntityManager em = emf.createEntityManager();
//
//		try{
//			em.getTransaction().begin();
//			NhomQuyen nhomQuyen = em.find(NhomQuyen.class, 2L);
//			User user = new User();
//			user.setUsername("notadmin12");
//			user.setPassword("notadmin3");
//			user.setCanBold("123");
//			user.setGiangVienId(3);
//			user.setHocVienId(999);
//			user.setDepartment("IT");
//			user.setNhomQuyen(nhomQuyen);
//			em.persist(user);

//			Quyen_NhomQuyen qnq=new Quyen_NhomQuyen();
//			qnq.setNhomQuyen(nhomQuyen);
//			em.persist(qnq);



//			em.getTransaction().commit();
//		}
//		catch (Exception e){
//			em.getTransaction().rollback();
//		}
//		finally {
//			em.close();
//		}

		// List all user
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();
				String HQL = "from User";
				Query query = session.createQuery(HQL,User.class);
				List<User> list = query.getResultList();
				for(User user : list){
					System.out.println(user.toString());
				}
			session.getTransaction().commit();


		}
		catch(Exception e) {
			e.printStackTrace();
		}

//		 List all NhomQuyen
//		try(Session session =HibernateUtil.getSessionFactory().openSession()){
//			session.beginTransaction();
//			String HQL = "from NhomQuyen";
//			Query query = session.createQuery(HQL,NhomQuyen.class);
//			List<NhomQuyen> list = query.getResultList();
//			session.getTransaction().commit();
//		}
//
//		 List all users that have MaNhomQuyen 1
//		try(Session session =HibernateUtil.getSessionFactory().openSession()){
//			session.beginTransaction();
//			String hql = "FROM User u WHERE u.nhomQuyen.id = :nhomQuyenId";
//			List<User> userList = session.createQuery(hql, User.class)
//					.setParameter("nhomQuyenId", 1)
//					.getResultList();
//			session.getTransaction().commit();
//		}
//
//		 list all users have username thinh
//		try(Session session =HibernateUtil.getSessionFactory().openSession()){
//			session.beginTransaction();
//			String hql = "FROM User u WHERE u.username = :username";
//			User user = session.createQuery(hql, User.class)
//					.setParameter("username", "thinh")
//					.uniqueResult();
//			session.getTransaction().commit();
//		}
//
//
//		 count the number of user that has MaNhomQuyen 1
//		try(Session session =HibernateUtil.getSessionFactory().openSession()){
//			session.beginTransaction();
//			String hql = "SELECT COUNT(u) FROM User u WHERE u.nhomQuyen.id = :nhomQuyenId";
//			Long count = session.createQuery(hql, Long.class)
//					.setParameter("nhomQuyenId", 1)
//					.uniqueResult();
//			session.getTransaction().commit();
//		}
//		 update password of user that have ID=1
//		try(Session session =HibernateUtil.getSessionFactory().openSession()){
//			session.beginTransaction();
//			String hql = "UPDATE User u SET u.password = :password WHERE u.id= :usernameID";
//			int updatedEntities = session.createQuery(hql)
//					.setParameter("password", "newPassword")
//					.setParameter("usernameID", "1")
//					.executeUpdate();
//			session.getTransaction().commit();
//		}

	}

}
