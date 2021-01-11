package test;

import java.util.List;

import com.stocker.DAO.ArticleDao;
import com.stocker.DTO.ArticleDTO;

public class ArticleDao_test {

	public static void main(String[] args) {
		
		List<ArticleDTO> list = ArticleDao.getAllArticle();
	}

}
