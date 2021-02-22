package com.tlmtech.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlmtech.workshopmongo.domain.Post;
import com.tlmtech.workshopmongo.domain.User;
import com.tlmtech.workshopmongo.repository.PostRepository;
import com.tlmtech.workshopmongo.repository.UserRepository;
import com.tlmtech.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}
}
