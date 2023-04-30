
package bmc.wastemgmt.master.entity;


import bmc.wastemgmt.master.constant.Constant;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.time.ZonedDateTime;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = -1281722596361773602L;

	@Column(name="created_by")
    private String createdBy;

    @Column(name="created_date")
    private ZonedDateTime createdDate;

    @Column(name="updated_by")
    private String updatedBy;

    @Column(name="updated_date")
    private ZonedDateTime updatedDate;


    @PrePersist
    public void setInsertedDefault(){
        if(this.createdDate == null){
            this.createdDate = ZonedDateTime.now();
            this.createdBy = Constant.system_user;
        }
    }

    @PreUpdate
    public void setUpdatedDefault(){
        if(this.updatedDate == null){
            this.updatedDate = ZonedDateTime.now();
            this.updatedBy = Constant.system_user;
        }
    }

}