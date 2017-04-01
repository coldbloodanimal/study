package com.ensemble.method;

public class MyList implements List {

//	public static void main(String[] args) {
//		String s = "org.org_name";
//		s = s.toUpperCase();
//		System.out.println(s);
//		System.out.println(s.substring(s.indexOf('.')));
//		// System.out.println(s.toLowerCase().substring(s.toLowerCase().indexOf("select")+6,s.toLowerCase().indexOf("from")));
//	}

	public void creatList(String s, String splitSymbl) {
		String ss = s;
		s = s.substring(s.toLowerCase().indexOf("SELECT") + 7,
				s.indexOf("FROM"));
		s = s.replace(" ", "");
		splitSymbl = splitSymbl.trim();
		String sn[] = s.split(splitSymbl);
		String[] resultdatasn=sn.clone();
//		for(String i:resultdatasn){
//			System.out.println(i);
//		}

		String jsonTitle = "\ts jsonTitle=\"";
		String tmphead = "\ts temp=";
		String tmp = "";

		System.out.println("ClassMethod List(sortField, sortDir, start, limit) As %String");
		System.out.println("{");
		System.out.println("\tn (sortField,sortDir,start,limit)");
		System.out.println("\ts sqlStr=\"" + ss + "\"");
		System.out.println("\ts result=##class(%Library.ResultSet).%New()");
		System.out.println("\td result.Prepare(sqlStr)");
		System.out.println("\td result.Execute()");
		System.out.println("");
		
		System.out.println("\ts count=0");
		System.out.println("\ts resultString=\"\"");
		System.out.println("\ts end=start+limit-1");
		System.out.println("");
		System.out.println("\ts json=##class(herp.comm.JsonObj).%New()");

		// 此处代码用于生成jsontitle
		for (int i = 0; i < sn.length; i++) {

//				String splitjsontitle = sn[i];
//				if (splitjsontitle.indexOf(".") != -1) {
//					splitjsontitle = splitjsontitle.substring(splitjsontitle
//							.indexOf(".") + 1);
//				}
				//System.out.println(sn[i]);
				//System.out.println(sn[i].substring(sn[i].lastIndexOf(".")+1));
				//sn[i].substring(sn[i].lastIndexOf(".")+1)  获得.后的位置
				//1如果有.获得字符.位置，截取.后的字符  sn[i].substring(sn[i].lastIndexOf(".")+1)
				//如果有_获得最后一个_后的字符 sn[i].substring(sn[i].lastIndexOf(".")+1).lastIndexOf("_")+1)
				//sn[i].substring(sn[i].lastIndexOf(".")+1).lastIndexOf("_")+1
				//sn[i].substring(sn[i].lastIndexOf(".")+1).substring(5)
				//sn[i].substring(sn[i].lastIndexOf(".")+1).substring(sn[i].substring(sn[i].lastIndexOf(".")+1).lastIndexOf("_")+1)

				sn[i]=sn[i].substring(sn[i].lastIndexOf(".")+1).substring(sn[i].substring(sn[i].lastIndexOf(".")+1).lastIndexOf("_")+1).toLowerCase();
				jsonTitle = jsonTitle + "^" + sn[i];
			
		}
		//System.out.println(jsonTitle.indexOf('^'));
		//System.out.println(jsonTitle.substring(jsonTitle.indexOf('^')+1).indexOf('^'));
		jsonTitle=jsonTitle.substring(0,jsonTitle.indexOf('^'))+"rowid"+jsonTitle.substring(jsonTitle.indexOf('^')+1+jsonTitle.substring(jsonTitle.indexOf('^')+1).indexOf('^'));
		System.out.println(jsonTitle + "\"");
		System.out.println("\tWhile(result.Next())");
		System.out.println("\t{");
		// 此处用于获取原始列值
		for (int i = 0; i < sn.length; i++) {
//			if (sn[i].indexOf(".") != -1) {
//				String tail = sn[i].substring(sn[i].indexOf(".") + 1);
//				System.out.println("\ts " + tail + "= result.Data(\"" + tail
//						+ "\")");
//			} else {
//				System.out.println("\ts " + sn[i] + "= result.Data(\"" + sn[i]
//						+ "\")");
//			}
			System.out.println("\ts " + sn[i] + "= result.Data(\"" + resultdatasn[i].substring(resultdatasn[i].indexOf(".")+1)+ "\")");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < sn.length; i++) {
			if (sn[i].indexOf(".") != -1) {
				sn[i] = sn[i].substring(sn[i].indexOf(".") + 1);
			}
			tmp = tmp + "_\"^\"_" + sn[i];
		}
		tmp = tmp.substring(5);
		tmp = tmphead + tmp;
		System.out.println(tmp);
		System.out.println("\ti (count>=start)&(count<=end) d");
		System.out.println("\t.d json.InsertRowData(temp)");
		System.out.println("\ts count=count+1");
		System.out.println("\t}");
		System.out.println("");
		System.out.println("\td result.Close()");
		System.out.println("\ts resultString = json.getJsonData(jsonTitle,count)");
		System.out.println("\tk json");
		System.out.println("\tq resultString");
		System.out.println("}");

	}

}
