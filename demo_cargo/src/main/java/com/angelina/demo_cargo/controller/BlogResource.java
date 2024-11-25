package com.angelina.demo_cargo.controller;

import com.angelina.demo_cargo.MyException;
import com.angelina.demo_cargo.entity.Blog;
import com.angelina.demo_cargo.service.BlogService;
import com.angelina.demo_cargo.service.CargoService;
//import com.vaadin.flow.router.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/blog")
public class BlogResource {

    private BlogService blogService;

    public BlogResource(BlogService blogService) {
        this.blogService = blogService;
    }


    @GetMapping("/{id}")
    public Blog findById(@PathVariable long id) {
        return blogService.findById(id).orElseThrow(() -> new MyException("not found"));
    }

    @PostMapping
    public Blog create(@RequestBody Blog blog) {
        return blogService.save(blog);
    }
}
