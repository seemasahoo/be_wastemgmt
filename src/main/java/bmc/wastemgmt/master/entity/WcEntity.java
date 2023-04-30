package bmc.wastemgmt.master.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "bmc_wc_master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WcEntity extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1327899148613518778L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wc_id")
	private long wcId;

	//@ManyToOne
	//@JoinColumn(name = "fk_zone_id", referencedColumnName = "zone_id")
	//private ZoneEntity zone;

	//	@OneToMany
	//	@JoinColumn(name = "fk_wc_id", referencedColumnName = "wc_id")
	//	private Set<MccEntity> listOfMcc;
	//	
	//	@OneToMany
	//	@JoinColumn(name = "fk_wc_id", referencedColumnName = "wc_id")
	//	private Set<RouteEntity> listOfRoute;
	//	//
	@Column(name = "wc_name", nullable = false, unique = true)
	private String wcName;

	@Column(name = "wc_desc")
	private String wcDesc;

	@Column(name = "status")
	private boolean status = true;


	@Override
	public String toString() {
		return "WcEntity [wcId=" + wcId + ", wcName=" + wcName + ", wcDesc=" + wcDesc + ", status=" + status + "]";
	}

}
