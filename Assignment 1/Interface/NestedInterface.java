interface FirstInt
{
	public void first_method();

		interface SecondInt
		{
			public void second_method();
		}
}

class NestedInterface implements FirstInt.SecondInt
{
	public void second_method()
	{
		System.out.println("This is Nested Interface");
	}
	public static void main(String[] args) {
		NestedInterface obj = new NestedInterface();//FirstInt.SecondInt obj = new NestedInterface()
		obj.second_method();
	}
}