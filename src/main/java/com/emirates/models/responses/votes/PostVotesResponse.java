package com.emirates.models.responses.votes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostVotesResponse {

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("sub_id")
	private String subId;

	@JsonProperty("id")
	private int id;

	@JsonProperty("message")
	private String message;

	@JsonProperty("image_id")
	private String imageId;

	@JsonProperty("value")
	private int value;

	public String getCountryCode(){
		return countryCode;
	}

	public String getSubId(){
		return subId;
	}

	public int getId(){
		return id;
	}

	public String getMessage(){
		return message;
	}

	public String getImageId(){
		return imageId;
	}

	public int getValue(){
		return value;
	}
}