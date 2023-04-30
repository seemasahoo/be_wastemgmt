package bmc.wastemgmt.master.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import bmc.wastemgmt.master.entity.MccEntity;

public interface MccRepository extends JpaRepository <MccEntity,Long> {

}
