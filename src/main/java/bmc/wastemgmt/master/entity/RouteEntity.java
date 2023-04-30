package bmc.wastemgmt.master.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "bmc_route_master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RouteEntity  extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2089910273609890220L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="route_id")
	private long routeId;

	@ManyToOne
	@JoinColumn(name = "fk_zone_id", referencedColumnName = "zone_id")
	private ZoneEntity zone;

	@ManyToOne
	@JoinColumn(name = "fk_wc_id", referencedColumnName = "wc_id")
	private WcEntity wc;
	
	@Column(name="route_name" , nullable = false, unique = true)
	private String routeName;

	@Column(name="route_desc")
	private String routeDesc;
	@Column(name = "status")
	private boolean status = true;
	@Override
	public String toString() {
		return "RouteEntity [routeId=" + routeId +
				", routeName=" + routeName +
				",status ="+ status +
				", routeDesc=" + routeDesc + "]";
	}
}

