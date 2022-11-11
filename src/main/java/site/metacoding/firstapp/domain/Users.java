package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.firstapp.web.dto.request.users.UpdateDto;

@NoArgsConstructor
@Setter
@Getter
public class Users {
	private Integer usersId;
	private String userName;
	private String password;
	private String email;
	private Timestamp createdAt;

	public Users(String username, String password, String email) {
		this.userName = username;
		this.password = password;
		this.email = email;
	}
	
	public void update(UpdateDto updateDto) {
		this.password = updateDto.getPassword();
		this.email = updateDto.getEmail();
	}
}
