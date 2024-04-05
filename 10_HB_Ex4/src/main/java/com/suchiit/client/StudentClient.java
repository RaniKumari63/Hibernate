package com.suchiit.client;

import org.hibernate.Session;

import com.suchiit.SessionUtility.SessionUtilityClass;
import com.suchiit.model.StudentEntity;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	StudentEntity st=new StudentEntity();
	st.setId(111);
	st.setName("aaa");
	
st.setEmail("aaa@gmail.com");
st.setMarks(500);//Till now student Object state is transient
Session session=SessionUtilityClass.getSession();
session.save(st);//Till now student Object state is persistant

session.beginTransaction().commit();//student object will move database state

session.evict(st);// student object in detacthed state//student object will be delete from persistant 
//then gc can collect ur student object
	}

}
