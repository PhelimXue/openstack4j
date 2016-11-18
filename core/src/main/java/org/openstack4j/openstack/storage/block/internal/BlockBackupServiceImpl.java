package org.openstack4j.openstack.storage.block.internal;

import java.util.List;

import org.openstack4j.api.storage.BlockBackupService;
import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.openstack.storage.block.domain.CinderVolumeBackup.Backups;

public class BlockBackupServiceImpl extends BaseBlockStorageServices implements BlockBackupService{

	@Override
	public List<? extends Backup> list() {
		return get(Backups.class, uri("/backups/detail")).execute().getList();
	}

}
