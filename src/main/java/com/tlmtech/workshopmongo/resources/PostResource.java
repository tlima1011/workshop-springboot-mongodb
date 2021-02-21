package com.tlmtech.workshopmongo.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tlmtech.workshopmongo.domain.Post;
import com.tlmtech.workshopmongo.domain.User;
import com.tlmtech.workshopmongo.dto.PostDTO;
import com.tlmtech.workshopmongo.dto.UserDTO;
import com.tlmtech.workshopmongo.services.PostService;
import com.tlmtech.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

	@Autowired
	private PostService service; 
		
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<PostDTO>> findAll(){
		List<Post> list = service.findAll(); 
		List<PostDTO> listDto = list.stream().map(x -> new PostDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
	/*
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<PostDTO> findById(@PathVariable String id){
		Postobj = service.findById(id); 
		return ResponseEntity.ok().body(new UserDTO(obj));
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody UserDTO objDto){
		PostObj = service.fromDTO(objDto); 
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); 
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id); 
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String id){
		Postobj = service.fromDTO(objDto); 
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	*/
}
