
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

@Entity(name = "bmc_mcc_master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MccEntity  extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5148387915578576872L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="mcc_id")
	private long mccId;

	@ManyToOne
	@JoinColumn(name = "fk_zone_id", referencedColumnName = "zone_id")
	private ZoneEntity zone;

	@ManyToOne
	@JoinColumn(name = "fk_wc_id", referencedColumnName = "wc_id")
	private WcEntity wc;

	@Column(name="mcc_name" , nullable = false, unique = true)
	private String mccName;

	@Column(name="mcc_desc")
	private String mccDesc;
	@Column(name = "status")
	private boolean status = true;

	@Override
	public String toString() {
		return "MccEntity [mccId=" + mccId + ", mccName="
				+ mccName + ", mccDesc=" + mccDesc + ", status=" + status + "]";
	}
}