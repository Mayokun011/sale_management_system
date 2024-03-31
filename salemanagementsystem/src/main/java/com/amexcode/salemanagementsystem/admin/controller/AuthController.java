package com.amexcode.salemanagementsystem.admin.controller;


import com.amexcode.salemanagementsystem.products.dto.AdminDto;
import com.amexcode.salemanagementsystem.products.entity.Admin;
import com.amexcode.salemanagementsystem.products.service.AdminService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor

public class AuthController {
    private final AdminService adminService;
    private final BCryptPasswordEncoder passwordEncoder;

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("title", "Login Page");
        return "login";
    }
    @RequestMapping
    public String index(Model model){
        model.addAttribute("title", "Home Page");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken){
            return "redirect:/login";
        }
        return "index";
    }
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("title", "Register");
        model.addAttribute("adminDto", new AdminDto());
        return "register";
    }
    @GetMapping("/forgot_password")
    public String forgotPassword(Model model){
        model.addAttribute("title", "Forgot Password");
        return "forgot_password";
    }

    @PostMapping("/register_new_adminr")
    public String addNewAdmin(@Valid @ModelAttribute("adminDto") AdminDto adminDto,
                              BindingResult result, Model model){
        try{
            if(result.hasErrors()){
                model.addAttribute("adminDto", adminDto);
                return "register";
            }
            String username = adminDto.getUsername();
            Admin admin = adminService.findByUserName(username);
            if(admin != null){
                model.addAttribute("adminDto", adminDto);
                System.out.println("Admin not null");
                model.addAttribute("emailError", "Your email has been registered!");
                return "register";
            }
            if(adminDto.getPassword().equals(adminDto.getRepeatPassword())){
                adminDto.setPassword(passwordEncoder.encode(adminDto.getPassword()));
                adminService.save(adminDto);
                System.out.println("SUCCESS");
                model.addAttribute("SUCCESS", "Register Successfully");
                model.addAttribute("adminDto", adminDto);
            }else {
                model.addAttribute("adminDto", adminDto);
                model.addAttribute("passwordError", "Wrong Password! Check again!");
                System.out.println("Incorrect Password");
            }
        }catch (Exception exception){
            exception.printStackTrace();
            model.addAttribute("errors", "The server has been wrong!");
        }
        return "register";
    }

}
