package com.example.Okter;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CRUDController {

    public CRUDService crudService;

    public CRUDController(CRUDService crudService) {
        this.crudService = crudService;
    }

    @PostMapping("/create")
    public String create(@RequestBody CRUD crud) throws InterruptedException,ExecutionException{
        return crudService.create(crud);
    }
/**
    @GetMapping("/get")
    public CRUD get(@RequestBody String documentId) throws InterruptedException,ExecutionException{
        return crudService.get(documentId);
    }
 **/

    @PutMapping("/update")
    public String update(@RequestBody CRUD crud) throws InterruptedException,ExecutionException{
        return crudService.update(crud);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody String id) throws InterruptedException,ExecutionException{
        return crudService.delete(id);
    }

    @GetMapping("/get")
    public CRUD get() throws ExecutionException, InterruptedException {
        return crudService.get("PjN5WvnNM6ZAoJ6xD4sVwCkARiC2");
        //return "Connected";
    }
    
}
