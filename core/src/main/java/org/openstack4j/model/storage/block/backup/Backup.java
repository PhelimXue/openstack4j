package org.openstack4j.model.storage.block.backup;

import java.util.List;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.storage.block.builder.BackupBuilder;

/**
 * An OpenStack Volume Backup
 * 
 * @author Phelim Xue
 */
public interface Backup extends ModelEntity, Buildable<BackupBuilder>{

	String getStatus();
	int getObjectCount();
	String getContainer();
	String getDescription();
	// List<E> getLinks();
	String getAvailabilityZone();
	String getCreatedAt();
	String getUpdatedAt();
	String getName();
	boolean isHasDependentBackups();
	String getVolumeId();
	String getFailReason();
	int getSize();
	// miss backup object
	String getId();
	boolean isIncremental();
}
