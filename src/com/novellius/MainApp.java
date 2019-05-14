package com.novellius;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.novellius.dao.AdminDao;
import com.novellius.pojo.Admin;

public class MainApp {
		
	public static void main(String[] args) {
	
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("com/novellius/spring_config.xml");
		
		AdminDao adminDao = (AdminDao) applicationContext.getBean("adminDao");
		
		Timestamp ts = new Timestamp(new Date().getTime());
		
//		Admin admin = new Admin();
//		admin.setNombre("Octavio");
//		admin.setCargo("profesor");
//		admin.setFechaCreacion(ts);
		
		
		
		try {
			//adminDao.save(admin);
//			if(adminDao.save(admin)){
//				System.out.println("Guardado correctamente");
//			}else {
//				System.out.println("No se pudo guardar");
//			}
//			List<Admin> admins= adminDao.findAll();
//			
//			for(Admin admin2 :admins) {
//				
//				System.out.println(admin2);
//			}
			
//			System.out.println(adminDao.findById(4));
//			System.out.println(adminDao.findById(1));
//			System.out.println(adminDao.findByNombre("J").toString());
			Admin admin= adminDao.findById(1);
			System.out.println("admin con id 1"+ admin);
			if(adminDao.update(admin)) {
				
				System.out.println("Se ha actualizado correctamente: "+ admin);
			}
			if(adminDao.delete(admin.getIdAd())) {
				
				System.out.println("Eliminado correctamente: "+ admin);
			}
		}catch(CannotGetJdbcConnectionException ex) {
			
			ex.printStackTrace();
			
		}catch(DataAccessException ex) {
			
			ex.printStackTrace();
			
		}
		
		
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
