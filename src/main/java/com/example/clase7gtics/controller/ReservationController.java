package com.example.clase7gtics.controller;

import com.example.clase7gtics.entity.rol;
import com.example.clase7gtics.repository.FuncionesRepository;
import com.example.clase7gtics.repository.rolRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    final FuncionesRepository funcionesRepository;


    public ReservationController(rolRepository productRepository, FuncionesRepository funcionesRepository) {
        this.funcionesRepository = funcionesRepository;

    }

    @GetMapping("/new")
    public String nuevoProductoFrm(Model model, @ModelAttribute("product") rol product) {
        model.addAttribute("listaCategorias", funcionesRepository.findAll());
        return "product/editFrm";
    }



    @GetMapping("/edit")
    public String editar(Model model, @RequestParam("id") int id,
                                      @ModelAttribute("product") rol product) {



        if (optFunc.isPresent()) {
            product = optFunc.get();
            model.addAttribute("product", product);
            model.addAttribute("listaCategorias", funcionesRepository.findAll());
            return "product/editFrm";
        } else {
            return "redirect:/product";
        }
    }

    @GetMapping("/delete")
    public String borrarTransportista(Model model,
                                      @RequestParam("id") int id,
                                      RedirectAttributes attr) {

        Optional<rol> optProduct = roomRepository.findById(id);

        if (optProduct.isPresent()) {
            roomRepository.deleteById(id);
            attr.addFlashAttribute("msg", "borrado exitosamente");
        }
        return "redirect:/product";

    }

}
