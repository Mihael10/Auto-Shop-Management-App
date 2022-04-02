package com.avtosalon.auto_shop_management.controller;


import com.avtosalon.auto_shop_management.entity.MarkiEntity;
import com.avtosalon.auto_shop_management.repository.MarkiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@CrossOrigin("http://localhost:9999")
@RestController
@RequestMapping("/")
public class MarkiController {


    private final MarkiRepository markiRepository;

    public MarkiController(MarkiRepository markiRepository) {
        this.markiRepository = markiRepository;
    }


    @GetMapping("/marki")
    public List<MarkiEntity> getAll(){
        return new ArrayList<>(markiRepository.findAll());
    }

    @GetMapping("/get-marka/{marki_id}")
    public List<MarkiEntity> getMarkiById (@PathVariable(value = "marki_id") int marki_id){

        List<MarkiEntity> model = markiRepository.findById(marki_id).stream().collect(Collectors.toList());
        return model;
    }

    @PostMapping("/insert-marka")
    public MarkiEntity insertMarki (@RequestBody MarkiEntity marki){
        MarkiEntity insert = new MarkiEntity();
        insert.setMarki_name(insert.getMarki_name());
        insert.setCountry(insert.getCountry());
        insert.setEu(insert.isEu());
        insert.setMarki_img(insert.getMarki_img());
        log.info("Saving new data...{} " + marki);
        return markiRepository.save(marki);
    }
      @PutMapping("/update-marka/{marki_id}")
      public ResponseEntity<MarkiEntity> updateMarki(@RequestBody MarkiEntity newMarka, @PathVariable int marki_id) {
             markiRepository.findById(marki_id)
                    .map(marki -> {
                        marki.setMarki_name(newMarka.getMarki_name());
                        marki.setCountry(newMarka.getCountry());
                        marki.setEu(newMarka.isEu());
                        marki.setMarki_img(newMarka.getMarki_img());
                        log.info("Saving update...{} " + marki);
                        log.info("Saving to database...");
                        return markiRepository.save(marki);

                    });
                log.info("Show JSON format");
                return ResponseEntity.ok(newMarka);
    }



    @DeleteMapping("/delete-marka/{marki_id}")
    public Map<String, Boolean> deleteMarka(@PathVariable(value = "marki_id") int marki_id)
    {
        MarkiEntity marki = markiRepository.findById(marki_id).get();

        markiRepository.delete(marki);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
