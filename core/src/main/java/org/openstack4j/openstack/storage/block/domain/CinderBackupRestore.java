package org.openstack4j.openstack.storage.block.domain;

import org.openstack4j.model.storage.block.backup.BackupRestore;
import org.openstack4j.model.storage.block.builder.BackupRestoreBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("restore")
public class CinderBackupRestore implements BackupRestore{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("name")
	String name;
	@JsonProperty("volume_id")
	String volumeId;
	@JsonProperty("backup_id")
	String backupId;
	
	@Override
	public BackupRestoreBuilder toBuilder() {
		return new ConcreteBackupRestroeBuilder(this);
	}
	
	public static BackupRestoreBuilder builder() {
		return new ConcreteBackupRestroeBuilder();
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getVolumeId() {
		return this.volumeId;
	}
	
	@Override
	public String getBackupId() {
		return this.backupId;
	}

	public static class ConcreteBackupRestroeBuilder implements BackupRestoreBuilder{
		private CinderBackupRestore m;
		public ConcreteBackupRestroeBuilder() {
			this(new CinderBackupRestore());
		}
		public ConcreteBackupRestroeBuilder(CinderBackupRestore m) {
			this.m = m;
		}
		
		@Override
		public BackupRestoreBuilder from(BackupRestore in) {
			m = (CinderBackupRestore) in;
			return this;
		}
		
		public BackupRestore build(){
			return m;
		}
		
		public ConcreteBackupRestroeBuilder name(String name){
			m.name = name;
			return this;
		}
		
		public ConcreteBackupRestroeBuilder volumeId(String volumeId){
			m.volumeId = volumeId;
			return this;
		}
		
		public ConcreteBackupRestroeBuilder backupId(String backupId){
			m.backupId = backupId;
			return this;
		}
	}

}
