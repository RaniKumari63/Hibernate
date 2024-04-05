

import org.hibernate.Session;

import com.suchiit.pojo.StudentEntity;
import com.suchiit.utility.SessionUtility;

public class Update {
	
	public static void main(String[] args)
	{
Session session=SessionUtility.getSession();
org.hibernate.Transaction tx=session.beginTransaction();
StudentEntity st=new StudentEntity();
st.setSno(80);
st.setSadd("gggg");
st.setSname("rani");
StudentEntity stu=(StudentEntity)session.merge(st);
System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
st.setSadd("ggggkkkjj");
	tx.commit();
	}
}
