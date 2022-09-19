package com.learn.java.extra;

public class PathSecure {
		public static void main(String args[])
		{
			File admin = new File("home/image/admin");
			System.out.print("Filepath of admin : ");
			admin.getPath();
			File user = new File("home/image/user");
			System.out.print("Filepath of users : ");
			user.getPath();
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