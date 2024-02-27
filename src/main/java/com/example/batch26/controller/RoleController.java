package com.example.batch26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.batch26.model.Role;
import com.example.batch26.repository.RoleRepository;

//http://localhost:8080/role
@Controller
@RequestMapping("role")
public class RoleController {
    
    @Autowired //Instansiasi interface agar dapat dipanggil sebagai objek
    private RoleRepository roleRepository;

    @GetMapping
    public String index(Model model){

        model.addAttribute("roles", roleRepository.findAll());
        return "role/index";
    }

    //http://localhost:8080/role/form
    @GetMapping("form")
    public String form(Model model){
        model.addAttribute("role", new Role());
        return "role/form";
    }

    //http://localhost:8080/role/save
    @PostMapping("save")
    public String save(Role role){
        roleRepository.save(role);
        Boolean result = roleRepository.findById(role.getId()).isPresent();
        if (result) {
            return "redirect:/role";
        }
        return "role/form";
    }

}
