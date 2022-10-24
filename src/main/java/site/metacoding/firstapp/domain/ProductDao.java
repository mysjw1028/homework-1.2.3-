package site.metacoding.firstapp.domain;

import java.util.List;

import site.metacoding.firstapp.web.dto.ProductReqDto;

public interface ProductDao {
	public Product findById(Integer productId);

	public List<Product> findAll();

	public int insert(ProductReqDto productReqDto );

	public int update(Product product);

	public int deleteById(Integer productId);

	public int insert(Product product);
}
