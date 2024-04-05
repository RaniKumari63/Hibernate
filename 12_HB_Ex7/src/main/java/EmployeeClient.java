import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.SessionUtility.SessionUtillity;
import com.suchiit.entity.EmployeeEnitity;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Session session=SessionUtillity.getSession();
	Transaction t=session.beginTransaction();
	//EmployeeEnitity e1=new EmployeeEnitity(111,"aaa","aaa@gmail.com",60000);
	//EmployeeEnitity e2=new EmployeeEnitity(222,"bbb","bbb@gmail.com",70000);
	//EmployeeEnitity e3=new EmployeeEnitity(333,"ccc","ccc@gmail.com",80000);
	//EmployeeEnitity e4=new EmployeeEnitity(444,"ddd","ddd@gmail.com",90000);
	
	//session.save(e1);
	//session.save(e2);
	//session.save(e3);
	//session.save(e4);
	t.commit();
	session.close();
	
	}

}
