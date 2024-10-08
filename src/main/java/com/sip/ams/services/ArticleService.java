package com.sip.ams.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sip.ams.entities.Article;

import com.sip.ams.repositories.ArticleRepository;


@Service
public class ArticleService {
	@Autowired
	ArticleRepository articleRepository;
	
	public Article saveArticle(Article article) {
		 return articleRepository.save(article);
	
	
	}
	
	public List <Article>listArticle()
	{
		return (List<Article>)articleRepository.findAll();
	}

	public void delete(long id) {
		articleRepository.deleteById(id);
		
	}
	public Optional <Article> findArticleById(long id)
	{
		return articleRepository.findById(id);
	}
}