


import org.hibernate.Session;

import com.suchiit.pojo.StudentEntity;
import com.suchiit.utility.SessionUtility;

public class Update4 {
	
	public static void main(String[] args)
	{
Session session=SessionUtility.getSession();
org.hibernate.Transaction tx=session.beginTransaction();
StudentEntity st=session.get(StudentEntity.class,1);
st.setSadd("India");

session.update(st);
	tx.commit();
	}
}
