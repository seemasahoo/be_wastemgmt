package bmc.wastemgmt.master.service;


import bmc.wastemgmt.master.entity.GoodsEntity;
import bmc.wastemgmt.master.entity.GoodssubEntity;
import bmc.wastemgmt.master.entity.MccEntity;
import bmc.wastemgmt.master.entity.RouteEntity;
import bmc.wastemgmt.master.entity.WcEntity;
import bmc.wastemgmt.master.entity.ZoneEntity;
import bmc.wastemgmt.master.repo.GoodsRepository;
import bmc.wastemgmt.master.repo.GoodssubRepository;
import bmc.wastemgmt.master.repo.MccRepository;
import bmc.wastemgmt.master.repo.RouteRepository;
import bmc.wastemgmt.master.repo.WcRepository;
import bmc.wastemgmt.master.repo.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MasterService {

	@Autowired
	private ZoneRepository zoneRepository;
	
	@Autowired
	private WcRepository wcRepository;
	
	@Autowired
	private MccRepository mccRepository;
	
	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private GoodsRepository goodsRepository;
	@Autowired
	private GoodssubRepository goodssubRepository;
	
	public List<?> getAllZone(){
		return zoneRepository.findAll();
	}

	public Optional<?> getZoneById(long id) {
		return zoneRepository.findById(id);
	}

	public void addZone(ZoneEntity zone) {
		ZoneEntity.builder()
		.zoneName(zone.getZoneName())
		.zoneDesc(zone.getZoneDesc());
		zoneRepository
		.save(zone);
	}

	public ZoneEntity updateZone(ZoneEntity zone) {
		ZoneEntity existingZone = zoneRepository.findById(zone.getZoneId()).get();
		existingZone.setZoneName(zone.getZoneName());
		existingZone.setZoneDesc(zone.getZoneDesc());
		ZoneEntity updatedZone = zoneRepository.save(existingZone);
		return updatedZone;
	}

	public void deleteUser(Long zoneId) {
		zoneRepository.deleteById(zoneId);
	}
	public Optional<?> getZoneById11(long zoneId) {
		// TODO Auto-generated method stub
		return null;
	}

	// ***********************   wc start  **********************//

	
	public List<?> getAllWc(){
		return wcRepository.findAll();
	}

	public Optional<?> getWcById(long id) {
		return wcRepository.findById(id);
	}

	public void addWc(WcEntity wc) {
		WcEntity newWc = WcEntity.builder()
				.wcName(wc.getWcName())
				.wcDesc(wc.getWcDesc())
				.build();
		wcRepository.save(newWc);
	}
	public <wcRepository> WcEntity updateWc(WcEntity wc) {
		WcEntity existingWc = wcRepository.findById(wc.getWcId()).get();
		existingWc.setWcName(wc.getWcName());
		existingWc.setWcDesc(wc.getWcDesc());
		WcEntity updatedWc = wcRepository.save(existingWc);
		return updatedWc;
	}

	public void deleteWc(Long wcId) {
		wcRepository.deleteById(wcId);
	}
	public Optional<?> getAllWcListByZoneId(long zoneId) {
		// TODO Auto-generated method stub
		return null;
	}
	//----------------------- wc end-------------------------
	//----------------------mcc start------------------------
	

	public List<?> getAllMcc(){
		return mccRepository.findAll();
	}

	public Optional<?> getMccById1(long id) {
		return mccRepository.findById(id);
	}

	public void addMcc(MccEntity mcc) {
		MccEntity newMcc = MccEntity.builder()
				.mccName(mcc.getMccName())
				.mccDesc(mcc.getMccDesc())
				.build();
		mccRepository.save(newMcc);
	}

	public <mccRepository> MccEntity updateMcc(MccEntity mcc) {
		MccEntity existingMcc = mccRepository.findById(mcc.getMccId()).get();
		existingMcc.setMccName(mcc.getMccName());
		existingMcc.setMccDesc(mcc.getMccDesc());
		MccEntity updatedMcc = mccRepository.save(existingMcc);
		return updatedMcc;
	}

	public void deleteMcc1(Long mccId) {
		mccRepository.deleteById(mccId);   
	}

	public Optional<?> getMccById111(long mccId) {
		return mccRepository.findById(mccId);
	}

	public void updatemcc(MccEntity mcc) {
		// TODO: Implement this method
	}
	//------------------mcc end--------------------------------

	//---------------------route start---------------------------------
	

	public List<?> getAllRoute(){
		return routeRepository.findAll();
	}

	public Optional<RouteEntity> getRouteById111(long routeId) {
		return routeRepository.findById(routeId);
	}



	public void addRout(RouteEntity route) {
		RouteEntity newRoute = RouteEntity.builder()
				.routeName(route.getRouteName())
				.routeDesc(route.getRouteDesc())
				.build();
		routeRepository.save(newRoute);
	}
	public <routeRepository> RouteEntity updateRoute(RouteEntity route) {
		RouteEntity existingRoute = routeRepository.findById(route.getRouteId()).get();
		existingRoute.setRouteName(route.getRouteName());
		existingRoute.setRouteDesc(route.getRouteDesc());
		RouteEntity updatedRoute = routeRepository.save(existingRoute);
		return updatedRoute;
	}


	public void deleteRoute(Long routeId) {
		routeRepository.deleteById(routeId);
	}

	public void addRouteEntity(RouteEntity route) {
		routeRepository.save(route);
		// Code to add route entity
	}

	//--------------------route end---------------------------------------

	//---------------------goods start-----------------------------------
	public List<?> getAllGoods(){
		return goodsRepository.findAll();
	}

	public Optional<GoodsEntity> getGoodsById(long goodsId) {
		return goodsRepository.findById(goodsId);
	}



	public void addGoods(GoodsEntity goods) {
		GoodsEntity newGoods = GoodsEntity.builder()
				.goodsName(goods.getGoodsName())
				.goodsPerKg(goods.getGoodsPerKg())
				.goodsDesc(goods.getGoodsDesc())
				.build();
		goodsRepository.save(newGoods);
	}
	public <goodsRepository> GoodsEntity updateGoods(GoodsEntity goods) {
		GoodsEntity existingGoods = goodsRepository.findById(goods.getGoodsId()).get();
		existingGoods.setGoodsName(goods.getGoodsName());
		existingGoods.setGoodsPerKg(goods.getGoodsPerKg());
		existingGoods.setGoodsDesc(goods.getGoodsDesc());
		GoodsEntity updatedGoods = goodsRepository.save(existingGoods);
		return updatedGoods;
	}


	public void deleteGoods(Long goodsId) {
		goodsRepository.deleteById(goodsId);
	}
	
	//------------------------goods end------------------------------
	//-----------------------goodssub stat----------------------------
	public List<?> getAllGoodssub(){
		return routeRepository.findAll();
	}

	public Optional<GoodssubEntity> getGoodssubById(long goodssubId) {
		return goodssubRepository.findById(goodssubId);
	}



	public void addGoodssub(GoodssubEntity goodssub) {
//		GoodssubEntity newGoodssub = new GoodssubEntity();
//				GoodssubEntity.builder()
//				newGoodssub.goodssubName(goodssub.getGoodssubName())
//				.subGoodsPerKg(goodssub.getSubGoodsPerKg())
//				.subGoodsDesc(goodssub.getSubGoodsDesc())
//				.build();
		goodssubRepository.save(goodssub);
	}
	public  GoodssubEntity updateGoodssub(GoodssubEntity goodssub) {
		GoodssubEntity existingGoodssub = goodssubRepository.findById(goodssub.getGoodssubId()).get();
		existingGoodssub.setSubgoodsName(goodssub.getSubgoodsName());
		existingGoodssub.setSubGoodsPerKg(goodssub.getSubGoodsPerKg());
		existingGoodssub.setSubGoodsDesc(goodssub.getSubGoodsDesc());
		GoodssubEntity updatedGoodssub = goodssubRepository.save(existingGoodssub);
		return updatedGoodssub;
	}


	public void deleteGoodssub(Long goodssubId) {
		goodssubRepository.deleteById(goodssubId);
	}
	//----------------------goodssub end----------------------------
}
