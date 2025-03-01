package com.mugundhan.spring_audit.spring_audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableJpaRepositories(repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
public class BookController {
    @Autowired
    private BookRepo bookRepo;

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book){
        return bookRepo.save(book);
    }

    @PutMapping("/update/{id}/{pages}")
    public String updateBook(@PathVariable int id,  @PathVariable int pages){
        Book book = bookRepo.findById(id).get();
        book.setPages(pages);
        bookRepo.save(book);
        return "Book Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookRepo.deleteById(id);
        return "Book Deleted";
    }

}
