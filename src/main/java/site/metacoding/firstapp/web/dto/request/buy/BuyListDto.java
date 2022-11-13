package site.metacoding.firstapp.web.dto.request.buy;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstapp.domain.Users;

@Setter
@Getter
public class BuyListDto {
	private Integer id;
	private String productName;
	private Integer buyQty;
	private Integer productPrice;
	private Timestamp createdAt;
	private Integer no;
}
