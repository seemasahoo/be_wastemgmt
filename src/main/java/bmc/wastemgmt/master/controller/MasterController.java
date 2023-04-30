package bmc.wastemgmt.master.controller;
import bmc.wastemgmt.master.entity.GoodsEntity;
import bmc.wastemgmt.master.entity.GoodssubEntity;
import bmc.wastemgmt.master.entity.MccEntity;
import bmc.wastemgmt.master.entity.RouteEntity;
import bmc.wastemgmt.master.entity.WcEntity;
import bmc.wastemgmt.master.entity.ZoneEntity;
import bmc.wastemgmt.master.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/zone")
public class MasterController {

    @Autowired
    private MasterService masterService;

    // Health Check REST API
    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("Up and Running!", HttpStatus.OK);
    }

    // Get All Zone REST API
    @GetMapping
    public ResponseEntity<?> getAllZone() {
        return new ResponseEntity<>(masterService.getAllZone(), HttpStatus.OK);
    }

    // Add Zone REST API
    @PostMapping
    public ResponseEntity<ZoneEntity> addZone(@RequestBody ZoneEntity zone) {
        try {
            masterService.addZone(zone);
            return new ResponseEntity<>(zone, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Get By Zone Id REST API
    @GetMapping("{id}")
    public ResponseEntity<?> getZoneById(@PathVariable("id") long zoneId) {
        Optional<?> zoneData = masterService.getZoneById(zoneId);
        if (zoneData.isPresent()) {
            return new ResponseEntity<>(zoneData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Update Zone REST API
    @PostMapping("{id}")
    public ResponseEntity<ZoneEntity> updateZone(@PathVariable("id") Long zoneId, @RequestBody ZoneEntity zone) {
        try {
            zone.setZoneId(zoneId);
            masterService.updateZone(zone);
            return new ResponseEntity<>(zone, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete Zone REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletezone(@PathVariable("id") Long zoneId){
        masterService.deleteUser(zoneId);
        return new ResponseEntity<>("Zone successfully deleted!", HttpStatus.OK);
    }
    

// -----------------------wc start--------------------------
    // Get All Wc REST API
    @GetMapping("/getAllWc")
    public ResponseEntity<?> getAllWc() {
        return new ResponseEntity<>(masterService.getAllWc(), HttpStatus.OK);
    }

    // Add Wc REST API
    @PostMapping("/addWc")
    public ResponseEntity<WcEntity> addWc(@RequestBody WcEntity wc) {
        try {
            masterService.addWc(wc);
            return new ResponseEntity<>(wc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Get By Wc  REST API
    @GetMapping("/getWcById/{id}")
    public ResponseEntity<?> getWcById(@PathVariable("id") long wcId) {
        Optional<?> wcData = masterService.getWcById(wcId);
        if (wcData.isPresent()) {
            return new ResponseEntity<>(wcData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

 // Update Wc REST API
    @PutMapping("/updateWc/{id}")
    public ResponseEntity<WcEntity> updateWc(@PathVariable("id") Long wcId, @RequestBody WcEntity wc) {
        try {
            wc.setWcId(wcId);
            masterService.updateWc(wc);
            return new ResponseEntity<>(wc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


 // Delete Wc REST API
    @DeleteMapping("/deleteWc/{id}")
    public ResponseEntity<String> deleteWc(@PathVariable("id") Long wcId){
        masterService.deleteWc(wcId);
        return new ResponseEntity<>("WC successfully deleted!", HttpStatus.OK);
    }
    // ------------------------wc end----------------------
//-----------------------mcc start-------------------------
    // Get All Mcc REST API
    @GetMapping("/getAllMcc")
    public ResponseEntity<?> getAllMcc() {
        return new ResponseEntity<>(masterService.getAllMcc(), HttpStatus.OK);
    }

    // Add Mcc REST API
    @PostMapping("/addMcc")
    public ResponseEntity<MccEntity> addMcc(@RequestBody MccEntity mcc) {
        try {
            masterService.addMcc(mcc);
            return new ResponseEntity<>(mcc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Get By Mcc  REST API
    @GetMapping("/getMccById/{id}")
    public ResponseEntity<?> getMccById(@PathVariable("id") long mccId) {
        Optional<?> mccData = masterService.getMccById1(mccId);
        if (mccData.isPresent()) {
            return new ResponseEntity<>(mccData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

 // Update Mcc REST API
    @PutMapping("/updateMcc/{id}")
    public ResponseEntity<MccEntity> updateMcc(@PathVariable("id") Long mccId, @RequestBody MccEntity mcc) {
        try {
            mcc.setMccId(mccId);
            masterService.updatemcc(mcc);
            return new ResponseEntity<>(mcc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



 // Delete Mcc REST API
    @DeleteMapping("/deleteMcc/{id}")
    public ResponseEntity<String> deleteMcc(@PathVariable("id") Long mccId){
        masterService.deleteUser(mccId);
        return new ResponseEntity<>("mcc successfully deleted!", HttpStatus.OK);
    }
    //---------------mcc end---------------------- 
    
    //--------------------------route start-------------------------------
    // Get All Route REST API
    @GetMapping("/getAllRoute")
    public ResponseEntity<?> getAllRoute() {
        return new ResponseEntity<>(masterService.getAllRoute(), HttpStatus.OK);
    }
    // Add Route REST API
    @PostMapping("/addRoute")
    public ResponseEntity<RouteEntity> addRoute(@RequestBody RouteEntity route) {
        try {
            masterService.addRouteEntity(route);
            return new ResponseEntity<>(route, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



 // Get By Route  REST API
    @GetMapping("/getRouteById/{id}")
    public ResponseEntity<?> getRouteById1(@PathVariable("id") long routeId) {
        Optional<?> routeData = masterService.getMccById1(routeId);
        if (routeData.isPresent()) {
            return new ResponseEntity<>(routeData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


 // Update Route REST API
    @PutMapping("/updateRoute/{id}")
    public ResponseEntity<RouteEntity> updateRoute(@PathVariable("id") Long routeId, @RequestBody RouteEntity route) {
        try {
            route.setRouteId(routeId);
            masterService.updateRoute(route);
            return new ResponseEntity<>(route, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



 // Delete Route REST API
    @DeleteMapping("/deleteRoute/{id}")
    public ResponseEntity<String> deleteRoute(@PathVariable("id") Long routeId){
        masterService.deleteUser(routeId);
        return new ResponseEntity<>("route successfully deleted!", HttpStatus.OK);
    }
    //----------------------------route end----------------------------------

    //---------------------------Goods start---------------------------------
    // Get All Goods REST API
    @GetMapping("/getAllGoods")
    public ResponseEntity<?> getAllGoods() {
        return new ResponseEntity<>(masterService.getAllGoods(), HttpStatus.OK);
    }
    // Add Goods REST API
    @PostMapping("/addGoods")
    public ResponseEntity<GoodsEntity> addGoods(@RequestBody GoodsEntity goods) {
        try {
            masterService.addGoods(goods);
            return new ResponseEntity<>(goods, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



 // Get By Goods  REST API
    @GetMapping("/getGoodsById/{id}")
    public ResponseEntity<?> getGoodsById(@PathVariable("id") long goodsId) {
        Optional<?> goodsData = masterService.getGoodsById(goodsId);
        if (goodsData.isPresent()) {
            return new ResponseEntity<>(goodsData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


 // Update Goods REST API
    @PutMapping("/updateGoods/{id}")
    public ResponseEntity<GoodsEntity> updateGoods(@PathVariable("id") Long goodsId, @RequestBody GoodsEntity goods) {
        try {
            goods.setGoodsId(goodsId);
            masterService.updateGoods(goods);
            return new ResponseEntity<>(goods, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



 // Delete Goods REST API
    @DeleteMapping("/deleteGoods/{id}")
    public ResponseEntity<String> deleteGoods(@PathVariable("id") Long goodsId){
        masterService.deleteUser(goodsId);
        return new ResponseEntity<>("goods successfully deleted!", HttpStatus.OK);
    }
    
    
    //-----------------------------Goods end-----------------------------------
    
    //-------------------------------Goodssub start----------------------------
    // Get All Goodssub REST API
    @GetMapping("/getAllGoodssub")
    public ResponseEntity<?> getAllGoodssub() {
        return new ResponseEntity<>(masterService.getAllGoodssub(), HttpStatus.OK);
    }
    // Add Goodssub REST API
    @PostMapping("/addGoodssub")
    public ResponseEntity<GoodssubEntity> addGoodssub(@RequestBody GoodssubEntity goodssub) {
        try {
            masterService.addGoodssub(goodssub);
            return new ResponseEntity<>(goodssub, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



 // Get By Goodssub  REST API
    @GetMapping("/getGoodssubById/{id}")
    public ResponseEntity<?> getGoodssubById(@PathVariable("id") long goodssubId) {
        Optional<?> goodssubData = masterService.getGoodssubById(goodssubId);
        if (goodssubData.isPresent()) {
            return new ResponseEntity<>(goodssubData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


 // Update Goodssub REST API
    @PutMapping("/updateGoodssub/{id}")
    public ResponseEntity<GoodssubEntity> updateGoodssub(@PathVariable("id") Long goodssubId, @RequestBody GoodssubEntity goodssub) {
        try {
            goodssub.setGoodssubId(goodssubId);
            masterService.updateGoodssub(goodssub);
            return new ResponseEntity<>(goodssub, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



 // Delete Goods REST API
    @DeleteMapping("/deleteGoodssub/{id}")
    public ResponseEntity<String> deleteGoodssub(@PathVariable("id") Long goodssubId){
        masterService.deleteUser(goodssubId);
        return new ResponseEntity<>("goodssub successfully deleted!", HttpStatus.OK);
    }
    
    //--------------------------------Goodssub end---------------------------------
}    


