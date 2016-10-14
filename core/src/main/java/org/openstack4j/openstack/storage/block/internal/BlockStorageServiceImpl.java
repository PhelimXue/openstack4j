package org.openstack4j.openstack.storage.block.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.storage.BlockBackupService;
import org.openstack4j.api.storage.BlockQuotaSetService;
import org.openstack4j.api.storage.BlockStorageService;
import org.openstack4j.api.storage.BlockVolumeService;
import org.openstack4j.api.storage.BlockVolumeSnapshotService;
import org.openstack4j.api.storage.CinderZoneService;
import org.openstack4j.model.storage.block.BlockLimits;
import org.openstack4j.openstack.storage.block.domain.CinderBlockLimits;

/**
 * Block Storage (Cinder) Service Operation implementation
 * 
 * @author Jeremy Unruh
 */
public class BlockStorageServiceImpl extends BaseBlockStorageServices implements BlockStorageService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeService volumes() {
		return Apis.get(BlockVolumeService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeSnapshotService snapshots() {
		return Apis.get(BlockVolumeSnapshotService.class);
	}

	/**
	 * {@inheritDoc}
	 */
    @Override
    public BlockLimits getLimits() {
        return get(CinderBlockLimits.class, "/limits").execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockQuotaSetService quotaSets() {
        return Apis.get(BlockQuotaSetService.class);
    }

    @Override
    public CinderZoneService zones()
    {
       return Apis.get(CinderZoneService.class); 
    }

	@Override
	public BlockBackupService backups() {
		return Apis.get(BlockBackupService.class); 
	}

}
