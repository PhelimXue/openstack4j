package org.openstack4j.model.storage.block.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.storage.block.backup.Backup;

/**
 * An OpenStack Volume Backup
 * 
 * @author Phelim Xue
 */
public interface BackupBuilder extends Builder<BackupBuilder, Backup>{

	BackupBuilder status(String status);
	BackupBuilder objectCount(int objectCount);
	BackupBuilder container(String container);
	BackupBuilder description(String description);
	BackupBuilder availabilityZone(String availabilityZone);
	BackupBuilder createdAt(String createdAt);
	BackupBuilder updatedAt(String updatedAt);
	BackupBuilder name(String name);
	BackupBuilder hasDependentBackups(boolean hasDependentBackups);
	BackupBuilder volumeId(String volumeId);
	BackupBuilder failReason(String failReason);
	BackupBuilder size(int size);
	BackupBuilder id(String id);
	BackupBuilder incremental(boolean incremental);
}
