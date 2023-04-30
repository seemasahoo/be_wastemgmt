package bmc.wastemgmt.master.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import bmc.wastemgmt.master.entity.GoodsEntity;

public interface GoodsRepository  extends JpaRepository<GoodsEntity,Long>{

}
