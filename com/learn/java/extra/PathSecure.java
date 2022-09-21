package com.learn.java.extra;
public class PathSecure {
		public static void main(String args[])
		{
			//Admin set path
			File admin = new File("home/image/admin");
			System.out.print("Filepath of admin : ");
			admin.getPath();
			//User try to change path
			File user = new File("home/image/user");
			System.out.print("Filepath of users : ");
			user.getPath();
			outer.inner n = new outer.inner();
		}
}
class File{
	private static String filePath;
	private static boolean val = true;
	File(String path)
	{
		if(val)
		{
			filePath = path;
		}
		val = false;
	}
	void getPath()
	{
		System.out.println(filePath);
	}
}
class outer{
	int a =10;
	static class inner{
		void n()
		{
			a = 20;
		}
	}
}