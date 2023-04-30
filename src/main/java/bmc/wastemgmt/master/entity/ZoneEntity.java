package bmc.wastemgmt.master.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity(name = "bmc_zone_master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZoneEntity  extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1529819306153615268L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="zone_id")
	private long zoneId;

	//@OneToMany
	//@JoinColumn(name = "fk_zone_id", referencedColumnName = "zone_id")
	//private Set<WcEntity> listOfWc;

	//	@OneToMany
	//	@JoinColumn(name = "fk_zone_id", referencedColumnName = "zone_id")
	//	private Set<MccEntity> listOfMcc;


	//	@OneToMany
	//	@JoinColumn(name = "fk_zone_id", referencedColumnName = "zone_id")
	//	private Set<RouteEntity> listOfRoute;


	@Column(name="zone_name" , nullable = false, unique = true)
	private String zoneName;

	@Column(name="zone_desc")
	private String zoneDesc;

	@Column(name = "status")
	private boolean status = true;
	@Override
	public String toString() {
		return "ZoneEntity{" +
				"zoneId=" + zoneId +
				" ,status=" + status +
				", zoneName='" + zoneName + '\'' +
				", zoneDesc='" + zoneDesc + '\'' +
				'}';
	}
}
