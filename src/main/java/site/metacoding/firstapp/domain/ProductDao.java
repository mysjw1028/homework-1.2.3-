package site.metacoding.firstapp.domain;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface ProductDao {
	public Product findById(Integer productId);

	public List<Product> findAll();

	public int update(Product product);

	public int updateQty(@Param("productQty")Integer qty, @Param("productId") Integer id);

	public int deleteById(Integer productId);

	public int insert(Product product);
	
	public Product findByIdProductName(String productName);

}
