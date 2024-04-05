


import org.hibernate.Session;

import com.suchiit.pojo.StudentEntity;
import com.suchiit.utility.SessionUtility;

public class Update5 {
	
	public static void main(String[] args)
	{
Session session=SessionUtility.getSession();
org.hibernate.Transaction tx=session.beginTransaction();
StudentEntity st=session.get(StudentEntity.class,1);
st.setSadd("Indiaeee");

session.flush();
	tx.commit();
	}
}
