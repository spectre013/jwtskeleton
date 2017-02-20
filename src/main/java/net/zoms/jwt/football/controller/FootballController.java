package net.zoms.jwt.football.controller;

import net.zoms.jwt.football.model.Football;
import net.zoms.jwt.football.repository.FootballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/football")
public class FootballController {
    @Autowired
    private FootballRepository repository;

    @RequestMapping(value = "/season",method = RequestMethod.GET)
    public List<Football> getGames(){
        return repository.findAll();
    }



}
