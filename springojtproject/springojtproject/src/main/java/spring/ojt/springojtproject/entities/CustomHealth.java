package spring.ojt.springojtproject.entities;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CustomHealth {

    private Map<String, Object> healthDetails;

    public void setHealthDetails(Map<String, Object> healthDetails) {
		this.healthDetails = healthDetails;
	}

	@JsonAnyGetter
    public Map<String, Object> getHealthDetails() {
        return this.healthDetails;
    }
}