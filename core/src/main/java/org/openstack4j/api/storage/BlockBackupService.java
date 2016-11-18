package org.openstack4j.api.storage;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.storage.block.backup.Backup;

public interface BlockBackupService extends RestService{

	List<? extends Backup> list();
	Backup get(String backupId);
}
