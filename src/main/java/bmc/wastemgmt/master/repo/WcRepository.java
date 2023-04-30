package bmc.wastemgmt.master.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import bmc.wastemgmt.master.entity.WcEntity;

public interface WcRepository extends JpaRepository <WcEntity,Long>{

}
