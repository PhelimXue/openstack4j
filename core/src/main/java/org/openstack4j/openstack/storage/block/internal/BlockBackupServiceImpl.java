package org.openstack4j.openstack.storage.block.internal;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

import org.openstack4j.api.storage.BlockBackupService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.openstack.storage.block.domain.CinderVolumeBackup;
import org.openstack4j.openstack.storage.block.domain.CinderVolumeBackup.Backups;

public class BlockBackupServiceImpl extends BaseBlockStorageServices implements BlockBackupService{

	@Override
	public List<? extends Backup> list() {
		return get(Backups.class, uri("/backups/detail")).execute().getList();
	}

	@Override
	public Backup get(String backupId) {
		checkNotNull(backupId);
		return get(CinderVolumeBackup.class, uri("/backups/%s", backupId)).execute();
	}

	@Override
	public ActionResponse delete(String backupId) {
		checkNotNull(backupId);
        return deleteWithResponse(uri("/backups/%s", backupId)).execute();
	}

}
