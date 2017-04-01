package com.ensemble.method;

public class Util{

	private String word;
	
	public Util(String word) {
		super();
		this.word = word;
	}
	public Util() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//String word="adfk.saf_ksdfj_fdlsk";
		String word="sdf";
		Util u=new Util();

		System.out.println(u.clearword(word));
	}
	public String lastwordafterunderline(String word){
		word=word.substring(word.lastIndexOf("_")+1);
		return word;
	}
	public String lastwordafterunderline(){
		word=word.substring(word.lastIndexOf("_")+1);
		return word;
	}
	public String wordafterperiod(){
		word=word.substring(word.lastIndexOf(".")+1);
		return word;
	}
	public String wordafterperiod(String word){
		word=word.substring(word.lastIndexOf(".")+1);
		return word;
	}
	public String clearword(String word){
		word=word.substring(word.lastIndexOf("_")+1).substring(word.substring(word.lastIndexOf(".")+1).lastIndexOf("_")+1);
		return word;
	}
}
