package org.openstack4j.openstack.storage.block.domain;

import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.model.storage.block.builder.BackupBuilder;
import org.openstack4j.model.storage.block.builder.VolumeBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("backup")
public class CinderVolumeBackup implements Backup{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("status")
	private String status;
	@JsonProperty("object_count")
	private Integer objectCount;
	@JsonProperty("container")
	private String container;
	@JsonProperty("description")
	private String description;
	@JsonProperty("availability_zone")
	private String availabilityZone;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("name")
	private String name;
	@JsonProperty("has_dependent_backups")
	private Boolean hasDependentBackups;
	@JsonProperty("volume_id")
	private String volumeId;
	@JsonProperty("fail_reason")
	private String failReason;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("id")
	private String id;
	@JsonProperty("incremental")
	private Boolean incremental;
	
	@Override
	public BackupBuilder toBuilder() {
		return new ConcreteBackupBuilder(this);
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public int getObjectCount() {
		return objectCount;
	}

	@Override
	public String getContainer() {
		return container;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	@Override
	public String getCreatedAt() {
		return createdAt;
	}

	@Override
	public String getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isHasDependentBackups() {
		return hasDependentBackups;
	}

	@Override
	public String getVolumeId() {
		return volumeId;
	}

	@Override
	public String getFailReason() {
		return failReason;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public boolean isIncremental() {
		return incremental;
	}

	public static class ConcreteBackupBuilder implements BackupBuilder {

		private CinderVolumeBackup m;
		ConcreteBackupBuilder(){
			this(new CinderVolumeBackup());
		}
		ConcreteBackupBuilder(CinderVolumeBackup backup){
			this.m = m;
		}
		
		@Override
		public Backup build() {
			return m;
		}

		@Override
		public BackupBuilder from(Backup in) {
			m = (CinderVolumeBackup) in;
			return this;
		}

		@Override
		public BackupBuilder status(String status) {
			m.status = status;
			return this;
		}

		@Override
		public BackupBuilder objectCount(int objectCount) {
			m.objectCount = objectCount;
			return this;
		}

		@Override
		public BackupBuilder container(String container) {
			m.container = container;
			return this;
		}

		@Override
		public BackupBuilder description(String description) {
			m.description = description;
			return this;
		}

		@Override
		public BackupBuilder availabilityZone(String availabilityZone) {
			m.availabilityZone = availabilityZone;
			return this;
		}

		@Override
		public BackupBuilder createdAt(String createdAt) {
			m.createdAt = createdAt;
			return this;
		}

		@Override
		public BackupBuilder updatedAt(String updatedAt) {
			m.updatedAt = updatedAt;
			return this;
		}

		@Override
		public BackupBuilder name(String name) {
			m.name = name;
			return this;
		}

		@Override
		public BackupBuilder hasDependentBackups(boolean hasDependentBackups) {
			m.hasDependentBackups = hasDependentBackups;
			return this;
		}

		@Override
		public BackupBuilder volumeId(String volumeId) {
			m.volumeId = volumeId;
			return this;
		}

		@Override
		public BackupBuilder failReason(String failReason) {
			m.failReason = failReason;
			return this;
		}

		@Override
		public BackupBuilder size(int size) {
			m.size = size;
			return this;
		}

		@Override
		public BackupBuilder id(String id) {
			m.id = id;
			return this;
		}

		@Override
		public BackupBuilder incremental(boolean incremental) {
			m.incremental = incremental;
			return this;
		}
		
	}
}

