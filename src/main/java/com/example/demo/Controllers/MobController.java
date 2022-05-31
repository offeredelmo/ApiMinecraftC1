package com.example.demo.Controllers;

import com.example.demo.Entities.Mob;
import com.example.demo.Services.MobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mob")
public class MobController {

    @Autowired
    private MobServices services;

    @GetMapping
    List<Mob> getList(){
        return services.getList();
    }

    @PostMapping
    public Mob postAdd(@RequestBody Mob mob){
        return services.postAdd(mob);
    }

    @PostMapping
    public Mob PostModify(@RequestBody @Validated Mob mob){
        return  services.PostModify(mob);
    }




}
