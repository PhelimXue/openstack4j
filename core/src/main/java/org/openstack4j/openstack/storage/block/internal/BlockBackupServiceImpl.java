package org.openstack4j.openstack.storage.block.internal;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

import org.openstack4j.api.Builders;
import org.openstack4j.api.storage.BlockBackupService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.model.storage.block.backup.BackupRestore;
import org.openstack4j.openstack.storage.block.domain.CinderVolume;
import org.openstack4j.openstack.storage.block.domain.CinderBackup;
import org.openstack4j.openstack.storage.block.domain.CinderBackupRestore;
import org.openstack4j.openstack.storage.block.domain.CinderBackup.Backups;

public class BlockBackupServiceImpl extends BaseBlockStorageServices implements BlockBackupService{

	@Override
	public List<? extends Backup> list() {
		return get(Backups.class, uri("/backups/detail")).execute().getList();
	}

	@Override
	public Backup get(String backupId) {
		checkNotNull(backupId);
		return get(CinderBackup.class, uri("/backups/%s", backupId)).execute();
	}

	@Override
	public ActionResponse delete(String backupId) {
		checkNotNull(backupId);
        return deleteWithResponse(uri("/backups/%s", backupId)).execute();
	}

	@Override
	public Backup create(Backup backup) {
		checkNotNull(backup);
		return post(CinderBackup.class, uri("/backups")).entity(backup).execute();
	}
	
	@Override
	public BackupRestore restore(String backupId, String volumeId) {
		checkNotNull(backupId);
		return post(CinderBackupRestore.class, uri("/backups/%s/restore", backupId))
				.entity(Builders.backupRestore().volumeId(volumeId).build()).execute();
	}

}
