/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EXAMEN_PARCIAL_EJERCICIO_02.controller;

import com.example.EXAMEN_PARCIAL_EJERCICIO_02.model.VentaEntradas;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jeanc
 */
@Controller
public class RegistroController {
    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("ventaEntradas", new VentaEntradas());
        return "registro";
    }

    @PostMapping("/registro")
    public String procesarFormulario(@Valid VentaEntradas ventaEntradas, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registro";
        }

        model.addAttribute("ventaEntradas", ventaEntradas);
        return "exito";
    }
}
