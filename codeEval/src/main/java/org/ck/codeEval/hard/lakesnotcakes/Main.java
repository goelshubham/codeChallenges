package org.ck.codeEval.hard.lakesnotcakes;

import org.ck.codeChallengeLib.annotation.Solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Solution(id = 213, name = "Lakes, not cakes", description = "Count all lakes.", url = "https://www.codeeval.com/open_challenges/213/", category = "Hard challenges")
public class Main
{
	public static void main(String[] args) throws Exception
	{
		File file = new File(args[0]);
		try (BufferedReader buffer = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = buffer.readLine()) != null)
			{
				line = line.trim();
				String[] rows = line.split("\\|");

				String[] firstColumn = rows[0].trim().split(" ");

				String[][] map = new String[rows.length][firstColumn.length];

				for (int i = 0; i < rows.length; ++i)
				{
					String[] currentColum = rows[i].trim().split(" ");

					for (int j = 0; j < currentColum.length; ++j)
					{
						map[i][j] = currentColum[j];
					}
				}

				int lakes = 0;

				for (int i = 0; i < rows.length; ++i)
				{
					String[] currentColum = rows[i].trim().split(" ");

					for (int j = 0; j < currentColum.length; ++j)
					{
						if (map[i][j].equals("o"))
						{
							map = markLake(map, i, j, ++lakes);
						}
					}
				}

				System.out.println(lakes);
			}
		}
	}

	private static String[][] markLake(String[][] map, int i, int j, int lakes)
	{
		map[i][j] = String.valueOf(lakes);

		if (i > 0 && j > 0 && map[i - 1][j - 1].equals("o"))
		{
			map = markLake(map, i - 1, j - 1, lakes);
		}
		if (i > 0 && map[i - 1][j].equals("o"))
		{
			map = markLake(map, i - 1, j, lakes);
		}
		if (i > 0 && j < map[i].length - 1 && map[i - 1][j + 1].equals("o"))
		{
			map = markLake(map, i - 1, j + 1, lakes);
		}
		if (j > 0 && map[i][j - 1].equals("o"))
		{
			map = markLake(map, i, j - 1, lakes);
		}
		if (j < map[i].length - 1 && map[i][j + 1].equals("o"))
		{
			map = markLake(map, i, j + 1, lakes);
		}
		if (i < map.length - 1 && j > 0 && map[i + 1][j - 1].equals("o"))
		{
			map = markLake(map, i + 1, j - 1, lakes);
		}
		if (i < map.length - 1 && map[i + 1][j].equals("o"))
		{
			map = markLake(map, i + 1, j, lakes);
		}
		if (i < map.length - 1 && j < map[i].length - 1 && map[i + 1][j + 1].equals("o"))
		{
			map = markLake(map, i + 1, j + 1, lakes);
		}

		return map;
	}
}