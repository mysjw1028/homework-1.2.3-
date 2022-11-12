package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Buy {
	private Integer Id;
	private Integer productId;
	private Integer usersId;
	private Timestamp createdAt;

}
