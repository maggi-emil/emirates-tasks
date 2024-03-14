package com.emirates.models.responses.breeds.searchbreeds;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@With
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class SearchBreedsImage {

	@JsonProperty("width")
	private int width;

	@JsonProperty("id")
	private String id;

	@JsonProperty("url")
	private String url;

	@JsonProperty("height")
	private int height;

	public int getWidth(){
		return width;
	}

	public String getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}

	public int getHeight(){
		return height;
	}
}