package tn.spring.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entity.Equipe;
import tn.spring.springboot.repository.IEquipeRepository;

import java.util.List;

@Service
public class EquipeServiceImpl implements EquipeService{

    @Autowired
    IEquipeRepository equipeRepository;

    public List<Equipe> getAllEquipe() {
        return (List<Equipe>) equipeRepository.findAll();
    }
}
