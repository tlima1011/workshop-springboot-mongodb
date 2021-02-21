package com.tlmtech.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlmtech.workshopmongo.domain.Post;
import com.tlmtech.workshopmongo.domain.User;
import com.tlmtech.workshopmongo.repository.PostRepository;
import com.tlmtech.workshopmongo.repository.UserRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public List<Post> findAll(){
		return repo.findAll();
	}
	
}
