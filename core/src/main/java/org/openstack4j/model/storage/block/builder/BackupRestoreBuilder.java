package org.openstack4j.model.storage.block.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.storage.block.backup.BackupRestore;

public interface BackupRestoreBuilder extends Builder<BackupRestoreBuilder, BackupRestore>{
	
	BackupRestoreBuilder name(String name);
	BackupRestoreBuilder volumeId(String volumeId);
	BackupRestoreBuilder backupId(String backupId);
}
