package org.openstack4j.openstack.storage.block.domain;

import java.util.List;

import org.openstack4j.model.storage.block.backup.Backup;
import org.openstack4j.model.storage.block.builder.BackupBuilder;
import org.openstack4j.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonRootName("backup")
public class CinderVolumeBackup implements Backup{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("status")
	private Status status;
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
	@JsonInclude(Include.NON_DEFAULT)
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
	public Status getStatus() {
		return status;
	}
	@Override
	public Integer getObjectCount() {
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
	public Boolean isHasDependentBackups() {
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
	public Integer getSize() {
		return size;
	}
	@Override
	public String getId() {
		return id;
	}
	@Override
	public Boolean isIncremental() {
		return incremental;
	}

	/*
	 * 因應多筆回應的設計
	 */
	public static class Backups extends ListResult<CinderVolumeBackup> {

		private static final long serialVersionUID = 1L;
		
		@JsonProperty("backups")
		private List<CinderVolumeBackup> backups;
		
		@Override
		protected List<CinderVolumeBackup> value() {
			return backups;
		}
	}
	
	/*
	 * 該 Model 使用的 Builder
	 */
	public static class ConcreteBackupBuilder implements BackupBuilder {

		private CinderVolumeBackup m;
		ConcreteBackupBuilder(){
			this(new CinderVolumeBackup());
		}
		
		ConcreteBackupBuilder(CinderVolumeBackup m){
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
		public BackupBuilder status(Status status) {
			m.status = status;
			return this;
		}

		@Override
		public BackupBuilder objectCount(Integer objectCount) {
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
		public BackupBuilder hasDependentBackups(Boolean hasDependentBackups) {
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
		public BackupBuilder size(Integer size) {
			m.size = size;
			return this;
		}

		@Override
		public BackupBuilder id(String id) {
			m.id = id;
			return this;
		}

		@Override
		public BackupBuilder incremental(Boolean incremental) {
			m.incremental = incremental;
			return this;
		}
		
	}
}

