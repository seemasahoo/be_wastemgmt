package bmc.wastemgmt.master.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import bmc.wastemgmt.master.entity.GoodssubEntity;

public interface GoodssubRepository extends JpaRepository<GoodssubEntity,Long>{

	Optional<GoodssubEntity> findById(long goodssubId);

}
