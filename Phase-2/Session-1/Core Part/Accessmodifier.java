package com.simplilearn.demo;

public class Accessmodifier {
	
	public void methodPublic() {
		
		System.out.println("Public Method");
	}
	
	private void methodPrivate() {
		System.out.println("Private Method");
	}
	
	void methodDefault() {
		System.out.println("Default Method");
	}
	
	protected void methodProtected() {
		System.out.println("Protected Method");
	}
	
	
	public static void main(String[] args) {
		
		Accessmodifier obj= new Accessmodifier();
		
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
		obj.methodPublic();
		
	}

}
