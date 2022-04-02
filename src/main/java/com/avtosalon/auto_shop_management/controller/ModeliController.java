package com.avtosalon.auto_shop_management.controller;

import com.avtosalon.auto_shop_management.entity.ModeliEntity;
import com.avtosalon.auto_shop_management.repository.ModeliRepository;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:9999")
@RequestMapping("/")
public class ModeliController {



    private final ModeliRepository modeliRepository;

    public ModeliController(ModeliRepository modeliRepository) {
        this.modeliRepository = modeliRepository;
    }


    @GetMapping("/modeli")
    public Collection<ModeliEntity> getAll(){
        return modeliRepository.findAll();
    }

    @GetMapping("/get-model/{modeli_id}")
    public List<ModeliEntity> getModelById (@PathVariable(value = "modeli_id") int modeli_id){

    List<ModeliEntity> model = modeliRepository.findById(modeli_id).stream().toList();
       return model;
    }

    @PostMapping("/insert-model")
    public ModeliEntity model (@RequestBody ModeliEntity model){
        ModeliEntity insert = new ModeliEntity();
        insert.setModeli_name(insert.getModeli_name());
        insert.setColor(insert.getColor());
        insert.setPrice(insert.getPrice());
        return modeliRepository.save(model);
    }
    @PutMapping("/update/{modeli_id}")
    public ResponseEntity <ModeliEntity> updateModel(@RequestBody ModeliEntity newModel, @PathVariable int modeli_id) {
         modeliRepository.findById(modeli_id)
                .map(modeli -> {
                    modeli.setModeli_name(newModel.getModeli_name());
                    modeli.setColor(newModel.getColor());
                    modeli.setPrice(newModel.getPrice());
                    return modeliRepository.save(modeli);

                });
        return ResponseEntity.ok(newModel);
    }


    @DeleteMapping("/delete-model/{modeli_id}")
    public Map<String, Boolean> deleteModel(@PathVariable(value = "modeli_id") int modeli_id)
    {
        ModeliEntity modeli = modeliRepository.findById(modeli_id).get();

        modeliRepository.delete(modeli);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
