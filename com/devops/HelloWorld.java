package com.devops;
class HelloWorld
{
	public string sayHello(String parameter)
	{
		return "Hello there "+parameter;
	}
	public static void main(String args[]){
		HelloWorld hworld=new HelloWorld();
		System.out.println(hworld.sayHello("DevOps"));
	}
}