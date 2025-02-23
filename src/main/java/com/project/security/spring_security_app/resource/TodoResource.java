package com.project.security.spring_security_app.resource;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
public class TodoResource {
    private Logger logger = LoggerFactory.getLogger(getClass());
    record Todo(String username , String Description) {}
    private static List<Todo> Todos_List =
            List.of(new Todo("Aditi" , "learn spring-framework"),
                    new Todo("Aditi" , "learn spring-boot"));
        @GetMapping("/todos")
        public List<Todo> retrieveAllTodos() {
            return Todos_List;
          }
    @GetMapping("/{username}/todos")
    public Todo retrieveSpecificUser(@PathVariable String username) {
        return Todos_List.get(1);
        }
    @PostMapping("/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable String username,
                                          @RequestBody Todo todo) {
        logger.info("Create {} for {}", todo, username);

    }
}