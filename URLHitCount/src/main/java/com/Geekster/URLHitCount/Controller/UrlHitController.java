package com.Geekster.URLHitCount.Controller;

import com.Geekster.URLHitCount.Model.UrlHit;
import com.Geekster.URLHitCount.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;
    @GetMapping("Count/name/{name}")
    public UrlHit HitUrlCount(@PathVariable String name){
        return urlHitService.HitUrlCount(name);
    }
    @GetMapping("CountAll")
    public List<UrlHit> getAllHitUrlCount(){
        return urlHitService.getAllHitUrlCount();
    }
}
