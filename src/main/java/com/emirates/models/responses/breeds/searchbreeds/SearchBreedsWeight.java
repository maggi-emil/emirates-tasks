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

public class SearchBreedsWeight {

	@JsonProperty("metric")
	private String metric;

	@JsonProperty("imperial")
	private String imperial;

	public String getMetric(){
		return metric;
	}

	public String getImperial(){
		return imperial;
	}
}