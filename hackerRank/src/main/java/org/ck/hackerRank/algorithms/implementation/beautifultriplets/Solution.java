package org.ck.hackerRank.algorithms.implementation.beautifultriplets;

import java.util.Scanner;

@org.ck.codeChallengeLib.annotation.Solution(
		id = 10230,
		name = "Beautiful Triplets",
		url = "https://www.hackerrank.com/challenges/beautiful-triplets",
		category = "Algorithms",
		subCategory = "Implementation"
)
public class Solution
{
	public static void main(String[] args)
	{
		try (Scanner in = new Scanner(System.in))
		{
			int n = in.nextInt();
			int d = in.nextInt();

			int[] array = new int[n];
			for (int i = 0; i < n; ++i)
			{
				array[i] = in.nextInt();
			}

			int count = 0;
			for (int k = 2; k < n; ++k)
			{
				for (int j = 1; j < k; ++j)
				{
					if (array[k] - array[j] == d)
					{
						for (int i = 0; i < j; ++i)
						{
							if (array[j] - array[i] == d)
							{
								++count;
							}
						}
					}
				}
			}

			System.out.println(count);
		}
	}
}