package org.openstack4j.api.storage;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.model.storage.block.backup.BackupRestore;

public interface BlockBackupService extends RestService{

	List<? extends Backup> list();
	Backup get(String backupId);
	ActionResponse delete(String backupId);
	Backup create(Backup backup);
	BackupRestore restore(String backupId, String volumeId);
}
