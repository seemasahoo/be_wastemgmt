package bmc.wastemgmt.master.repo;

import bmc.wastemgmt.master.entity.MccEntity;
import bmc.wastemgmt.master.entity.WcEntity;
import bmc.wastemgmt.master.entity.ZoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository extends JpaRepository<ZoneEntity,Long>{

	void save(WcEntity wc);

	void save(MccEntity mcc);
}
