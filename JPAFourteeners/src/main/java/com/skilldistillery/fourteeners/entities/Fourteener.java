package com.skilldistillery.fourteeners.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fourteener {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Integer altitude;
	@Column(name="mountain_range")
	private String mountainRange;
	@Column(name="park_forest")
	private String parkForest;
	@Column(name="number_of_routes")
	private Integer numOfRoutes;
	@Column(name="standard_difficulty")
	private String standardDifficulty;
	@Column(name="standard_distance")
	private Double standardDistance;
	@Column(name="standard_elev_gain")
	private Integer standardElevGain;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAltitude() {
		return altitude;
	}


	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}


	public String getMountainRange() {
		return mountainRange;
	}


	public void setMountainRange(String mountainRange) {
		this.mountainRange = mountainRange;
	}


	public String getParkForest() {
		return parkForest;
	}


	public void setParkForest(String parkForest) {
		this.parkForest = parkForest;
	}


	public Integer getNumOfRoutes() {
		return numOfRoutes;
	}


	public void setNumOfRoutes(Integer numOfRoutes) {
		this.numOfRoutes = numOfRoutes;
	}


	public String getStandardDifficulty() {
		return standardDifficulty;
	}


	public void setStandardDifficulty(String standardDifficulty) {
		this.standardDifficulty = standardDifficulty;
	}


	public Double getStandardDistance() {
		return standardDistance;
	}


	public void setStandardDistance(Double standardDistance) {
		this.standardDistance = standardDistance;
	}


	public Integer getStandardElevGain() {
		return standardElevGain;
	}


	public void setStandardElevGain(Integer standardElevGain) {
		this.standardElevGain = standardElevGain;
	}


	@Override
	public String toString() {
		return "Fourteener [id=" + id + ", name=" + name + ", altitude=" + altitude + ", mountainRange=" + mountainRange
				+ ", parkForest=" + parkForest + ", numOfRoutes=" + numOfRoutes + ", standardDifficulty="
				+ standardDifficulty + ", standardDistance=" + standardDistance + ", standardElevGain="
				+ standardElevGain;
	}


	@Override
	public int hashCode() {
		return Objects.hash(altitude, id, mountainRange, name, numOfRoutes, parkForest, standardDifficulty,
				standardDistance, standardElevGain);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fourteener other = (Fourteener) obj;
		return Objects.equals(altitude, other.altitude) && id == other.id
				&& Objects.equals(mountainRange, other.mountainRange) && Objects.equals(name, other.name)
				&& Objects.equals(numOfRoutes, other.numOfRoutes) && Objects.equals(parkForest, other.parkForest)
				&& Objects.equals(standardDifficulty, other.standardDifficulty)
				&& Objects.equals(standardDistance, other.standardDistance)
				&& Objects.equals(standardElevGain, other.standardElevGain);
	}
	
	
	

	
	
	

}
