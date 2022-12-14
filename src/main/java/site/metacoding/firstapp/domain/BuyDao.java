package site.metacoding.firstapp.domain;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.buy.BuyDto;
import site.metacoding.firstapp.web.dto.request.buy.BuyListDto;

public interface BuyDao {
	public void insert(BuyDto buyDto);
	public int update(Buy buy);
	public Buy findById(Integer productId);
	public int deleteById(Integer productId);
	public List<Buy> findAll();
	public List<BuyListDto> buyList(Integer id);//구매목록보기 리스트 디티오 추가적으로 넣음

}
