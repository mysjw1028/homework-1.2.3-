package site.metacoding.firstapp.domain;

import java.util.List;

public interface UsersDao {
	public Users findById(Integer usersId);

	public List<Users> findAll();

	public int update(Users users);

	public int deleteById(Integer users);

	public int insert(Users users);

}
