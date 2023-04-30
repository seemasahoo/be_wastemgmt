package bmc.wastemgmt.master.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import bmc.wastemgmt.master.entity.RouteEntity;

public interface RouteRepository extends  JpaRepository<RouteEntity,Long> {

}
