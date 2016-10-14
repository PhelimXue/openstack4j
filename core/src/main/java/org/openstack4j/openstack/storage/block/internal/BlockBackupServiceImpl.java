package org.openstack4j.openstack.storage.block.internal;

import java.util.List;

import org.openstack4j.api.storage.BlockBackupService;
import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.storage.block.domain.CinderVolumeBackup;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockBackupServiceImpl extends BaseBlockStorageServices implements BlockBackupService{

	@Override
	public List<? extends Backup> list() {
		return get(Backups.class, uri("/backups/detail")).execute().getList();
	}

	public static class Backups extends ListResult<CinderVolumeBackup> {

		private static final long serialVersionUID = 1L;
		
		@JsonProperty("backups")
		private List<CinderVolumeBackup> backups;
		
		@Override
		protected List<CinderVolumeBackup> value() {
			return backups;
		}
	}
}
