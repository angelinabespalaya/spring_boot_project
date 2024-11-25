package com.angelina.demo_cargo.controller;

import com.angelina.demo_cargo.MyException;
import com.angelina.demo_cargo.entity.Cargo;
import com.angelina.demo_cargo.service.CargoService;
//import com.vaadin.flow.router.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cargo")
public class AppResource {

    private CargoService cargoService;

    public AppResource(CargoService cargoService) {
        this.cargoService = cargoService;
    }


    @GetMapping("/{id}")
    public Cargo findById(@PathVariable long id) {
        return cargoService.findById(id).orElseThrow(() -> new MyException("not found"));
    }

    @PostMapping
    public Cargo create(@RequestBody Cargo cargo) {
        return cargoService.save(cargo);
    }
}
