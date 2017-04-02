package org.ck.hackerRank.specializedskills.sql.aggregation.populationdensitydifference;

@org.ck.codeChallengeLib.annotation.Solution(
		id = 30203006,
		name = "Population Density Difference",
		url = "https://www.hackerrank.com/challenges/population-density-difference",
		category = "SQL",
		subCategory = "Aggregation"
)
public class Solution
{
	public static final String SQL = "SELECT MAX(population) - MIN(population) FROM city;";
}