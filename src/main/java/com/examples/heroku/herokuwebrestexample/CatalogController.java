/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.heroku.herokuwebrestexample;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alain Carmona
 */
@RestController
public class CatalogController {
    
    @RequestMapping("/races")
    public List getRaces() {
        List<String> races = new ArrayList<>();
        races.add("Dwarf");
        races.add("Elf");
        races.add("Halfling");
        races.add("Human");
        races.add("Dragonborn");
        races.add("Gnome");
        races.add("Half-elf");
        races.add("Half-orc");
        races.add("Tiefling");
        return races;
    }
    
}
