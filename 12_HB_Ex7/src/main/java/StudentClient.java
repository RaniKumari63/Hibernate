import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.SessionUtility.SessionUtillity;
import com.suchiit.entity.StudentEntity;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=SessionUtillity.getSession();
Transaction tx=session.beginTransaction();
StudentEntity st=new StudentEntity();
session.get(StudentEntity.class, 111);
st.setId(5);
st.setName("ccc");
st.setAddress("hyd");
st.setEmail("ccc@gmail.com");
//int id=(Integer) session.save(st);
//session.persist(st);
//session.saveOrUpdate(st);
//session.update(st);
session.merge(st);
tx.commit();
	}

}
