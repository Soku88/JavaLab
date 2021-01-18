package test;


import com.stocker.DAO.ArticleDao;
import com.stocker.DTO.ArticleDTO;

public class ArticleDao_test {

	public static void main(String[] args) {
		//select(id)
		ArticleDTO data = ArticleDao.select(3);
		System.out.println(data);

		// selectAll()
//		List<ArticleDTO> list = ArticleDao.selectAll();
//
//		for (ArticleDTO dto : ArticleDao.selectAll()) {
//			System.out.println(dto);
//
//		}
	}

}
