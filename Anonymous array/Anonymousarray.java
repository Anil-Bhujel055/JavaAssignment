class AnonymousArray
{
	void show_array(int[] arr)
	{
		for(int i=arr)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		AnonymousArray obj = new AnonymousArray();
		obj.show_array(new int[] {1,2,3});
	}
}