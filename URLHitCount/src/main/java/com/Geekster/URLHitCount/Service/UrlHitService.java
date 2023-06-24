package com.Geekster.URLHitCount.Service;

import com.Geekster.URLHitCount.Model.UrlHit;
import com.Geekster.URLHitCount.Repository.UrlHitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {
    @Autowired
    UrlHitDao urlHitDao;

    public UrlHit HitUrlCount(String name) {
        return urlHitDao.HitUrlCount(name);
    }

    public List<UrlHit> getAllHitUrlCount() {
        return urlHitDao.getAllHitUrlCount();
    }
}
