package org.openstack4j.model.storage.block.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.model.storage.block.backup.Backup.Status;

/**
 * An OpenStack Volume Backup
 * 
 * @author Phelim Xue
 */
public interface BackupBuilder extends Builder<BackupBuilder, Backup>{

	BackupBuilder status(Status status);
	BackupBuilder objectCount(Integer objectCount);
	BackupBuilder container(String container);
	BackupBuilder description(String description);
	BackupBuilder availabilityZone(String availabilityZone);
	BackupBuilder createdAt(String createdAt);
	BackupBuilder updatedAt(String updatedAt);
	BackupBuilder name(String name);
	BackupBuilder hasDependentBackups(Boolean hasDependentBackups);
	BackupBuilder volumeId(String volumeId);
	BackupBuilder failReason(String failReason);
	BackupBuilder size(Integer size);
	BackupBuilder id(String id);
	BackupBuilder incremental(Boolean incremental);
}
