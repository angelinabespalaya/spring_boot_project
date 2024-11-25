package com.angelina.demo_cargo.service;

import java.util.List;
import java.util.Optional;

import com.angelina.demo_cargo.entity.Blog;
import com.angelina.demo_cargo.entity.Cargo;
import com.angelina.demo_cargo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired; // связь всех зависимостей
import org.springframework.stereotype.Service;
// Service – указывает, что класс является сервисом для реализации бизнес логики.

@Service
public class BlogService {
    @Autowired
    private BlogRepository repo;

    public List<Blog> listAll(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    public Blog save(Blog blog) {return repo.save(blog);}

    public Blog get(Long id) {
        return repo.findById(id).get();
    }
    public Optional<Blog> findById(long id) {
        return repo.findById(id);
    }


    public void delete(Long id) {
        repo.deleteById(id);
    }
}
