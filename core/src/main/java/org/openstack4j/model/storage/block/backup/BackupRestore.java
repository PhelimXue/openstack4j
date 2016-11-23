package org.openstack4j.model.storage.block.backup;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.storage.block.builder.BackupRestoreBuilder;

public interface BackupRestore extends ModelEntity, Buildable<BackupRestoreBuilder>{

	String getName();
	String getVolumeId();
	String getBackupId();
}
