package com.example.lab5_20204205gtics.controller;


import com.example.lab5_20204205gtics.entity.User;
import com.example.lab5_20204205gtics.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    final UsuarioRepository userRepository;

    public UserController(UsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String listarEmpleados(Model model) {
        model.addAttribute("listaUsers", userRepository.findAll());

        return "user/list";
    }

    @GetMapping("/new")
    public String nuevoEmpleadoFrm(Model model) {
        return "user/newFrm";
    }



    @PostMapping("/save")
    public String guardarUsuario(User usuario,
                                  @RequestParam("birthdateStr") String birthdateStr,
                                  @RequestParam("hiredateStr") String hiredateStr) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");


        userRepository.save(usuario);
        return "redirect:/employee";
    }


}
