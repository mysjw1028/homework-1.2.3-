package site.metacoding.firstapp.web.dto.request.buy;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstapp.domain.Users;

@Setter
@Getter
public class BuyDto {
	private Integer productId;
	private Integer id;
	private Integer productQty;
}
