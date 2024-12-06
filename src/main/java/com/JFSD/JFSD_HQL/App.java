package com.JFSD.JFSD_HQL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	try {
        System.out.println( "Welcome to Students Data" );
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction txn =s.beginTransaction();
        
        Student sd= new Student();
        
        sd.setSid(10);
        sd.setSname("Pavani");
        sd.setSgen("Female");
        sd.setSdept("CSE");
        sd.setSprogram("BTECH");
        sd.setSdob("01-01-2007");
        sd.setSph("9398930825");
        sd.setSgraduation("No");
        sd.setSCGPA(10);
        sd.setSbacklogs(0);
        s.save(sd);
        System.out.println("Data Inserted");
        txn.commit();
         s.close();
        
    	}catch(Exception e) {
    		e.printStackTrace();
    		//System.out.println("Error");
    	}
    }
}
