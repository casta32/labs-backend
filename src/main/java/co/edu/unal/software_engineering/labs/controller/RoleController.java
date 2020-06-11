package co.edu.unal.software_engineering.labs.controller;

import co.edu.unal.software_engineering.labs.model.Role;
import co.edu.unal.software_engineering.labs.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//comentario 1 lab4
import java.util.List;

@RestController
public class RoleController{

    private RoleService roleService;


    public RoleController( RoleService roleService ){
        this.roleService = roleService;
    }


    @GetMapping( value = { "/roles" } )
    public List<Role> getAllRoles( ){
        return roleService.getAll( );
    }
}
