package com.novellius;

import java.sql.Timestamp;
import java.util.ArrayList;
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
		List <Admin> admins = new ArrayList<Admin>();
		admins.add(new Admin("julio","desarrollador",ts));
		admins.add(new Admin("ricardo","desarrollador",ts));
		admins.add(new Admin("Fernando","director",ts));
		
		int[] vals = adminDao.saveAll(admins);
		
//		for(Integer i=0; i<vals.length; i++) {
//			
//			System.out.println("filas agregadas "+vals[i]);
//		}
		
		for(int i : vals) {
			
			System.out.println("filas afectadas para la operacion" + i);
		}
		
		}catch(CannotGetJdbcConnectionException ex) {
			
			ex.printStackTrace();
			
		}catch(DataAccessException ex) {
			
			ex.printStackTrace();
			
		}
		
		
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
