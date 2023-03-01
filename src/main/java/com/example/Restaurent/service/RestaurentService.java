package com.example.Restaurent.service;

import com.example.Restaurent.model.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurentService {
    private static final List<Restaurent> res=new ArrayList<>();
    static {
        res.add(new Restaurent("Shayam","delhi","12346789","biryani"));
    }

    public List<Restaurent> findAll(){
        return res;
    }
    public Restaurent findByName(String name){
        Predicate<? super Restaurent> predicate=restaurent -> restaurent.getName().equals(name);
        return res.stream().filter(predicate).findFirst().get();
    }
    public void addList(Restaurent restaurent)
    {
        res.add(restaurent);
    }
    public void updateRestaurent(String name, Restaurent newRestaurent)
    {
        Restaurent item=findByName(name);
        item.setName(newRestaurent.getName());
        item.setCity(newRestaurent.getCity());
        item.setNo(newRestaurent.getNo());
        item.setSpecialist(newRestaurent.getSpecialist());
    }
    public void deleteRestaurent(String name)
    {
        Predicate<? super Restaurent> predicate= restaurent ->restaurent.getName().equals(name);
        res.removeIf(predicate);
    }

}
