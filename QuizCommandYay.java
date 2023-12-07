abstract class QuizCommandYay implements theSum{
	public static void main(String[] args)
	{
		theSum s = (int x, int y) ->
		{
			int sum = 0;
			for(int j = x; j <= y; j++)
			{
				sum += j;
			}
			return sum;
		};


		int sumA = s.totalIt(Integer.parseInt(args[0]), Integer.parseInt(args[1]));


		System.out.println("The answer is "+sumA);
	}
}