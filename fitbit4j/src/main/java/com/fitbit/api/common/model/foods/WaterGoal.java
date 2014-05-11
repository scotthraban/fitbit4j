package com.fitbit.api.common.model.foods;

import org.json.JSONException;
import org.json.JSONObject;

public class WaterGoal {

    private double goal;
    private String startDate;

    public WaterGoal() {
    }

    public WaterGoal(double goal, String startDate) {
        this.goal = goal;
		this.startDate = startDate;
    }

    public WaterGoal(JSONObject json) throws JSONException {
        goal = json.getDouble("goal");
        if (json.has("startDate")) {
        	startDate = json.getString("startDate");
        }
    }

    public double getGoal() {
        return goal;
    }
    
    public String getStartDate() {
		return startDate;
	}
}
