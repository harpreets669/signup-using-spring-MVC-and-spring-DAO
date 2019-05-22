package daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import models.Signup;
@Component
public class SignupDaoImpl implements SignupDao {

	@Autowired
	JdbcTemplate jtemp;
	
	@Override
	public void saveData(Signup s) {
		String sql = "insert into signup_details values(?,?,?,?)";
		Object[] params= {s.getEmail(), s.getPass(), s.getName(), s.getMobile()};
		
		jtemp.update(sql, params);
	}

}
