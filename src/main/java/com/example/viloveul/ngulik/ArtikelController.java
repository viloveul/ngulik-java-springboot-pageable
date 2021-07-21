package com.example.viloveul.ngulik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fajrul Akbar Zuhdi 2021-07-21
 */
@RestController
@RequestMapping(path = "/artikel")
public class ArtikelController {

    @Autowired
    private ArtikelService artikelService;

    @GetMapping
    public Map<String, Object> loadAll(Pageable pageable) {
        Page<Artikel> artikels = this.artikelService.loadAll(pageable);
        Map<String, Object> result = new HashMap<>();
        result.put("items", artikels.getContent());
        result.put("pages", artikels.getTotalPages());
        result.put("total", artikels.getTotalElements());
        return result;
    }

}
