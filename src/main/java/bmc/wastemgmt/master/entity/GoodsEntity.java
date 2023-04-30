package bmc.wastemgmt.master.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "bmc_goods_master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodsEntity  extends BaseEntity{/**
	 * 
	 */
	private static final long serialVersionUID = 5753650524074243903L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "goods_id")
	private long goodsId;

//	@OneToMany
	//	@JoinColumn(name = "fk_goods_id", referencedColumnName = "goods_id")
	//	private Set<GoodssubEntity> listOfGoodssub;
	
	@Column(name = "goods_name", nullable = false, unique = true)
	private String goodsName;

	@Column(name = "goods_per_kg")
	private String goodsPerKg;
	
	@Column(name = "goods_desc")
	private String goodsDesc;

	@Override
	public String toString() {
		return "GoodsEntity [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPerKg=" + goodsPerKg
				+ ", goodsDesc=" + goodsDesc + "]";
	}

	public void setRouteName(String goodsName2) {
		// TODO Auto-generated method stub
		
	}
	
}
