package managers;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entidades.Alumnos;

public class Acceso {
	
	protected SessionFactory sessionFactory;
	 
	protected void setup() { 
	// code to load Hibernate Session factory
		 final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build(); 
				 // configures settings from hibernate.cfg.xml 
				 try { 
				 sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory(); 
				 } catch (Exception ex) { 
				 StandardServiceRegistryBuilder.destroy(registry); 
				 }
				 
				 //Una vez que Hibernate crea la SessionFactory, 
				 //se puede abrir una Session y comenzar una transacción
				 Session session = sessionFactory.openSession(); 
				 session.beginTransaction();
				 	 
	}
	
	protected void exit() {
		 // code to close Hibernate Session factory
			sessionFactory.close();
		}
	
	protected void create(){
		
		 try (Scanner scanner = new Scanner(System.in)) {
			
			 
			 System.out.println("Ingrese el nombre:");
	        String nombre = scanner.nextLine();

	        System.out.println("Ingrese los apellidos:");
	        String apellidos = scanner.nextLine();
	        
	        System.out.println("Ingrese el curso:");
	        String curso = scanner.nextLine();
	        
	        System.out.println("Ingrese el número de asignaturas en las que esta matriculado:");
	        int asigna = scanner.nextInt();
	        
	        System.out.println("Ingrese su edad:");
	        int edad = scanner.nextInt();
	        
	        Alumnos alu = new Alumnos();
	        
	        alu.setNombre(nombre);
	        
	        alu.setApellidos(apellidos);
	        
	        alu.setCurso(curso);
	        
	        alu.setNumeroAsignatuas(asigna);
	        
	        alu.setEdad(edad);
	        
	        Session session = sessionFactory.openSession();
	        
	        session.beginTransaction();
			
	        session.save(alu);
			
			session.getTransaction().commit(); 
			
			session.close();
	        
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
		
	}
}

