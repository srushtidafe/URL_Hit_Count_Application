package com.Geekster.URLHitCount.Repository;

import com.Geekster.URLHitCount.Model.UrlHit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UrlHitDao {

    List<UrlHit> urlHitList ;

    public UrlHitDao(){
        urlHitList = new ArrayList<>() ;
    }
    public UrlHit HitUrlCount(String name){
        if(!urlHitList.isEmpty()) {

            for (UrlHit ele : urlHitList) {
                String varName = ele.name;
                if (name.equals(varName)) {
                    ele.count++;
                    return ele;
                }
            }
            urlHitList.add(new UrlHit(name));
            urlHitList.get(urlHitList.size()-1).count++;
            return urlHitList.get(urlHitList.size()-1);
        }else{
            urlHitList.add(new UrlHit(name));
            urlHitList.get(0).count++;
            return urlHitList.get(0);
        }
    }

    public List<UrlHit> getAllHitUrlCount() {
        return urlHitList;
    }
}
