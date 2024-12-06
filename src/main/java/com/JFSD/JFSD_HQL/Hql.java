package com.JFSD.JFSD_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class Hql {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
        
		cfg.configure();
        
		SessionFactory sf=cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction txn =s.beginTransaction();
        
        //1.HQL query to display all student records with all columns.
     /*  Query q=s.createQuery("from Student");//Student persistance class name
       
       List<Student> li =q.list();
       //System.outprintln(li);
       for(Student s1 : li) {
       System.out.println(s1);
       }
       
      */  
        
       //2.HQL query to display all student records with specific columns.
      
      /* Query q = s.createQuery("select Sid,Sname from Student");
       List<Object[]> li = (List<Object[]>) q.list();
       for(Object[] s1 : li) {
    	   System.out.println(s1[0] +":"+s1[1]);
       }*/
       
        
        //3.HQL query to display only names of all students whose CGPA is greater than 7.
        
        
     /*   Query q = s.createQuery("select Sname from Student where SCGPA > 7");
        List<Object[]> li = (List<Object[]>) q.list();
        
     	   System.out.println(li);
        */
        
        /*4.HQL query to delete a Student whose Student ID is 30101 using input parameter (?) as
        well as named parameter (:) */
        
      /*  Query q=s.createQuery("delete from Student where Sid=:tempid");
        		q.setParameter("tempid",8);
        		int status = q.executeUpdate();
        		System.out.println(status);
        */		
        
        /*5. HQL query to update few details of a student whose Student ID is 30102 using input
parameter (?) as well as named parameter (:)*/
        
      /*
        Query q=s.createQuery("update Student set Sname=:n where Sid=:i");
        q.setParameter("n","Alina");
        q.setParameter("i","4");
        int status1 =q.executeUpdate();
        System.out.println(status1);
      */
        
        /*6. HQL query to perform aggregate functions like count (*), sum(), avg(), min(), max()
functions on CGPA column.*/
        
      /*  Query q=s.createQuery("select count(SCGPA) from Student");
        List<Integer> list=q.list();
        System.out.println(list.get(0));*/
        
        
      /*  Query q1=s.createQuery("select sum(SCGPA) from Student");
        List<Integer> li=q1.list();
        System.out.println(li.get(0));*/
        
      /*  Query q=s.createQuery("select avg(SCGPA) from Student");
        List<Integer> list=q.list();
        System.out.println(list.get(0));*/
        
      /*  Query q=s.createQuery("select min(SCGPA) from Student");
        List<Integer> list=q.list();
        System.out.println(list.get(0));*/
        
      /*  Query q=s.createQuery("select max(SCGPA) from Student");
        List<Integer> list=q.list();
        System.out.println(list.get(0));
       */ 
        
        
        //7. HCQL query to display specific columns from set of student records.
        
     /*   CriteriaBuilder cb = s.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        cq.select(root);
        
        Query q = s.createQuery(cq);
        List<Student> list = q.list();
        for(Student s1 : list) {
        	System.out.println(s1);
        }
        */
        //8.HCQL query to get 5th to 10th records. 3 to 5 
      /*  CriteriaBuilder cb = s.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        cq.select(root).where(cb.between(root.<Integer>get("Sid"), 3, 5));
         Query q = s.createQuery(cq);
        List<Student> list = q.list();
        for(Student s1 : list) {
        	System.out.println(s1);
        }
        */
        //9.. HCQL query to apply greater than, less than, greater than equal to, less than equal to, equal 
        //to and not equal to on CGPA column.
        
/*			CriteriaBuilder cb = s.getCriteriaBuilder();
           CriteriaQuery<Student> cq = cb.createQuery(Student.class);
           Root<Student> root = cq.from(Student.class);
           cq.select(root).where(cb.ge(root.<Integer>get("SCGPA"),7));
          
           Query q = s.createQuery(cq);
           List<Student> list = q.list();
           for(Student s1 : list) {
           	System.out.println(s1);
           }
           
        */
       /*10. HCQL query to get the records in ascending as well as descending order based on Student 
Name.*/
         
        CriteriaBuilder cb = s.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        //cq.orderBy(cb.asc(root.get("Sname")));
       cq.orderBy(cb.desc(root.get("Sname")));
       
        Query q = s.createQuery(cq);
        List<Student> list = q.list();
        for(Student s1 : list) {
        	System.out.println(s1);
        }
        txn.commit();
	}
}
