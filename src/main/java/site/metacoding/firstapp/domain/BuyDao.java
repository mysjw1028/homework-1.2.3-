package site.metacoding.firstapp.domain;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.buy.BuyDto;

public interface BuyDao {
	public void insert(BuyDto buyDto);
	public int update(Buy buy);
	public Buy findById(Integer productId);
	public int deleteById(Integer productId);
	public List<Buy> findAll();

}
