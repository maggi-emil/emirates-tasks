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

public class SearchBreedsResponse {

	@JsonProperty("suppressed_tail")
	private int suppressedTail;

	@JsonProperty("wikipedia_url")
	private String wikipediaUrl;

	@JsonProperty("origin")
	private String origin;

	@JsonProperty("description")
	private String description;

	@JsonProperty("experimental")
	private int experimental;

	@JsonProperty("life_span")
	private String lifeSpan;

	@JsonProperty("cfa_url")
	private String cfaUrl;

	@JsonProperty("rare")
	private int rare;

	@JsonProperty("country_codes")
	private String countryCodes;

	@JsonProperty("lap")
	private int lap;

	@JsonProperty("id")
	private String id;

	@JsonProperty("short_legs")
	private int shortLegs;

	@JsonProperty("shedding_level")
	private int sheddingLevel;

	@JsonProperty("image")
	private SearchBreedsImage image;

	@JsonProperty("dog_friendly")
	private int dogFriendly;

	@JsonProperty("natural")
	private int natural;

	@JsonProperty("rex")
	private int rex;

	@JsonProperty("health_issues")
	private int healthIssues;

	@JsonProperty("hairless")
	private int hairless;

	@JsonProperty("weight")
	private SearchBreedsWeight weight;

	@JsonProperty("alt_names")
	private String altNames;

	@JsonProperty("adaptability")
	private int adaptability;

	@JsonProperty("vocalisation")
	private int vocalisation;

	@JsonProperty("intelligence")
	private int intelligence;

	@JsonProperty("social_needs")
	private int socialNeeds;

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("child_friendly")
	private int childFriendly;

	@JsonProperty("vcahospitals_url")
	private String vcahospitalsUrl;

	@JsonProperty("temperament")
	private String temperament;

	@JsonProperty("name")
	private String name;

	@JsonProperty("vetstreet_url")
	private String vetstreetUrl;

	@JsonProperty("grooming")
	private int grooming;

	@JsonProperty("hypoallergenic")
	private int hypoallergenic;

	@JsonProperty("indoor")
	private int indoor;

	@JsonProperty("energy_level")
	private int energyLevel;

	@JsonProperty("stranger_friendly")
	private int strangerFriendly;

	@JsonProperty("reference_image_id")
	private String referenceImageId;

	@JsonProperty("affection_level")
	private int affectionLevel;

	@JsonProperty("cat_friendly")
	private int catFriendly;

	@JsonProperty("bidability")
	private int bidability;

	public int getSuppressedTail(){
		return suppressedTail;
	}

	public String getWikipediaUrl(){
		return wikipediaUrl;
	}

	public String getOrigin(){
		return origin;
	}

	public String getDescription(){
		return description;
	}

	public int getExperimental(){
		return experimental;
	}

	public String getLifeSpan(){
		return lifeSpan;
	}

	public String getCfaUrl(){
		return cfaUrl;
	}

	public int getRare(){
		return rare;
	}

	public String getCountryCodes(){
		return countryCodes;
	}

	public int getLap(){
		return lap;
	}

	public String getId(){
		return id;
	}

	public int getShortLegs(){
		return shortLegs;
	}

	public int getSheddingLevel(){
		return sheddingLevel;
	}

	public SearchBreedsImage getImage(){
		return image;
	}

	public int getDogFriendly(){
		return dogFriendly;
	}

	public int getNatural(){
		return natural;
	}

	public int getRex(){
		return rex;
	}

	public int getHealthIssues(){
		return healthIssues;
	}

	public int getHairless(){
		return hairless;
	}

	public SearchBreedsWeight getWeight(){
		return weight;
	}

	public String getAltNames(){
		return altNames;
	}

	public int getAdaptability(){
		return adaptability;
	}

	public int getVocalisation(){
		return vocalisation;
	}

	public int getIntelligence(){
		return intelligence;
	}

	public int getSocialNeeds(){
		return socialNeeds;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public int getChildFriendly(){
		return childFriendly;
	}

	public String getVcahospitalsUrl(){
		return vcahospitalsUrl;
	}

	public String getTemperament(){
		return temperament;
	}

	public String getName(){
		return name;
	}

	public String getVetstreetUrl(){
		return vetstreetUrl;
	}

	public int getGrooming(){
		return grooming;
	}

	public int getHypoallergenic(){
		return hypoallergenic;
	}

	public int getIndoor(){
		return indoor;
	}

	public int getEnergyLevel(){
		return energyLevel;
	}

	public int getStrangerFriendly(){
		return strangerFriendly;
	}

	public String getReferenceImageId(){
		return referenceImageId;
	}

	public int getAffectionLevel(){
		return affectionLevel;
	}

	public int getCatFriendly(){
		return catFriendly;
	}

	public int getBidability(){
		return bidability;
	}
}