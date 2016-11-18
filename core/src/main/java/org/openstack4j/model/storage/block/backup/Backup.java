package org.openstack4j.model.storage.block.backup;

import static com.google.common.base.Preconditions.checkNotNull;


import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.storage.block.builder.BackupBuilder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.CaseFormat;

/**
 * An OpenStack Volume Backup
 * 
 * @author Phelim Xue
 */
public interface Backup extends ModelEntity, Buildable<BackupBuilder>{
	
	/**
	 * The current Backup Status
	 *
	 */
	public enum Status {
		CREATING, AVAILABLE, DELETING, ERROE, RESTORING, ERROR_RESTORING, UNRECOGNIZED;

		@JsonValue
		public String value() {
			return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, name());
		}

		@Override
		public String toString() {
			return value();
		}

		@JsonCreator
		public static Status fromValue(String status) {
			try {
				return valueOf(CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_UNDERSCORE, checkNotNull(status, "status")));
			} catch (IllegalArgumentException e) {
				return UNRECOGNIZED;
			}
		}
	}

	Status getStatus();
	Integer getObjectCount();
	String getContainer();
	String getDescription();
	String getAvailabilityZone();
	String getCreatedAt();
	String getUpdatedAt();
	String getName();
	Boolean isHasDependentBackups();
	String getVolumeId();
	String getFailReason();
	Integer getSize();
	String getId();
	Boolean isIncremental();
}
