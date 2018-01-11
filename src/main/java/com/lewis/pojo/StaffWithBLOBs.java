package com.lewis.pojo;

public class StaffWithBLOBs extends Staff {
	private String experience;

	private String notes;

	private String relationship;

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience == null ? null : experience.trim();
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes == null ? null : notes.trim();
	}

}