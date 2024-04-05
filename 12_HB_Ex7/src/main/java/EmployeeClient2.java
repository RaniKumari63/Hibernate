import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.suchiit.SessionUtility.SessionUtillity;
import com.suchiit.entity.EmployeeEnitity;

public class EmployeeClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Session session=SessionUtillity.getSession();
		/*
		 * Criteria cri=session.createCriteria(EmployeeEnitity.class);
		 * List<EmployeeEnitity> list =cri.list(); Criterion cr=Restrictions.eq("id",
		 * 111);
		 * 
		 * cri.add(cr); EmployeeEnitity emp=(EmployeeEnitity)cri.uniqueResult();
		 * System.out.println(emp.getId()+"\t"+emp.getName()); session.close();
		 */
	
	
		/*
		 * Criteria cri=session.createCriteria(EmployeeEnitity.class);
		 * List<EmployeeEnitity> list =cri.list(); Criterion
		 * cr=Restrictions.gt("salary",70000);
		 * 
		 * cri.add(cr); List<EmployeeEnitity> emp=cri.list(); for(EmployeeEnitity e:emp)
		 * System.out.println(e.getName()+"\t"+e.getId()+"\t"+e.getEmail()+"\t"+e.
		 * getSalary());
		 * 
		 */

		/*
		 * Criteria cri=session.createCriteria(EmployeeEnitity.class); Projection
		 * p=Projections.property("name"); Projection p1=Projections.property("email");
		 * ProjectionList plist=Projections.projectionList(); plist.add(p);
		 * plist.add(p1); cri.setProjection(plist); List<Object[]> list=cri.list();
		 * for(Object[] o:list) { System.out.println(o[0]); System.out.println(o[1]); }
		 */


		/*
		 * Criteria cri=session.createCriteria(EmployeeEnitity.class); Projection
		 * p=Projections.avg("salary"); cri.setProjection(p); double
		 * avg_salary=(Double)cri.uniqueResult(); System.out.println(avg_salary);
		 */
    


		/*
		 * Criteria cri=session.createCriteria(EmployeeEnitity.class); Projection
		 * p=Projections.max("salary"); cri.setProjection(p); int
		 * max_salary=(Integer)cri.uniqueResult(); System.out.println(max_salary);
		 * 
		 */
		/*
		 * 
		 * Criteria cri=session.createCriteria(EmployeeEnitity.class); Projection
		 * p=Projections.min("salary"); cri.setProjection(p); int
		 * min_salary=(Integer)cri.uniqueResult(); System.out.println(min_salary);
		 */
        
        
        Criteria cri=session.createCriteria(EmployeeEnitity.class);
        Projection p=Projections.count("salary");
        cri.setProjection(p);
            long count_salary=(Long)cri.uniqueResult();
            System.out.println(count_salary);
session.close();
	}

}
