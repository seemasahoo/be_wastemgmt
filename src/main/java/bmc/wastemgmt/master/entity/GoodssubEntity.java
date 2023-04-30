package bmc.wastemgmt.master.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "bbmc_goods_sub_master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodssubEntity extends BaseEntity{/**
	 * 
	 */
	private static final long serialVersionUID = 1496703776978202370L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "goods_sub_id")
	private long goodssubId;

	@ManyToOne
	@JoinColumn(name = "fk_goods_id", referencedColumnName = "goods_id")
	private GoodsEntity goods;
	
	@Column(name = "sub_goods_name", nullable = false, unique = true)
	private String subgoodsName;

	@Column(name = "sub_goods_per_kg")
	private String subGoodsPerKg;
	
	@Column(name = "sub_goods_desc")
	private String subGoodsDesc;

	@Override
	public String toString() {
		return "GoodssubEntity [goodssubId=" + goodssubId + ", goods=" + goods + ", subgoodsName=" + subgoodsName
				+ ", subGoodsPerKg=" + subGoodsPerKg + ", subGoodsDesc=" + subGoodsDesc + "]";
	}

	public Object getGoodssubName() {
		// TODO Auto-generated method stub
		return null;
	}

}
