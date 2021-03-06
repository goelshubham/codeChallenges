package org.ck.hackerRank.specializedskills.sql.basicselect.weatherobservationstation4;

@org.ck.codeChallengeLib.annotation.Solution(
		id = 30201009,
		name = "Weather Observation Station 4",
		url = "https://www.hackerrank.com/challenges/weather-observation-station-4",
		category = "SQL",
		subCategory = "Basic Select"
)
public class Solution
{
	public static final String SQL = "SELECT COUNT(*) - COUNT(DISTINCT(city)) FROM station;";
}