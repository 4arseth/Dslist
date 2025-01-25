package com.project1.dslist.dto;

import com.project1.dslist.entities.Game;
import com.project1.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getIgmUrl();
		shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection projection) {
		super();
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
	
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
