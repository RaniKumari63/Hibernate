

import org.hibernate.Session;

import com.suchiit.pojo.StudentEntity;
import com.suchiit.utility.SessionUtility;

public class Update2 {
	
	public static void main(String[] args)
	{
Session session=SessionUtility.getSession();
org.hibernate.Transaction tx=session.beginTransaction();
StudentEntity st=new StudentEntity();
st.setSno(80);
st.setSadd("ggggxxx");
st.setSname("rani");
session.saveOrUpdate(st);
	tx.commit();
	}
}