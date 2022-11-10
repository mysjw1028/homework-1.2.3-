package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Users {
	private Integer usersId;
	private String username;
	private String password;
	private String email;
	private Timestamp createdAt;
}
